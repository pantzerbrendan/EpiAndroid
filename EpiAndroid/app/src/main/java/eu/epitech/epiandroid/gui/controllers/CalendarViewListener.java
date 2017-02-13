package eu.epitech.epiandroid.gui.controllers;

import android.app.Activity;
import android.content.Intent;
import android.widget.CalendarView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.PlanningDayActivity;
import eu.epitech.epiandroid.gui.UIcomponent.EpiAndroidToast;
import eu.epitech.epiandroid.gui.fragments.PlanningFragment;
import eu.epitech.epiandroid.utils.epitechAPI.ActionPlanning;
import eu.epitech.epiandroid.utils.epitechAPI.Request;

/**
 * Listener for a calendar element
 *
 * Created by pantze_b on 30/01/2015.
 */
public class CalendarViewListener implements CalendarView.OnDateChangeListener {

    private final PlanningFragment planningFragment;
    private final Activity activity;

    private String firstDate;
    private String secondDate;
    private boolean continueProgress;

    public CalendarViewListener(PlanningFragment planningFragment) {
        this.planningFragment = planningFragment;
        this.activity = planningFragment.getActivity();

        this.continueProgress = true;
    }

    /**
     * Called upon change of the selected day.
     *
     * @param view       The view associated with this listener.
     * @param year       The year that was set.
     * @param month      The month that was set [0-11].
     * @param dayOfMonth The day of the month that was set.
     */
    @Override
    public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
        this.createDates(year, month + 1, dayOfMonth);

        if (this.continueProgress) {
            Intent intent = new Intent(this.activity, PlanningDayActivity.class);
            intent.putExtra("FirstDate", this.firstDate);
            intent.putExtra("SecondDate", this.secondDate);

            ActionPlanning actionPlanning = new ActionPlanning(activity, this.firstDate, this.secondDate);


            Request rq = new Request(this.activity.getApplicationContext(), actionPlanning);
            List<String> names = new ArrayList<String>();
            List<String> values = new ArrayList<String>();

            names.add("token");
            values.add(planningFragment.getToken());
            names.add("start");
            values.add(this.firstDate);
            names.add("end");
            values.add(this.firstDate);
            rq.getRequest(names, values, activity.getApplicationContext().getString(R.string.url_planning));
        }
        continueProgress = true;
    }

    /**
     * Creates a date formatted as YYYY-MM-DD with year, month and day
     *
     * @param year
     * @param month
     * @param day
     */
    private void createDates(int year, int month, int day) {
        String dt = String.valueOf(year) + "-";
        dt += ((String.valueOf(month).length() == 1) ? ("0" + String.valueOf(month)) : (String.valueOf(month))) + "-";
        dt += ((String.valueOf(day).length() == 1) ? ("0" + String.valueOf(day)) : (String.valueOf(day)));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        this.firstDate = dt;
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(dt));
            c.add(Calendar.DATE, 1);
            this.secondDate = sdf.format(c.getTime());
        } catch (ParseException e) {
            EpiAndroidToast toast = new EpiAndroidToast(this.activity.getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT);
            toast.show();
            this.continueProgress = false;
        }
    }
}

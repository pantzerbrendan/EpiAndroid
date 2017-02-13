package eu.epitech.epiandroid.utils.epitechAPI;

import android.app.Activity;
import android.content.Intent;

import eu.epitech.epiandroid.gui.PlanningDayActivity;
import eu.epitech.epiandroid.utils.epitechAPI.actions.Action;

/**
 * Created by Tamer on 04/02/2015.
 */
public class ActionPlanning implements Action{

    private Activity activity;
    private String dateBegin;
    private String dateEnd;
    public ActionPlanning(Activity activity, String dateBegin, String dateEnd)
    {
        this.activity = activity;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
    }

    @Override
    public void execute(String response) {
        Intent intent = new Intent(this.activity, PlanningDayActivity.class);
        intent.putExtra("FirstDate", this.dateBegin);
        intent.putExtra("SecondDate", this.dateEnd);
        intent.putExtra("response", response);

        this.activity.startActivity(intent);
    }
}

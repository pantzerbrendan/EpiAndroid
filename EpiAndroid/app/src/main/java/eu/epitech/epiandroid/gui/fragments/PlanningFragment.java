package eu.epitech.epiandroid.gui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.HomeActivity;
import eu.epitech.epiandroid.gui.controllers.CalendarViewListener;

/**
 * A placeholder fragment containing a simple view.
 *
 * Created by pantze_b on 29/01/2015.
 */
public class PlanningFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static int layout;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlanningFragment newInstance(int sectionNumber) {
        PlanningFragment fragment = new PlanningFragment();
        fragment.setLayout(R.layout.fragment_planning);
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public PlanningFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(this.layout, container, false);
        return (rootView);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((HomeActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    /**
     * Called immediately after {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}
     * has returned, but before any saved state has been restored in to the view.
     * This gives subclasses a chance to initialize themselves once
     * they know their view hierarchy has been completely created.  The fragment's
     * view hierarchy is not however attached to its parent at this point.
     *
     * @param view               The View returned by {@link #onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)}.
     * @param savedInstanceState If non-null, this fragment is being re-constructed
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        CalendarView calendarView = (CalendarView) view.findViewById(R.id.calendar_view);
        calendarView.setOnDateChangeListener(new CalendarViewListener(this));
    }

    /**
     * Sets the layout
     * @param layout
     */
    public void setLayout(int layout) { PlanningFragment.layout = layout; }

    /**
     * Returns the token
     * @return
     */
    public String getToken()  { return (((HomeActivity)(this.getActivity())).getToken()); }
}
package eu.epitech.epiandroid.gui.views.holders;

import android.widget.TextView;

import eu.epitech.epiandroid.models.planningDate.PlanningJSON;

/**
 * Created by pantze_b on 04/02/2015.
 */
public class PlanningActivityHolder implements IViewHolder {

    private TextView activityViewTime;
    private TextView activityViewName;
    private TextView activityViewTeacher;
    private TextView activityViewRoom;

    private String token;
    private PlanningJSON planning;

    public PlanningActivityHolder() { }

    public void setActivityViewTime(TextView activityViewTime) { this.activityViewTime = activityViewTime; }
    public void setActivityViewName(TextView activityViewName) { this.activityViewName = activityViewName; }
    public void setActivityViewTeacher(TextView activityViewTeacher) { this.activityViewTeacher = activityViewTeacher; }
    public void setActivityViewRoom(TextView activityViewRoom) { this.activityViewRoom = activityViewRoom; }
    public void setToken(String token) { this.token = token; }
    public void setPlanning(PlanningJSON planning) { this.planning = planning; }

    public TextView getActivityViewTime() { return activityViewTime; }
    public TextView getActivityViewName() { return activityViewName; }
    public TextView getActivityViewTeacher() { return activityViewTeacher; }
    public TextView getActivityViewRoom() { return activityViewRoom; }
    public String getToken() { return token; }
    public PlanningJSON getPlanning() { return planning; }
}
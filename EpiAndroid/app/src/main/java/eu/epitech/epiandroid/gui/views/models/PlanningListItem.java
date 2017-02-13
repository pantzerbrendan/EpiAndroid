package eu.epitech.epiandroid.gui.views.models;

import eu.epitech.epiandroid.models.planningDate.PlanningJSON;

/**
 * Created by pantze_b on 03/02/2015.
 */
public class PlanningListItem implements IListItem {

    private String activityDate;
    private String activityName;
    private String activityTeacher;
    private String activityRoom;
    private String token;
    private PlanningJSON planning;

    public void setActivityDate(String activityDate) { this.activityDate = activityDate; }
    public void setActivityName(String activityName) { this.activityName = activityName; }
    public void setActivityTeacher(String activityTeacher) { this.activityTeacher = activityTeacher; }
    public void setActivityRoom(String activityRoom) { this.activityRoom = activityRoom; }
    public void setToken(String token) { this.token = token; }
    public void setPlanning(PlanningJSON planning) { this.planning = planning; }

    public String getActivityDate() { return activityDate; }
    public String getActivityName() { return activityName; }
    public String getActivityTeacher() { return activityTeacher; }
    public String getActivityRoom() { return activityRoom; }
    public String getToken() { return token; }
    public PlanningJSON getPlanning() { return planning; }
}
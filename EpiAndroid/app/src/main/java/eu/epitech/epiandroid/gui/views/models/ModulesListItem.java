package eu.epitech.epiandroid.gui.views.models;

/**
 * Created by Maxime on 04/02/2015.
 */
public class ModulesListItem implements IListItem {

    private String year;
    private String grade;
    private String name;
    private String credits;

    public void setYear(String year) {
        this.year = year;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCredits(String credits) {
        this.credits = credits;
    }

    public String getYear() { return year; }
    public String getGrade() {
        return grade;
    }
    public String getName() {
        return name;
    }
    public String getCredits() {
        return credits;
    }

    public ModulesListItem() {
    }
}

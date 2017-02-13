package eu.epitech.epiandroid.gui.views.holders;

import android.widget.TextView;

/**
 * Created by Maxime on 04/02/2015.
 */
public class ModulesViewHolder implements IViewHolder {

    private TextView year;
    private TextView grade;
    private TextView name;
    private TextView credits;

    public void setYear(TextView year) {
        this.year = year;
    }
    public void setGrade(TextView grade) {
        this.grade = grade;
    }
    public void setName(TextView name) {
        this.name = name;
    }
    public void setCredits(TextView credits) {
        this.credits = credits;
    }

    public TextView getYear() { return year; }
    public TextView getGrade() {
        return grade;
    }
    public TextView getName() {
        return name;
    }
    public TextView getCredits() {
        return credits;
    }

    public ModulesViewHolder() {
    }
}

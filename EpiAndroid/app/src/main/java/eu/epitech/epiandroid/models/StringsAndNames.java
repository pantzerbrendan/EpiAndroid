package eu.epitech.epiandroid.models;

/**
 * Created by Tamer on 02/02/2015.
 */

/**
 * Class used to send in one object a string and a content.
 */

public class StringsAndNames {
    public String values;
    public String names;

    public StringsAndNames(String name, String value)
    {
        this.values = value;
        this.names = name;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}

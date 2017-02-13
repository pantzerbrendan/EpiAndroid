package eu.epitech.epiandroid.utils.epitechAPI.actions;

import java.util.Arrays;
import java.util.List;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.EpiAndroidActivity;
import eu.epitech.epiandroid.utils.epitechAPI.Request;

/**
 * Created by Tamer on 02/02/2015.
 */
public class ActionHome implements Action {

    private String token;
    private EpiAndroidActivity activity;
    private String login;


    public ActionHome(String token, EpiAndroidActivity activity, String login)
    {
        this.token = token;
        this.activity = activity;
        this.login = login;
    }

    @Override
    public void execute(String response) {

        List<String> name = Arrays.asList("token", "login");
        List<String> value = Arrays.asList(this.token, login);
        ActionHomeURL actionHomeURL = new ActionHomeURL(this.token, response, activity);
        Request rq = new Request(activity, actionHomeURL);
        rq.getRequest(name, value, activity.getApplicationContext().getString(R.string.url_photo));

    }
}

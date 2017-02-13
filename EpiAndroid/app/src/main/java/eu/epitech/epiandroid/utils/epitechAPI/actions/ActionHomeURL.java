package eu.epitech.epiandroid.utils.epitechAPI.actions;

import java.util.Arrays;
import java.util.List;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.EpiAndroidActivity;
import eu.epitech.epiandroid.utils.epitechAPI.Request;

/**
 * Created by Tamer on 03/02/2015.
 */
public class ActionHomeURL implements Action {

    private String token;
    private EpiAndroidActivity activity;
    private String infoResp;

    public ActionHomeURL(String token, String infoResp, EpiAndroidActivity activity)
    {
        this.token = token;
        this.infoResp = infoResp;
        this.activity = activity;
    }

    @Override
    public void execute(String response) {

        ActionModule actionmodule = new ActionModule(token, infoResp, response, activity);

        List<String> name = Arrays.asList("token");
        List<String> value = Arrays.asList(this.token);
        Request rq = new Request(activity, actionmodule);
        rq.getRequest(name, value, activity.getApplicationContext().getString(R.string.url_modules));
    }
}

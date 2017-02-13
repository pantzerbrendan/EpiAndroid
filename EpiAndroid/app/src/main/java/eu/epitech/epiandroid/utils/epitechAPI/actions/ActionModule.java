package eu.epitech.epiandroid.utils.epitechAPI.actions;


import java.util.Arrays;
import java.util.List;
import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.EpiAndroidActivity;
import eu.epitech.epiandroid.utils.epitechAPI.Request;

/**
 * Created by Maxime on 04/02/2015.
 */
public class ActionModule implements Action {

    private String token;
    private String infoResp;
    private String urlResp;
    private EpiAndroidActivity activity;

    public ActionModule(String token, String infoResp, String urlResp, EpiAndroidActivity activity) {

        this.token = token;
        this.infoResp = infoResp;
        this.urlResp = urlResp;
        this.activity = activity;
    }

    @Override
    public void execute(String response) {
        ActionTrombi actionTrombi = new ActionTrombi(token, infoResp, urlResp, response, activity);
        List<String> name = Arrays.asList("token", "year", "location", "course", "promo", "offset");
        List<String> value = Arrays.asList(this.token, "2014", "FR/PAR"
                , "bachelor/classic", "tek3", "43");
        Request rq = new Request(activity, actionTrombi);
        rq.getRequest(name, value, activity.getApplicationContext().getString(R.string.url_trombi));
    }
}
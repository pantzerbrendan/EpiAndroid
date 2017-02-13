package eu.epitech.epiandroid.utils.epitechAPI.actions;

import eu.epitech.epiandroid.gui.EpiAndroidActivity;
import eu.epitech.epiandroid.gui.HomeActivity;
import eu.epitech.epiandroid.models.StringsAndNames;

/**
 * Created by Tamer on 04/02/2015.
 */
public class ActionTrombi implements Action {

    private String token;
    private String infoResp;
    private String urlResp;
    private String modules;
    private EpiAndroidActivity activity;

    public ActionTrombi(String token, String infoResp, String urlResp, String modules,EpiAndroidActivity activity) {
        this.token = token;
        this.infoResp = infoResp;
        this.urlResp = urlResp;
        this.activity = activity;
        this.modules = modules;
    }

    @Override
    public void execute(String response) {

    StringsAndNames token = new StringsAndNames("token", this.token);
    StringsAndNames infoResp = new StringsAndNames("response", this.infoResp);
    StringsAndNames infoUrl = new StringsAndNames("url", urlResp);
    StringsAndNames infoModule = new StringsAndNames("modules", modules);
    StringsAndNames listTrombi = new StringsAndNames("trombi", response);

    activity.changeActivity(activity,HomeActivity.class,true,token,infoResp,infoUrl,infoModule, listTrombi);
    }
}

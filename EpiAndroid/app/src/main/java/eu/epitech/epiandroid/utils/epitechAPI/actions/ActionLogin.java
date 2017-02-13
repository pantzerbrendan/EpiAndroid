package eu.epitech.epiandroid.utils.epitechAPI.actions;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.EpiAndroidActivity;
import eu.epitech.epiandroid.models.Token;
import eu.epitech.epiandroid.utils.epitechAPI.Request;

/**
 * Created by Tamer on 02/02/2015.
 */
public class ActionLogin implements Action {

    private EpiAndroidActivity activity;
    private String login;

    public ActionLogin( EpiAndroidActivity activity, String login)
    {
        this.activity = activity;
        this.login = login;
    }




    @Override
    public void execute(String response) {
        String token;


        ObjectMapper mapper = new ObjectMapper();
        try {
            Token tokenObject = mapper.readValue(response, Token.class);
            token = tokenObject.getToken();
            ActionHome actionHome = new ActionHome(token, activity, login);
            Request rq = new Request(activity, actionHome);
            List<String> name = Arrays.asList("token");
            List<String> value = Arrays.asList(token);
            rq.postRequest(name, value, activity.getApplicationContext().getString(R.string.url_infos));
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

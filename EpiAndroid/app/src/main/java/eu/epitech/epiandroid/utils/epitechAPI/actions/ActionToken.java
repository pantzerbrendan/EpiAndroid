package eu.epitech.epiandroid.utils.epitechAPI.actions;

import android.content.Context;
import android.widget.Toast;
import eu.epitech.epiandroid.gui.UIcomponent.EpiAndroidToast;

/**
 * Created by Tamer on 04/02/2015.
 */
public class ActionToken implements Action{

    Context context;

    public ActionToken(Context context)
    {
        this.context = context;
    }

    @Override
    public void execute(String response) {
        EpiAndroidToast toast = new EpiAndroidToast(context, "Token validé", Toast.LENGTH_SHORT);
        toast.show();
    }
}

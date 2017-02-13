package eu.epitech.epiandroid.gui.UIcomponent;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by pantze_b on 19/01/2015.
 */
public class EpiAndroidToast {

    private Toast toast = null;

    public EpiAndroidToast(Context context, String message, int duration) {
        this.toast = Toast.makeText(context, message, duration);
    }

    public void show() {
        this.toast.show();
    }

}

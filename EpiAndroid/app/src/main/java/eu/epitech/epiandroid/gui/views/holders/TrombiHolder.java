package eu.epitech.epiandroid.gui.views.holders;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hertzo_a on 04/02/2015.
 */
public class TrombiHolder implements IViewHolder {
    private TextView login;
    private TextView promo;
    private ImageView image;

    public TextView getLogin() {
        return login;
    }
    public TextView getPromo() {
        return promo;
    }
    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) { this.image = image; }
    public void setPromo(TextView promo) { this.promo = promo; }
    public void setLogin(TextView login) { this.login = login; }
}

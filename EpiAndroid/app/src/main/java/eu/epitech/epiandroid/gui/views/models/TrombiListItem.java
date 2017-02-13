package eu.epitech.epiandroid.gui.views.models;

/**
 * Created by hertzo_a on 04/02/2015.
 */
public class TrombiListItem implements  IListItem{

    private String urlImage;
    private String login;
    private String promo;

    public String getUrlImage() {
        return urlImage;
    }
    public String getLogin() {
        return login;
    }
    public String getPromo() {
        return promo;
    }

    public void setUrlImage(String urlImage) { this.urlImage = urlImage; }
    public void setPromo(String promo) { this.promo = promo; }
    public void setLogin(String login) { this.login = login; }
}

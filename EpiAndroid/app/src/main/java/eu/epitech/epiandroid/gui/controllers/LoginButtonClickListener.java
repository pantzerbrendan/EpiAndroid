package eu.epitech.epiandroid.gui.controllers;

import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.HomeActivity;
import eu.epitech.epiandroid.gui.LoginActivity;
import eu.epitech.epiandroid.gui.UIcomponent.EpiAndroidToast;
import eu.epitech.epiandroid.utils.epitechAPI.actions.ActionLogin;
import eu.epitech.epiandroid.utils.epitechAPI.Request;

/**
 * Created by pantze_b on 14/01/2015.
 */
public class LoginButtonClickListener implements View.OnClickListener {

    private final LoginActivity loginActivity;
    private final Context applicationContext;
    private final EditText loginFieldView;
    private final EditText passwordFieldView;

    private static final Pattern loginPattern = Pattern.compile("[a-z]{1,6}\\_[a-z0-9]{1}");


    public LoginButtonClickListener(LoginActivity loginActivity) {
        this.loginActivity = loginActivity;
        this.applicationContext = this.loginActivity.getApplicationContext();
        this.loginFieldView = this.loginActivity.getLoginView();
        this.passwordFieldView = this.loginActivity.getPasswordView();
    }

    /**
     * Return a localized string from the application's package's
     * default string table.
     *
     * @param resId Resource id for the string
     */
    public final String getString(int resId) {
        return (this.loginActivity.getResources().getString(resId));
    }

    /**
     * Called when a view has been clicked.
     *
     * @param view The view that was clicked.
     */
    @Override
    public void onClick(View view) {
        String loginText = this.loginFieldView.getText().toString();
        String passwordText = this.passwordFieldView.getText().toString();

        if (this.checkFields(loginText, passwordText)) {
                this.loginActivity.getLoginView().setError(null); // reset l'erreur du TextField du login
                this.loginActivity.getPasswordView().setError(null); // reset l'erreur du TextField du mot de passe
                List<String> names = new ArrayList<String>();
                List<String> values = new ArrayList<String>();

                names.add("login");
                values.add(loginText);
                names.add("password");
                values.add(passwordText);

                ActionLogin actionLogin = new ActionLogin(loginActivity, loginText);

                Request request = new Request(loginActivity, actionLogin);
                request.postRequest(names, values, applicationContext.getString(R.string.url_login));
            }
        }

    /**
     * Checks the login and password fields
     *
     * @param loginText
     * @param passwordText
     * @return
     */
    private boolean checkFields(String loginText, String passwordText) {

        View focusView = null;
        boolean canContinue = true;

        if (!checkLogin(loginText)) {
            focusView = (focusView == null) ? this.loginFieldView : focusView;
            canContinue = false;
        }
        if (!checkPassword(passwordText)) {
            focusView = (focusView == null) ? this.passwordFieldView : focusView;
            canContinue = false;
        }

        if (!canContinue) {
            focusView.requestFocus();
            return (false);
        }
        return (true);
    }

    /**
     * Checks if the login is correctly formatted and valid (see the regex)
     *
     * @param login
     * @return
     */
    private boolean checkLogin(String login) {
        if (!this.loginPattern.matcher(login).matches()) {
            this.loginFieldView.setError(this.getString(R.string.invalid_login));
            return (false);
        } else if (login.isEmpty()) {
            this.loginFieldView.setError(this.getString(R.string.required_field));
            return (false);
        }
        return (true);
    }

    /**
     * Checks if the password is valid
     *
     * @param password
     * @return
     */
    private boolean checkPassword(String password) {
        if (password.isEmpty()) {
            this.passwordFieldView.setError(this.getString(R.string.required_field));
            return (false);
        } else if (password.length() != 8) {
            this.passwordFieldView.setError(this.getString(R.string.invalid_password));
            return (false);
        }
        return (true);
    }
}

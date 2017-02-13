package eu.epitech.epiandroid.gui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.controllers.TokenValidationButtonListener;

/**
 * Created by pantze_b on 04/02/2015.
 */
public class TokenValidationActivity  extends Activity{

    /**
     * Called when the activity is starting.  This is where most initialization
     * should go: calling {@link #setContentView(int)} to inflate the
     * activity's UI, using {@link #findViewById} to programmatically interact
     * with widgets in the UI, calling
     * {@link #managedQuery(android.net.Uri, String[], String, String[], String)} to retrieve
     * cursors for data being displayed, etc.
     * <p/>
     * <p>You can call {@link #finish} from within this function, in
     * which case onDestroy() will be immediately called without any of the rest
     * of the activity lifecycle ({@link #onStart}, {@link #onResume},
     * {@link #onPause}, etc) executing.
     * <p/>
     * <p><em>Derived classes must call through to the super class's
     * implementation of this method.  If they do not, an exception will be
     * thrown.</em></p>
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in {@link #onSaveInstanceState}.  <b><i>Note: Otherwise it is null.</i></b>
     * @see #onStart
     * @see #onSaveInstanceState
     * @see #onRestoreInstanceState
     * @see #onPostCreate
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.setContentView(R.layout.validation_token_activity);

        String year = getIntent().getStringExtra("YEAR");
        String codeModule = getIntent().getStringExtra("MODULE");
        String codeInstance = getIntent().getStringExtra("INSTANCE");
        String codeActi = getIntent().getStringExtra("ACTIVITY");
        String codeEvent = getIntent().getStringExtra("EVENT");
        String token = getIntent().getStringExtra("TOKEN");

        Button validButton = (Button) findViewById(R.id.validate_button);
        validButton.setOnClickListener(new TokenValidationButtonListener(year, codeModule, codeInstance, codeActi, codeEvent, token));
        Button cancelButton = (Button) findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(new TokenValidationButtonListener(year, codeModule, codeInstance, codeActi, codeEvent, token));
    }
}

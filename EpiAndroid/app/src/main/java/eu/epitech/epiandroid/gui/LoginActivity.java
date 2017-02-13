package eu.epitech.epiandroid.gui;

import android.app.Activity;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.controllers.LoginButtonClickListener;
import eu.epitech.epiandroid.models.StringsAndNames;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends EpiAndroidActivity {

    public EditText getLoginView() {
        return ((EditText) findViewById(R.id.login_field));
    }
    public EditText getPasswordView() {
        return ((EditText) findViewById(R.id.password));
    }
    public CheckBox getCheckBox() { return ((CheckBox) findViewById(R.id.stay_connected_checkbox)); }

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

        setContentView(R.layout.activity_login);
        ((Button) findViewById(R.id.connection_button)).setOnClickListener(new LoginButtonClickListener(this));
        ((CheckBox) findViewById(R.id.stay_connected_checkbox)).setVisibility(CheckBox.INVISIBLE);
    }

    /**
     * Instantiate and return a new Loader for the given ID.
     *
     * @param i      The ID whose loader is to be created.
     * @param bundle Any arguments supplied by the caller.
     * @return Return a new Loader instance that is ready to start loading.
     */
    @Override
    public Loader<Cursor> onCreateLoader(int i, Bundle bundle) {
        return (null);
    }

    /**
     * Called when a previously created loader has finished its load.  Note
     * that normally an application is <em>not</em> allowed to commit fragment
     * transactions while in this call, since it can happen after an
     * activity's state is saved.  See {@link android.app.FragmentManager#beginTransaction()
     * FragmentManager.openTransaction()} for further discussion on this.
     * <p/>
     * <p>This function is guaranteed to be called prior to the release of
     * the last data that was supplied for this Loader.  At this point
     * you should remove all use of the old data (since it will be released
     * soon), but should not do your own release of the data since its Loader
     * owns it and will take care of that.  The Loader will take care of
     * management of its data so you don't have to.  In particular:
     * <p/>
     * <ul>
     * <li> <p>The Loader will monitor for changes to the data, and report
     * them to you through new calls here.  You should not monitor the
     * data yourself.  For example, if the data is a {@link android.database.Cursor}
     * and you place it in a {@link android.widget.CursorAdapter}, use
     * the {@link android.widget.CursorAdapter#CursorAdapter(android.content.Context,
     * android.database.Cursor, int)} constructor <em>without</em> passing
     * in either {@link android.widget.CursorAdapter#FLAG_AUTO_REQUERY}
     * or {@link android.widget.CursorAdapter#FLAG_REGISTER_CONTENT_OBSERVER}
     * (that is, use 0 for the flags argument).  This prevents the CursorAdapter
     * from doing its own observing of the Cursor, which is not needed since
     * when a change happens you will get a new Cursor throw another call
     * here.
     * <li> The Loader will release the data once it knows the application
     * is no longer using it.  For example, if the data is
     * a {@link android.database.Cursor} from a {@link android.content.CursorLoader},
     * you should not call close() on it yourself.  If the Cursor is being placed in a
     * {@link android.widget.CursorAdapter}, you should use the
     * {@link android.widget.CursorAdapter#swapCursor(android.database.Cursor)}
     * method so that the old Cursor is not closed.
     * </ul>
     *
     * @param loader The Loader that has finished.
     * @param data   The data generated by the Loader.
     */
    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) { }

    /**
     * Called when a previously created loader is being reset, and thus
     * making its data unavailable.  The application should at this point
     * remove any references it has to the Loader's data.
     *
     * @param loader The Loader that is being reset.
     */
    @Override
    public void onLoaderReset(Loader<Cursor> loader) { }

    /**
     * Function used to get the objects sent from previous activity.
     * Uses the parameter (@param name) to get the corresponding object.
     * If the name is incorrect, the return value of getParcelableExtra is null
     *
     * @param name Name of the object to get
     */
    @Override
    public void getParceleableObject(String name) {
        return ; // première activité => ne reçoit pas d'objet via Intent
    }

    @Override
    public void changeActivity(Activity currentActivity, Class nextActivityClass, boolean closeCurrentActivity, Object... objs) {
        Intent intent = new Intent(currentActivity, nextActivityClass);

       for (Object obj : objs) {
           if (obj instanceof StringsAndNames)
            intent.putExtra(((StringsAndNames) obj).getNames(), ((StringsAndNames) obj).getValues());
        }
        this.startActivity(intent);
        if (closeCurrentActivity) {
            currentActivity.finish();
        }
    }

    public ListView getDrawerList() { return (null); }
    public DrawerLayout getDrawerLayout() { return (null); }
    public String[] getMenuContent() { return (null); }

}




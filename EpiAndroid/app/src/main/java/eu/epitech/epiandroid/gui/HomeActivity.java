package eu.epitech.epiandroid.gui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.widget.DrawerLayout;
import android.widget.Toast;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.UIcomponent.EpiAndroidToast;
import eu.epitech.epiandroid.gui.controllers.callbacks.INavigationDrawerCallbacks;
import eu.epitech.epiandroid.gui.fragments.HomeFragment;
import eu.epitech.epiandroid.gui.fragments.PlanningFragment;
import eu.epitech.epiandroid.gui.fragments.ProfileFragment;
import eu.epitech.epiandroid.gui.fragments.TrombiFragment;
import eu.epitech.epiandroid.utils.epitechAPI.Url;
import eu.epitech.epiandroid.models.info.InfosJackson;

public class HomeActivity extends ActionBarActivity
        implements INavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;
    private String token;
    private String url;
    private String modules;
    private String trombi;

    private InfosJackson infosJacksons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        token = getIntent().getStringExtra("token");
        String url = getIntent().getStringExtra("url");
        String infoJSON = getIntent().getStringExtra("response");
        String modules = getIntent().getStringExtra("modules");
        trombi =  getIntent().getStringExtra("trombi");

        this.modules = modules;
        ObjectMapper mapper = new ObjectMapper();
        try {
            Url urlJSON = mapper.readValue(url, Url.class);
            this.url = urlJSON.getUrl();
            infosJacksons = mapper.readValue(infoJSON, InfosJackson.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        FragmentManager fragmentManager = getSupportFragmentManager();
        switch (position) {
            case 0: //accueil
                fragmentManager.beginTransaction()
                        .replace(R.id.container, HomeFragment.newInstance(position + 1))
                        .commit();
                break;
            case 1: // planning
                fragmentManager.beginTransaction()
                        .replace(R.id.container, PlanningFragment.newInstance(position + 1))
                        .commit();
                break;
            case 2: // profil
                fragmentManager.beginTransaction()
                        .replace(R.id.container, ProfileFragment.newInstance(position + 1))
                        .commit();
                break;
            case 3:
                fragmentManager.beginTransaction()
                        .replace(R.id.container, TrombiFragment.newInstance(position + 1))
                        .commit();
                break;
            case 4: // déconnexion
                Intent intent = new Intent(this, LoginActivity.class);
                this.startActivity(intent);
                this.finish();
                break;
        }
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_home);
                break;
            case 2:
                mTitle = getString(R.string.title_planning);
                break;
            case 3:
                mTitle = getString(R.string.title_profile);
                break;
            case 4:
                mTitle = getString(R.string.title_trombi);
                break;
            case 5:
                mTitle = getString(R.string.title_disconnect);
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.home, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public InfosJackson getInfos() {
        return infosJacksons;
    }
    public String getUrl() {
        return url;
    }
    public String getToken() { return token;}
    public String getModules() { return modules;}
    public String getTrombi() {return trombi;}
}

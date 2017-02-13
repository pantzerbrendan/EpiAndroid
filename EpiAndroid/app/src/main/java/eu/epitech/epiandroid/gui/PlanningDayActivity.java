package eu.epitech.epiandroid.gui;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.views.adapters.PlanningCustomAdapter;
import eu.epitech.epiandroid.gui.views.models.PlanningListItem;
import eu.epitech.epiandroid.models.planningDate.PlanningJSON;
import eu.epitech.epiandroid.models.planningDate.ProfInst;

/**
 * Created by pantze_b on 01/02/2015.
 */
public class PlanningDayActivity extends ListActivity {

    private String firstDate;
    private String secondDate;

    private ArrayList<PlanningListItem> listItems;
    private ArrayAdapter<String> adapter;
    private PlanningCustomAdapter customAdapter;

    /**
     * Called when the activity is starting.  This is where most initialization
     * should go: calling {@link #setContentView(int)} to inflate the
     * activity's UI, using {@link #findViewById} to programmatically interact
     * <p/>
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
        setContentView(R.layout.activity_planning_day);

        this.firstDate = this.getStringObject("FirstDate");
        this.secondDate = this.getStringObject("SecondDate");
        String response = this.getStringObject("response");

        System.out.println(response);


        TextView dayInformationsTextView = (TextView) this.findViewById(R.id.day_informations);
        dayInformationsTextView.setText(this.getString(R.string.planning) + " " + this.firstDate);

        this.listItems = new ArrayList<>();

        try {
            ObjectMapper mapper = new ObjectMapper();
            PlanningJSON planning[] = mapper.readValue(response, PlanningJSON[].class);

            for (PlanningJSON plan : planning) {
                if (plan.getRoom() != null) {
                    final PlanningListItem item = new PlanningListItem();
                    item.setActivityDate(plan.getStart());
                    item.setActivityName(plan.getActiTitle());
                    item.setActivityRoom(plan.getRoom().getCode());

                    String teachers = "";
                    for (ProfInst prof : plan.getProfInst()) {
                        teachers += prof.getTitle() + " (" + prof.getLogin() + ");";
                    }
                    teachers = teachers.endsWith(";") ? teachers.substring(0, teachers.length() - 1) : teachers;
                    item.setActivityTeacher(teachers);

                    this.listItems.add(item);
                }
            }
            this.customAdapter = new PlanningCustomAdapter(this, this.listItems, this.getResources());
            this.setListAdapter(this.customAdapter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Function used to get the strings sent from previous activity.
     * Uses the parameter (@param name) to get the corresponding string.
     * If the name is incorrect, the return value of getStringExtra is null
     *
     * @param name Name of the string to get
     */
    public String getStringObject(String name) {
        return (this.getIntent().getStringExtra(name).toString());
    }
}

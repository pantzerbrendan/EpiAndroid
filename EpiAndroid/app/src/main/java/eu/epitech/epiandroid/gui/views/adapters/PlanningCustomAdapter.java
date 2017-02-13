package eu.epitech.epiandroid.gui.views.adapters;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.TokenValidationActivity;
import eu.epitech.epiandroid.gui.views.holders.IViewHolder;
import eu.epitech.epiandroid.gui.views.holders.PlanningActivityHolder;
import eu.epitech.epiandroid.gui.views.models.PlanningListItem;

/**
 * Created by pantze_b on 04/02/2015.
 */
public class PlanningCustomAdapter extends CustomAdapter implements View.OnClickListener {

    private Activity activity;
    private String token;
    private String scholarYear;
    private String codeModule;
    private String codeInstance;
    private String codeActi;
    private String codeEvent;

    public PlanningCustomAdapter(Activity activity, ArrayList values, Resources res) {
        super(activity.getApplicationContext(), values, res);
        this.activity = activity;
        this.setLayout(R.layout.planning_activity_view);
    }

    /**
     * Get a View that displays the data at the specified position in the data set. You can either
     * create a View manually or inflate it from an XML layout file. When the View is inflated, the
     * parent View (GridView, ListView...) will apply default layout parameters unless you use
     * {@link android.view.LayoutInflater#inflate(int, android.view.ViewGroup, boolean)}
     * to specify a root view and to prevent attachment to the root.
     *
     * @param position    The position of the item within the adapter's data set of the item whose view
     *                    we want.
     * @param convertView The old view to reuse, if possible. Note: You should check that this view
     *                    is non-null and of an appropriate type before using. If it is not possible to convert
     *                    this view to display the correct data, this method can create a new view.
     *                    Heterogeneous lists can specify their number of view types, so that this View is
     *                    always of the right type (see {@link #getViewTypeCount()} and
     *                    {@link #getItemViewType(int)}).
     * @param parent      The parent that this view will eventually be attached to
     * @return A View corresponding to the data at the specified position.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        IViewHolder holder;

        if (convertView == null) {
            view = inflater.inflate(this.layout, null);

            holder = new PlanningActivityHolder();
            ((PlanningActivityHolder) holder).setActivityViewName((TextView) view.findViewById(R.id.activity_view_name));
            ((PlanningActivityHolder) holder).setActivityViewTime((TextView) view.findViewById(R.id.activity_view_time));
            ((PlanningActivityHolder) holder).setActivityViewTeacher((TextView) view.findViewById(R.id.activity_view_teacher));
            ((PlanningActivityHolder) holder).setActivityViewRoom((TextView) view.findViewById(R.id.activity_view_room));

            view.setTag(holder);
        } else {
            holder = (IViewHolder) view.getTag();
        }

        if (this.values.size() <= 0) {
            ((PlanningActivityHolder) holder).setActivityViewTime((TextView) view.findViewById(R.id.activity_view_time));
            ((PlanningActivityHolder) holder).getActivityViewTime().setText("No datas");
        } else {
            tempValues = null;
            tempValues = (PlanningListItem) this.values.get(position);

            ((PlanningActivityHolder) holder).getActivityViewTime().setText(((PlanningListItem) tempValues).getActivityDate());
            ((PlanningActivityHolder) holder).getActivityViewName().setText(((PlanningListItem) tempValues).getActivityName());
            ((PlanningActivityHolder) holder).getActivityViewRoom().setText(((PlanningListItem) tempValues).getActivityRoom());
            ((PlanningActivityHolder) holder).getActivityViewTeacher().setText(((PlanningListItem) tempValues).getActivityTeacher());

            ((PlanningActivityHolder) holder).setToken(((PlanningListItem) tempValues).getToken());
            ((PlanningActivityHolder) holder).setPlanning(((PlanningListItem) tempValues).getPlanning());
        }
        return (view);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        // token
        // scholar year
        // codemodule
        //codeinstance
        //codeacti
        //codeevent
        //tokenvalidationcode

        Intent intent = new Intent(this.activity, TokenValidationActivity.class);
        intent.putExtra("TOKEN", this.token);
        intent.putExtra("YEAR", this.scholarYear);
        intent.putExtra("MODULE", this.codeModule);
        intent.putExtra("INSTANCE", this.codeInstance);
        intent.putExtra("ACTIVITY", this.codeActi);
        intent.putExtra("EVENT", this.codeEvent);
        this.activity.startActivity(intent);
    }
}

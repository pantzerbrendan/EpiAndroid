package eu.epitech.epiandroid.gui.views.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import eu.epitech.epiandroid.gui.views.models.IListItem;

/**
 * Created by pantze_b on 03/02/2015.
 */
public abstract class CustomAdapter extends BaseAdapter {

    protected Context context;
    protected Resources resources;
    protected ArrayList values;
    protected int layout;

    protected IListItem tempValues = null;
    protected LayoutInflater inflater = null;

    public CustomAdapter(Context context, ArrayList values, Resources res) {
        this.resources = res;
        this.context = context;
        this.values = values;

        this.inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    /**
     * How many items are in the data set represented by this Adapter.
     *
     * @return Count of items.
     */
    @Override
    public int getCount() {
        return (this.values.size() <= 0 ? 1 : this.values.size());
    }

    /**
     * Get the data item associated with the specified position in the data set.
     *
     * @param position Position of the item whose data we want within the adapter's
     *                 data set.
     * @return The data at the specified position.
     */
    @Override
    public Object getItem(int position) {
        return position;
    }

    /**
     * Get the row id associated with the specified position in the list.
     *
     * @param position The position of the item within the adapter's data set whose row id we want.
     * @return The id of the item at the specified position.
     */
    @Override
    public long getItemId(int position) {
        return position;
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

        /* ***********

        CODE A COPIER COLLER DANS LA CLASSE QUI EXTEND CETTE CLASSE
        REMPLACER :
            - holder = new IViewHolder() {] par le Holder utilisé (ex. holder = new PlanningActivityHolder()
            - holder.set...(view), remplacer set... par le setter approprié
            - les autres valeurs par celles qui correspondent, faire analogie avec la classe PlanningCustomAdapter

        *********** */

//        IViewHolder holder;
//
//        if (convertView == null) {
//            view = inflater.inflate(this.layout, null);
//
//            holder = new IViewHolder() { };
//            holder.set...(view.findViewById(R.id.[...]));
//
//            view.setTag(holder);
//        } else {
//            holder = (IViewHolder) view.getTag();
//        }
//
//        if (this.values.size() <= 0) {
//            holder.[...].setText("No data");
//        } else {
//            tempValues = null;
//            tempValues = (IListItem) this.values.get(position);
//
//            holder.aValue.setText(tempValues.getAValue());
//        }
        return (view);
    }

    /**
     * Sets the layout
     * @param layout
     */
    public void setLayout(int layout) { this.layout = layout; }

}

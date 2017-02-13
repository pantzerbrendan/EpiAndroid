package eu.epitech.epiandroid.gui.views.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.views.holders.IViewHolder;
import eu.epitech.epiandroid.gui.views.holders.ModulesViewHolder;
import eu.epitech.epiandroid.gui.views.models.ModulesListItem;

/**
 * Created by Maxime on 04/02/2015.
 */
public class ModulesCustomAdapter extends CustomAdapter {


    public ModulesCustomAdapter(Context context, ArrayList values, Resources res) {
        super(context, values, res);
        this.setLayout(R.layout.modules_listview_item);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        IViewHolder holder;

        if (convertView == null) {
            view = inflater.inflate(this.layout, null);

            holder = new ModulesViewHolder();
            ((ModulesViewHolder)holder).setCredits((TextView) view.findViewById(R.id.module_credits));
               ((ModulesViewHolder)holder).setYear((TextView) view.findViewById(R.id.module_year));
               ((ModulesViewHolder)holder).setName((TextView) view.findViewById(R.id.module_name));
               ((ModulesViewHolder)holder).setGrade((TextView) view.findViewById(R.id.module_grade));
            view.setTag(holder);
        } else {
            holder = (IViewHolder) view.getTag();
        }

        if (this.values.size() <= 0) {
            ((ModulesViewHolder) holder).setCredits((TextView) view.findViewById(R.id.module_credits));
            ((ModulesViewHolder) holder).getCredits().setText("No datas");
        } else {
            tempValues = null;
            tempValues = (ModulesListItem) this.values.get(position);

            ((ModulesViewHolder)holder).getCredits().setText(((ModulesListItem) tempValues).getCredits());
            ((ModulesViewHolder)holder).getYear().setText(((ModulesListItem)tempValues).getYear());
            ((ModulesViewHolder)holder).getName().setText(((ModulesListItem)tempValues).getName());
            ((ModulesViewHolder)holder).getGrade().setText(((ModulesListItem)tempValues).getGrade());

        }
        return (view);
    }
}

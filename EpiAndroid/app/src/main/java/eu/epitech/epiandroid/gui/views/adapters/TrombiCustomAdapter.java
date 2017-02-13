package eu.epitech.epiandroid.gui.views.adapters;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.views.holders.IViewHolder;
import eu.epitech.epiandroid.gui.views.holders.TrombiHolder;
import eu.epitech.epiandroid.gui.views.models.TrombiListItem;
import eu.epitech.epiandroid.utils.ImageDownloaderTask;

/**
 * Created by Tamer on 04/02/2015.
 */
public class TrombiCustomAdapter extends CustomAdapter {
    public TrombiCustomAdapter(Activity activity, ArrayList values, Resources res) {
        super(activity.getApplicationContext(), values, res);
        this.setLayout(R.layout.trombi_layout);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        IViewHolder holder;

        if (convertView == null) {
            view = inflater.inflate(this.layout, null);

            holder = new TrombiHolder();
            ((TrombiHolder) holder).setLogin((TextView) view.findViewById(R.id.trombiNameText));
            ((TrombiHolder) holder).setPromo((TextView) view.findViewById(R.id.trombiTextPromo));
            ((TrombiHolder) holder).setImage((ImageView) view.findViewById(R.id.trombiImageView));
            view.setTag(holder);
        } else {
            holder = (IViewHolder) view.getTag();
        }

        if (this.values.size() <= 0) {
            ((TrombiHolder) holder).getLogin().setText("No datas");
            ((TrombiHolder) holder).getPromo().setText("No datas");
        } else {
            tempValues = null;
            tempValues = (TrombiListItem) this.values.get(position);

            ((TrombiHolder) holder).getLogin().setText(((TrombiListItem) tempValues).getLogin());
            ((TrombiHolder) holder).getPromo().setText(((TrombiListItem) tempValues).getPromo());
            ImageDownloaderTask task = new ImageDownloaderTask( ((TrombiHolder) holder).getImage(), this.context);

            task.execute(((TrombiListItem) tempValues).getUrlImage());
        }
        return view;
    }

}

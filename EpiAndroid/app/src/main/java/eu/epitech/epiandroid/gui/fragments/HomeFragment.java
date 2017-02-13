package eu.epitech.epiandroid.gui.fragments;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.HomeActivity;
import eu.epitech.epiandroid.utils.ImageDownloaderTask;
import eu.epitech.epiandroid.models.info.History;
import eu.epitech.epiandroid.models.info.InfosJackson;

/**
 * A placeholder fragment containing a simple view.
 * <p/>
 * Created by pantze_b on 29/01/2015.
 */
public class HomeFragment extends ListFragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static int layout;
    private Context context;

    ArrayAdapter<String> adapter;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static HomeFragment newInstance(int sectionNumber) {
        HomeFragment fragment = new HomeFragment();
        fragment.setLayout(R.layout.fragment_home);
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(this.layout, container, false);
        return (rootView);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.context = view.getContext();

        InfosJackson infosJackson = ((HomeActivity) this.getActivity()).getInfos();
        String token = ((HomeActivity) this.getActivity()).getToken();

        ImageView imageView = (ImageView) view.findViewById(R.id.user_picture);
        ImageDownloaderTask task = new ImageDownloaderTask(imageView, this.getActivity().getApplicationContext());

        task.execute(((HomeActivity) this.getActivity()).getUrl());

        ListView listView = (ListView) view.findViewById(android.R.id.list);
        TextView userLog = (TextView) view.findViewById(R.id.user_log_time);
        TextView userNetsoul = (TextView) view.findViewById(R.id.user_netsoul_status);
        TextView userCompleteName = (TextView) view.findViewById(R.id.user_complete_name);
        TextView userPromotion = (TextView) view.findViewById(R.id.user_promotion);

        int layoutSize = imageView.getLayoutParams().height + userLog.getLayoutParams().height + userNetsoul.getLayoutParams().height
                + userCompleteName.getLayoutParams().height + userPromotion.getLayoutParams().height + 575;
        this.resizeListView(listView, layoutSize);

        if (infosJackson != null) {
            String ip = infosJackson.getIp();
            if (ip != null)
                ip = this.getString(R.string.user_active) + ip + ")";
            else
                ip = this.getString(R.string.user_inactive);
            userCompleteName.setText(infosJackson.getInfos().getFirstname() + " " + infosJackson.getInfos().getLastname() + " - " + infosJackson.getInfos().getLogin());
            userLog.setText(this.getString(R.string.user_info_log_time) + " " + infosJackson.getCurrent().getActiveLog().toString() + "h");
            userPromotion.setText(this.getString(R.string.user_info_promotion) + " " + infosJackson.getInfos().getPromo() + " "
                    + this.getString(R.string.user_info_semester) + " " + infosJackson.getInfos().getSemester());
            userNetsoul.setText(ip);
            this.setMessageListView(infosJackson);
        }

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((HomeActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    /**
     * Sets the layout
     *
     * @param layout
     */
    public void setLayout(int layout) {
        HomeFragment.layout = layout;
    }

    /**
     * Initializes the listview
     *
     * @param infosJackson
     */
    private void setMessageListView(InfosJackson infosJackson) {
            List<History> historyList = infosJackson.getHistory();
            ArrayList<String> hist = new ArrayList<>();

            for (History history : historyList) {
                hist.add("\n" + android.text.Html.fromHtml(history.getTitle()) + "\n" + android.text.Html.fromHtml(history.getContent()) + "\n");
            }

            this.adapter = new ArrayAdapter<String>(this.context, R.layout.listview_textview, hist);
            this.setListAdapter(adapter);
        }

    /**
     * Resises the listview depending on the screen resolution
     * @param listView
     * @param layoutSize
     */
    private void resizeListView(ListView listView, int layoutSize) {
        Display display = this.getActivity().getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);

        ViewGroup.LayoutParams lp = listView.getLayoutParams();
        lp.height = size.y - layoutSize;
        listView.setLayoutParams(lp);
    }
}
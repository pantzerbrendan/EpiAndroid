package eu.epitech.epiandroid.gui.fragments;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;

import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.HomeActivity;
import eu.epitech.epiandroid.gui.views.adapters.ModulesCustomAdapter;
import eu.epitech.epiandroid.gui.views.models.ModulesListItem;
import eu.epitech.epiandroid.models.modules.Modules;
import eu.epitech.epiandroid.models.modules.ModulesHolder;
import eu.epitech.epiandroid.models.info.InfosJackson;
import eu.epitech.epiandroid.utils.ImageDownloaderTask;

/**
 * A placeholder fragment containing a simple view.
 * <p/>
 * Created by pantze_b on 29/01/2015.
 */
public class ProfileFragment extends ListFragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static int layout;
    private Context context;

    private ModulesCustomAdapter adapter;
    private ArrayList<ModulesListItem> listItems;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static ProfileFragment newInstance(int sectionNumber) {
        ProfileFragment fragment = new ProfileFragment();
        fragment.setLayout(R.layout.fragment_profile);
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public ProfileFragment() {
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
        String modulesJson = ((HomeActivity) this.getActivity()).getModules();

        modulesJson = modulesJson.replaceAll("modules:", "\"modules\":");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(modulesJson);
        ModulesHolder modules = null;
        try {
            modules = mapper.readValue(modulesJson, ModulesHolder.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        ImageView imageView = (ImageView) view.findViewById(R.id.profile_picture);
        ImageDownloaderTask task = new ImageDownloaderTask(imageView, this.getActivity().getApplicationContext());

        task.execute(((HomeActivity) this.getActivity()).getUrl());

        ListView listView = (ListView) view.findViewById(android.R.id.list);
        TextView userLog = (TextView) view.findViewById(R.id.profile_log_time);
        TextView userNetsoul = (TextView) view.findViewById(R.id.profile_netsoul_status);
        TextView userCompleteName = (TextView) view.findViewById(R.id.profile_complete_name);
        TextView userPromotion = (TextView) view.findViewById(R.id.profile_promotion);

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
        }

        this.listItems = new ArrayList<>();

        if (modules != null) {
            Modules[] mod = modules.getModules();
            for (Modules md : mod) {
                ModulesListItem item = new ModulesListItem();
                item.setCredits("Crédits : " + String.valueOf(md.getCredits()));
                item.setGrade("Grade obtenu : " + md.getGrade());
                item.setYear("Année courante du module : " + String.valueOf(md.getScolaryear()));
                item.setName("Module : " + md.getCodemodule() + " " + md.getTitle());

                this.listItems.add(item);
            }

            this.adapter = new ModulesCustomAdapter(this.getContext(), this.listItems, this.getResources());
            this.setListAdapter(this.adapter);
        }
    }

    /**
     * Sets the layout
     * @param layout
     */
    public void setLayout(int layout) {
        ProfileFragment.layout = layout;
    }

    /**
     * Returns the current context
     * @return
     */
    public Context getContext() {
        return (this.getView().getContext());
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
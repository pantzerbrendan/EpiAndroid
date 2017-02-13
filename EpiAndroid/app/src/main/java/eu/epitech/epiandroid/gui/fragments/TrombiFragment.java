package eu.epitech.epiandroid.gui.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.codehaus.jackson.map.ObjectMapper;
import java.io.IOException;
import java.util.ArrayList;
import eu.epitech.epiandroid.R;
import eu.epitech.epiandroid.gui.HomeActivity;
import eu.epitech.epiandroid.gui.views.adapters.TrombiCustomAdapter;
import eu.epitech.epiandroid.gui.views.models.TrombiListItem;
import eu.epitech.epiandroid.models.trombi.Item;
import eu.epitech.epiandroid.models.trombi.TrombiJSON;

/**
 * Created by pantze_b on 30/01/2015.
 */
public class TrombiFragment extends android.support.v4.app.ListFragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private static int layout;
    private TrombiCustomAdapter customAdapter;
    private ArrayList<TrombiListItem> listItems;

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static TrombiFragment newInstance(int sectionNumber) {
        TrombiFragment fragment = new TrombiFragment();
        fragment.setLayout(R.layout.fragment_trombi);
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public TrombiFragment() {
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

        listItems = new ArrayList<>();

        String trombiResp = ((HomeActivity)(this.getActivity())).getTrombi();
        ObjectMapper mapper = new ObjectMapper();
        TrombiJSON trombiJSON = null;
        try {
            trombiJSON = mapper.readValue(trombiResp, TrombiJSON.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < trombiJSON.getItems().size(); i++) {
            Item tiem = trombiJSON.getItems().get(i);
            final TrombiListItem item = new TrombiListItem();
            item.setLogin(tiem.getLogin());
            item.setPromo(tiem.getLocation());
            item.setUrlImage(tiem.getPicture());
            this.listItems.add(item);

        }

        this.customAdapter = new TrombiCustomAdapter(this.getActivity(), this.listItems, this.getResources());
        this.setListAdapter(this.customAdapter);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((HomeActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    /**
     * Sets the layout
     * @param layout
     */
    public void setLayout(int layout) { TrombiFragment.layout = layout; }
}
package eu.epitech.epiandroid.utils.epitechAPI;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import eu.epitech.epiandroid.gui.UIcomponent.EpiAndroidToast;
import eu.epitech.epiandroid.utils.epitechAPI.actions.Action;

/**
 * Created by hertzo_a on 02/02/2015.
 */
public class Request {

    private Context context;
    private Action action;

    public Request(Context context, Action action) {
        this.context = context;
        this.action = action;
    }

    public void postRequest(final List<String> argsName, final List<String> argsValue, String url) {
        final RequestQueue queue = Volley.newRequestQueue(context);
        final String superUrl = url;
        StringRequest postRequest = new StringRequest(com.android.volley.Request.Method.POST, url,
                new Response.Listener<String>() {

                    @Override
                    public void onResponse(String s) {
                        action.execute(s);
                    }
                },
                new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError volleyError) {
                        EpiAndroidToast toast = new EpiAndroidToast(context, volleyError.getMessage(), Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<>();
                for (int i = 0; i < argsName.size(); i++)
                    params.put(argsName.get(i), argsValue.get(i));
                return params;
            }
        };
        int timeout = 8000;
        RetryPolicy policy = new DefaultRetryPolicy(timeout, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
        postRequest.setRetryPolicy(policy);
        queue.add(postRequest);
    }

    public void getRequest(List<String> argsName, List<String> argsValue, String url) {
        try {

            final RequestQueue queue = Volley.newRequestQueue(context);
            for (int i = 0; i < argsName.size(); i++) {
                if (i == 0)
                    url += "?" + argsName.get(i) + "=" + argsValue.get(i);
                else
                    url += "&" + argsName.get(i) + "=" + argsValue.get(i);
            }
            StringRequest postRequest = new StringRequest(com.android.volley.Request.Method.GET, url,
                    new Response.Listener<String>() {
                        @Override
                        public void onResponse(String s) {
                            action.execute(s);
                        }
                    },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError volleyError) {
                            EpiAndroidToast toast = new EpiAndroidToast(context, volleyError.getMessage(), Toast.LENGTH_LONG);
                            toast.show();
                        }
                    }
            );
            int timeout = 8000;
            RetryPolicy policy = new DefaultRetryPolicy(timeout, 3, DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            postRequest.setRetryPolicy(policy);
            queue.add(postRequest);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

package com.vinzapp;

import android.content.Context;
import android.provider.SyncStateContract;
import android.util.Log;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class GetMeals {

    private Context context;
    private static String TAG = "GetMealsTAG";

    public GetMeals(Context context){


        this.context = context;
    }

    public void request() {

        JSONObject jsonBody = new JSONObject();
        try {
            jsonBody.put("date", "01.09.2020");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        Log.i(TAG, jsonBody.toString());

        final String url = "http://185.234.72.120:18000/nextMeal";

        RequestQueue requestQueue = Volley.newRequestQueue(context);

        JSONArray jsonArray = new JSONArray();

        MyJsonArrayRequest request=new MyJsonArrayRequest(Request.Method.POST, url, jsonBody, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.i(TAG, "" + response.toString());

                onFinishedParsing(response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                Log.i(TAG, "Error");
            }
        });

        requestQueue.add(request);
    }

    private void onFinishedParsing(JSONArray jsonArray){

        for (JSONObject jsonObject: jsonArray
             ) {

        }



    }


}

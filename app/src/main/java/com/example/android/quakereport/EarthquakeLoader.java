package com.example.android.quakereport;

import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.List;

/**
 * Created by albus on 18-Jul-17.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String url;
    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {

        if (this.url == null) {
            return null;
        }
        List<Earthquake> quakeList = QueryUtils.fetchEarthquakeData(this.url);

        return quakeList;
    }



}

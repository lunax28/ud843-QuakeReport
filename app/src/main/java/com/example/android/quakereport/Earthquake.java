package com.example.android.quakereport;

import static com.example.android.quakereport.R.id.date;

/**
 * Created by albus on 01-Jul-17.
 */

public class Earthquake {

    private Double mMagnitude;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String url;

    public Earthquake(Double magnitude, String location, long mTimeInMilliseconds, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }
}


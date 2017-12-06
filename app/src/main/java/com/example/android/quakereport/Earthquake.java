package com.example.android.quakereport;

/**
 * Created by subham on 15-10-2017.
 */

public class Earthquake {

    private String mPlace;
    private long mtime;
    private double mMagnitude;
    private String mUrl;

    public Earthquake(double magnitude,String place,long time,String url)
    {
        mMagnitude = magnitude;
        mPlace = place;
        mtime = time;
        mUrl = url;
    }

    public double getMagnitude()
    {
        return mMagnitude;
    }

    public String getPlace()
    {
        return mPlace;
    }

    public long getTime()
    {
        return mtime;
    }

    public String getUrl() {
        return mUrl;
    }
}

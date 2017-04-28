package com.example.android.newsapp;

/**
 * Created by sameetahmed on 4/27/17.
 */

public class News {

    private String mTitle;

    private String mSection;

    private String mURL;

    public News(String title, String section, String url) {
        mTitle = title;

        mSection = section;

        mURL = url;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setSection(String section) {
        mSection = section;
    }

    public String getSection() {
        return mSection;
    }

    public void setURL(String url) {
        mURL = url;
    }

    public String getURL() {
        return mURL;
    }
}

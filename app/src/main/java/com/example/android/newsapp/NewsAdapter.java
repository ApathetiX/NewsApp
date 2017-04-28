package com.example.android.newsapp;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sameetahmed on 4/28/17.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }


        // Find the earthquake at the given position in the list of earthquakes
        News currentNews = getItem(position);

        // Get the original section string from the news object
        String title = currentNews.getTitle();
        Log.v("NewsAdapter", title);

        // Find the TextView with view ID section
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        // Display the location of the current title in that TextView
        titleView.setText(title);

        //Get the original Author string from the book object
        String section = currentNews.getSection();

        // Find the TextView with view ID author
        TextView sectionView = (TextView) listItemView.findViewById(R.id.section);

        // Display the location of the current author in that TextView
        sectionView.setText(section);

        // Return the list item view that is now showing the appropriate data
        return listItemView;

    }

}

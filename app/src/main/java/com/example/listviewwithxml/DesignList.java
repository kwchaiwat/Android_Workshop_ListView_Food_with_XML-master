package com.example.listviewwithxml;

import android.app.Activity;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DesignList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] title;
    private final TypedArray imageId;

    public DesignList(Activity context,
                      String[] title, TypedArray imageId) {
        super(context, R.layout.my_row, title);
        this.context = context;
        this.title = title;
        this.imageId = imageId;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.my_row, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.txt);
        txtTitle.setText(title[position]);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        imageView.setImageResource(imageId.getResourceId(position, 0));
        return rowView;
    }
}

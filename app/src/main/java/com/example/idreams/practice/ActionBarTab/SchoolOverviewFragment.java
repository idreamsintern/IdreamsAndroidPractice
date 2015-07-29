package com.example.idreams.practice.ActionBarTab;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.idreams.practice.R;


public class SchoolOverviewFragment extends PageFragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_school_overview, container, false);
        TextView textView = (TextView) view.findViewById(R.id.text_school_overview_fragment);
        return view;
    }
}

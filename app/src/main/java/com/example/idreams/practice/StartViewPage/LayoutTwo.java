package com.example.idreams.practice.StartViewPage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.idreams.practice.R;

public class LayoutTwo extends Fragment {

    public static Fragment newInstance(Context context) {
        LayoutTwo f = new LayoutTwo();

        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_layout_two, null);
        return root;
    }

}

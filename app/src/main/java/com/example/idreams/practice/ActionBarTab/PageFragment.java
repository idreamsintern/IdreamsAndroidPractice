package com.example.idreams.practice.ActionBarTab;

import android.app.Activity;
import android.graphics.pdf.PdfDocument;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.idreams.practice.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link PageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PageFragment extends Fragment {
    private int mPageindex;

//    public static PageFragment newInstance(int page) {
//        Bundle args = new Bundle();
//        args.putInt(ARG_PAGE, page);
//        if(page==1) {
//            SchoolOverviewFragment f = new SchoolOverviewFragment();
//            f.setArguments(args);
//            return f;
//        }
//        else {
//            PageFragment fragment = new PageFragment();
//            fragment.setArguments(args);
//            return fragment;
//        }
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);
        TextView textView = (TextView) view.findViewById(R.id.fragmenttext);
        textView.setText("Fragment #" );
        return view;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("INFO", "MyFragment Destroy...");
    }
}

package com.example.idreams.practice.StartViewPage.ChooseSchool;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.idreams.practice.R;

import org.codepond.wizardroid.WizardStep;
import org.codepond.wizardroid.persistence.ContextVariable;

/**
 * Created by idreams on 2015/8/1.
 */
public class WizardStep2 extends WizardStep {

    private final String LOG_TAG="WizardStep2";
    private SeekBar seekBar;
    private TextView textView;
    //You must have an empty constructor for every step
    public WizardStep2() {
    }

    //Set your layout here
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_school_wizard2, container, false);
        seekBar = (SeekBar) v.findViewById(R.id.seekBar);
        textView = (TextView) v.findViewById(R.id.seekbar_text);
        textView.setText("TOFEL : "+seekBar.getProgress() + "/" + seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
                //拉動SeekBar停止時做的動作
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
                //開始拉動SeekBar時做的動作
            }

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                //SeekBar改變時做的動作
                String s = String.valueOf(progress);
                textView.setText("TOFEL : " + s + "/" + seekBar.getMax());
            }
        });
        return v;
    }

    @Override
    public void onExit(int exitCode) {
        switch (exitCode) {
            case WizardStep.EXIT_NEXT:
                break;
            case WizardStep.EXIT_PREVIOUS:
                break;
        }
    }
}
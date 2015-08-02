package com.example.idreams.practice.StartViewPage.ChooseSchool;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.idreams.practice.R;

import org.codepond.wizardroid.Wizard;
import org.codepond.wizardroid.WizardStep;
import org.codepond.wizardroid.persistence.ContextVariable;

public class WizardStep3 extends WizardStep {
    private final String LOG_TAG = "WizardStep1";
    //You must have an empty constructor for every step
    public WizardStep3() {
    }


    //Set your layout here
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_school_wizard3, container, false);

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

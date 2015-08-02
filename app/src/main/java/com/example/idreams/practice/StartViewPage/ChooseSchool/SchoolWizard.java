package com.example.idreams.practice.StartViewPage.ChooseSchool;

import android.util.Log;
import android.view.View;

import org.codepond.wizardroid.WizardFlow;
import org.codepond.wizardroid.layouts.BasicWizardLayout;

public class SchoolWizard extends BasicWizardLayout {

    private final String LOG_TAG= "SchoolWizard";
    public SchoolWizard() {
    }
    //You must override this method and create a wizard flow by
    //using WizardFlow.Builder as shown in this example
    @Override
    public WizardFlow onSetup() {
        WizardFlow flow1 = new WizardFlow.Builder() //then set the layout container for the steps.
                .addStep(WizardStep1.class)           //Add your steps in the order you want them
                .addStep(WizardStep2.class)           //to appear and eventually call create()
                .addStep(WizardStep3.class)
                .create();
        return  flow1;                        //to create the wizard flow.
    }

    /**
     * Triggered when the wizard is completed.
     * Overriding this method is optional.
     */
    @Override
    public void onWizardComplete() {
        //Do whatever you want to do once the Wizard is complete
        //in this case I just close the activity, which causes Android
        //to go back to the previous activity.
        getActivity().finish();
    }
    @Override
    public void onClick(View v) {
        super.onClick(v);
        if(v.getId() == org.codepond.wizardroid.R.id.wizard_next_button) {
            WizardActivity.WIZARD_PROGRESS+=WizardActivity.WIZARD_PROGRESS_PER;
        } else if(v.getId() == org.codepond.wizardroid.R.id.wizard_previous_button) {
            WizardActivity.WIZARD_PROGRESS-=WizardActivity.WIZARD_PROGRESS_PER;
        }
        Log.e(LOG_TAG,"onClick_WIZARD_PROGRESS = "+WizardActivity.WIZARD_PROGRESS);
        WizardActivity.mProgressbar.setProgress(WizardActivity.WIZARD_PROGRESS);
    }
}

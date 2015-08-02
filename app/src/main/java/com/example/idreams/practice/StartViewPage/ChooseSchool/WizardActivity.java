package com.example.idreams.practice.StartViewPage.ChooseSchool;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;

import com.example.idreams.practice.R;

public class WizardActivity extends AppCompatActivity {
    private final String LOG_TAG = "WizardActivity";
    static ProgressBar mProgressbar ;
    public static int WIZARD_PROGRESS=33;
    public static int WIZARD_PROGRESS_PER=33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wizard);
        mProgressbar = (ProgressBar)findViewById(R.id.progressBar);
        mProgressbar.setProgress(WIZARD_PROGRESS);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_wizard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

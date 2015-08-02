package com.example.idreams.practice.StartViewPage.ChooseSchool;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.idreams.practice.R;

import org.codepond.wizardroid.Wizard;
import org.codepond.wizardroid.WizardStep;
import org.codepond.wizardroid.persistence.ContextVariable;

import java.util.ArrayList;

public class WizardStep1 extends WizardStep {
    private final String LOG_TAG = "WizardStep1";
    ArrayList<Country> countryList;
    //You must have an empty constructor for every step
    public WizardStep1() {
    }


    //Set your layout here
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_school_wizard1, container, false);
        displayListView();
        // Create the adapter to convert the array to views
        CountryAdapter adapter = new CountryAdapter(getActivity(), countryList);
// Attach the adapter to a ListView
        ListView listView = (ListView) v.findViewById(R.id.countrylistView);
        listView.setAdapter(adapter);
        return v;
    }

    @Override
    public void onExit(int exitCode) {
        switch (exitCode) {
            case WizardStep.EXIT_NEXT:
                break;
            case WizardStep.EXIT_PREVIOUS:
                //Do nothing...
                break;
        }
    }
    private void displayListView() {
        //Array list of countries
        countryList = new ArrayList<Country>();
        Country country = new Country("Afghanistan",false);
        countryList.add(country);
        country = new Country("Albania",true);
        countryList.add(country);
        country = new Country("Algeria",false);
        countryList.add(country);
        country = new Country("American Samoa",true);
        countryList.add(country);
        country = new Country("Andorra",true);
        countryList.add(country);
        country = new Country("Angola",false);
        countryList.add(country);
        country = new Country("Anguilla",false);
        countryList.add(country);
        country = new Country("Afghanistan",false);
        countryList.add(country);
        country = new Country("Albania",true);
        countryList.add(country);
        country = new Country("Algeria",false);
        countryList.add(country);
        country = new Country("American Samoa",true);
        countryList.add(country);
        country = new Country("Andorra",true);
        countryList.add(country);
        country = new Country("Angola",false);
        countryList.add(country);
        country = new Country("Anguilla",false);
        countryList.add(country);

    }

    public class CountryAdapter extends ArrayAdapter<Country> {
        public CountryAdapter(Context context, ArrayList<Country> users) {
            super(context, 0, users);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            Country user = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.country_info, parent, false);
            }
            // Lookup view for data population
            CheckBox check = (CheckBox) convertView.findViewById(R.id.checkBox1);
            TextView tvHome = (TextView) convertView.findViewById(R.id.countryname);
            // Populate the data into the template view using the data object
            tvHome.setText(user.name);
            // Return the completed view to render on screen
            return convertView;
        }
    }


}

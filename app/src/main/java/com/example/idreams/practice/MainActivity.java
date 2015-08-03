package com.example.idreams.practice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.idreams.practice.ActionBarTab.ActionBarTab;
import com.example.idreams.practice.RecyclerView.MyRecyclerView;
import com.example.idreams.practice.StartViewPage.HomePage;
import com.example.idreams.practice.StartViewPage.Startviewpage;


public class MainActivity extends AppCompatActivity  {

    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.my_listView);
        String[] values = new String[] { "BarChartPractice",
                "SeekBar",
                "MyRecyclerView",
                "ActionBarTab",
                "SchoolTab",
                "RotateButton",
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // ListView Clicked item index
                int itemPosition = position;

                // ListView Clicked item value
                String itemValue = (String) mListView.getItemAtPosition(position);
                switch (itemPosition) {
                    case 0:
                        Intent intent1 =new Intent(getApplicationContext(),BarChartActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 =new Intent(getApplicationContext(),MySeekBar.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 =new Intent(getApplicationContext(),MyRecyclerView.class);
                        startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 =new Intent(getApplicationContext(),ActionBarTab.class);
                        startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 =new Intent(getApplicationContext(),HomePage.class);
                        startActivity(intent5);
                        break;
                    case 5:
                        Intent intent6 =new Intent(getApplicationContext(),RotateButton.class);
                        startActivity(intent6);
                        break;
                }
                // Show Alert
                Toast.makeText(getApplicationContext(),
                        "Position :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG)
                        .show();
                Log.e("onclick","Position :" + itemPosition + "  ListItem : " + itemValue);

            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

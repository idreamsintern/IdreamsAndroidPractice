package com.example.idreams.practice.StartViewPage;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.content.SharedPreferences;

import com.example.idreams.practice.R;


public class Startviewpage extends AppCompatActivity {
    private ViewPager _mViewPager;
    private ViewPagerAdapter _adapter;
    private Button _btn1,_btn2;
    private Button _btn_start;
    private String LOG_TAG="Startviewpage";
    private final int COLOR_SELECTED= 1;
    private final int COLOR_UNSELECTED= 2;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startviewpage);
        setUpView();
        setTab();
    }
    private void setUpView(){
        _mViewPager = (ViewPager) findViewById(R.id.viewPager);
        _adapter = new ViewPagerAdapter(getApplicationContext(),getSupportFragmentManager());
        _mViewPager.setAdapter(_adapter);
        _mViewPager.setCurrentItem(0);
        _btn_start = (Button) findViewById(R.id.btn_start);
        initButton();
    }
    private void setTab(){
        _mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener(){

            @Override
            public void onPageScrollStateChanged(int position) {}
            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {}
            @Override
            public void onPageSelected(int position) {
                // TODO Auto-generated method stub
                btnAction(position);
            }

        });

    }
    private void btnAction(int action){
        switch(action){
            case 0: setButton(_btn1,"1",40,40,COLOR_SELECTED); setButton(_btn2,"",20,20,COLOR_UNSELECTED);break;

            case 1: setButton(_btn2,"2",40,40,COLOR_SELECTED); setButton(_btn1,"",20,20,COLOR_UNSELECTED); break;
        }
    }
    private void initButton(){
        _btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences firstcheck = getSharedPreferences("StartView",0);
                firstcheck.edit().putBoolean("FirstCheck",false).commit();
                Intent intent = new Intent(Startviewpage.this,HomePage.class);
                startActivity(intent);
                Startviewpage.this.finish();
            }
        });
        _btn1=(Button)findViewById(R.id.btn1);
        _btn2=(Button)findViewById(R.id.btn2);
        setButton(_btn1,"1",40,40,COLOR_SELECTED);
        setButton(_btn2, "", 20, 20,COLOR_UNSELECTED);
        Log.e(LOG_TAG, "initButton");
    }
    private void setButton(Button btn,String text,int h, int w,int type){
        btn.setText(text);
        btn.setTextColor(Color.WHITE);
        if(type == COLOR_SELECTED)
            btn.setBackgroundResource(R.drawable.rounded_cell2);
        else
            btn.setBackgroundResource(R.drawable.rounded_cell1);
        ViewGroup.LayoutParams params = btn.getLayoutParams();
        params.width = w;//change the width size
        params.height= h;//change the hight size
        btn.setLayoutParams(params);
    }
}

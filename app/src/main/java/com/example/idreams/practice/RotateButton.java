package com.example.idreams.practice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class RotateButton extends AppCompatActivity implements View.OnClickListener{

    private Button btn,btn2;
    ImageView animationTarget;
    Animation animation1;
    Animation animation2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotate_button);

        btn = (Button) findViewById(R.id.testButton);
        btn.setOnClickListener(this);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_rotate_button, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {

            case R.id.testButton:
                animationTarget = (ImageView) this.findViewById(R.id.testImage);
                animation1 = AnimationUtils.loadAnimation(this, R.anim.rotate_around_center_point);
                btn.startAnimation(animation1);
                animation2 = AnimationUtils.loadAnimation(this, R.anim.translate_form_bottom);
                animationTarget.startAnimation(animation2);
                animationTarget.setVisibility(View.VISIBLE);
                animation2.setFillAfter(true);
                break;

            case R.id.button2:
                animation2.setFillAfter(false);
                animationTarget.setVisibility(View.INVISIBLE);
                Toast.makeText(getApplicationContext(),"BUTTON2",Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }



    }
}

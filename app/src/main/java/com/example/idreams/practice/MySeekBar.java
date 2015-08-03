package com.example.idreams.practice;


        import android.graphics.Color;
        import android.os.Bundle;
        import android.app.Activity;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.SeekBar;
        import android.widget.SeekBar.OnSeekBarChangeListener;
        import android.widget.TextView;
//
//        import com.gc.materialdesign.views.ButtonFloatSmall;
//        import com.gc.materialdesign.widgets.ColorSelector;
//        import com.gc.materialdesign.widgets.ColorSelector.OnColorSelectedListener;


public class MySeekBar extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_seek_bar);

        seekBar = (SeekBar) findViewById(R.id.my_seekbar);
        textView = (TextView) findViewById(R.id.seekbar_text);
        textView.setText(seekBar.getProgress() + "/" + seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

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

                //依照拉動seekBar時所回傳的值將背景顏色做改變
                //將回傳值轉型成字串後將字串設入EditText
                String s = String.valueOf(progress);
                textView.setText(s + "/" + seekBar.getMax());

                //另外兩個seekbar寫法相同小改即可
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_seek_bar, menu);
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

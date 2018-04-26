package com.zxq.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;

import com.zxq.comparedview.Paredview;

public class MainActivity extends AppCompatActivity {
    private Paredview paredview;
    private SeekBar seekBar;
    private int maxCount=500;
    private String botmText="2018LPL春季赛支持率";
    private String top_lable_unit="票";
    private int sussic_count=300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paredview=findViewById(R.id.paredview_1);
        seekBar=findViewById(R.id.seekbar);
        initView();
    }
    private void initView(){
        seekBar.setMax(maxCount);
        seekBar.setProgress(sussic_count);
        paredview.setMaxCount(maxCount);
        paredview.setSussicCount(sussic_count);
        paredview.setBottomText(botmText);
        paredview.setTop_lable_unit(top_lable_unit);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    sussic_count=progress;
                    paredview.upSussicCount(sussic_count);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}

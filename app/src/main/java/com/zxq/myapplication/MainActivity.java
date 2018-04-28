package com.zxq.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

import com.zxq.comparedview.Paredview;

public class MainActivity extends AppCompatActivity {
    private Paredview paredview;
    private int maxCount=500;
    private String botmText="2018LPL春季赛支持率";
    private String top_lable_unit="票";
    private int sussic_count=300;
    private Button rng_butn;
    private Button edg_butn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paredview=findViewById(R.id.paredview_1);
        rng_butn=findViewById(R.id.rng_butn);
        edg_butn=findViewById(R.id.edg_butn);
        initView();
    }
    private void initView(){
        paredview.setMaxCount(maxCount);
        paredview.setSussicCount(sussic_count);
        paredview.setBottomText(botmText);
        paredview.setTop_lable_unit(top_lable_unit);
        rng_butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sussic_count+=1;
                maxCount+=1;
                paredview.upSussicCount(sussic_count,maxCount);
            }
        });
        edg_butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maxCount+=1;
                paredview.upSussicCount(sussic_count,maxCount);
            }
        });

    }
}

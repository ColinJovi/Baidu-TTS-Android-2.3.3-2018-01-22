package com.baidu.tts.sample.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.baidu.tts.sample.MainActivity;
import com.baidu.tts.sample.R;
import com.baidu.tts.sample.SynthActivity;

/**
 * Created by LLQ on 2018/3/1.
 */

public class LaunchActivity  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载启动界面
        setContentView(R.layout.launch_main);
        Integer time = 2000;    //设置等待时间，单位为毫秒
        Handler handler = new Handler();
        //当计时结束时，跳转至主界面
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(LaunchActivity.this, SynthActivity.class));
                LaunchActivity.this.finish();
            }
        }, time);
    }

}




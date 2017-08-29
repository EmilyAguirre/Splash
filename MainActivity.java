package com.example.emilyaguirre.splash;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar prg;
    private int progStatus = 0;
    private Handler pHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prg=(ProgressBar)findViewById(R.id.progressBar);

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (progStatus < 100){
                    progStatus++;
                    android.os.SystemClock.sleep(3000);
//                    pHandler.post(new Runnable() {
//                        @Override
//                        public void run() {
//                            prg.setProgress(progStatus);
//                        }
//                    });
                }
            }
        }).start();
    }
}

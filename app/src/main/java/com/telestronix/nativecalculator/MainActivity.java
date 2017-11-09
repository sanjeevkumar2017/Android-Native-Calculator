package com.telestronix.nativecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tv_result;
    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = (TextView) findViewById(R.id.tv_result);
        tv_sub = (TextView) findViewById(R.id.tv_sub);
        System.loadLibrary("jni-calculator");
        tv_result.setText("" + addNum(500, 500));
        tv_sub.setText("" + subNum(500, 100));
    }

    public native int addNum(int num1, int num2);

    public native int subNum(int num1, int num2);

}

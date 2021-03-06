package com.demo.customview.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.demo.customview.R;
import com.demo.customview.aige.activity.AigeActivity;
import com.demo.customview.sloop.activity.CustomSloopMenuActivity;
import com.demo.customview.zhy.activity.CustomViewActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButton(R.id.btn_custom_view, CustomViewActivity.class);
        initButton(R.id.btn_custom_drawable, CustomShaderActivity.class);
        initButton(R.id.btn_custom_sloop_menu, CustomSloopMenuActivity.class);
        initButton(R.id.btn_custom_matrix_view, CustomMatrixActivity.class);
        initButton(R.id.btn_aige_custom_view, AigeActivity.class);
        initButton(R.id.btn_list_view_demo, ListViewDemoActivity.class);
        initButton(R.id.test_android_11, QzoneDualWarmActivity.class);


    }

    private void initButton(int resId, final Class clz) {
        findViewById(resId).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(clz);
            }
        });
    }

    private void startActivity(Class clz) {
        Intent intent = new Intent(MainActivity.this, clz);
        startActivity(intent);
    }

}

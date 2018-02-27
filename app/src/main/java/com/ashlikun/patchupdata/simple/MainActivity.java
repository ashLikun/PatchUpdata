package com.ashlikun.patchupdata.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ashlikun.patchupdata.library.PatchUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PatchUtils.test();
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        //Activity.TRIM_MEMORY_UI_HIDDEN

        Toast.makeText(this, "aa" + level, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }
}

package com.sreeram.layouttrial;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Linear extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_linear, menu);
        return true;
    }
    
}

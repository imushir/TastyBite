package com.example.mushirahmed.tastybite.slidingtabactivity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.mushirahmed.tastybite.R;

/**
 * Created by mushirahmed on 3/5/15.
 */
public class TastyBite extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getActionBar();
        actionBar.hide();
        setContentView(R.layout.tasty_bite);
        new Handler().postDelayed(new Runnable() {

            // Using handler with postDelayed called runnable run method

            @Override
            public void run() {
                Intent i = new Intent(TastyBite.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, 3*1000); // wait for 5 seconds

    }

}

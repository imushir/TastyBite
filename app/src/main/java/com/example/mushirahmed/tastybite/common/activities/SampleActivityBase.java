package com.example.mushirahmed.tastybite.common.activities;

/**
 * Created by mushirahmed on 2/5/15.
 */
import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
public class SampleActivityBase extends FragmentActivity {

    public static final String TAG = "SampleActivityBase";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
    }



    @Override
    protected  void onStart() {
        super.onStart();

    }


}
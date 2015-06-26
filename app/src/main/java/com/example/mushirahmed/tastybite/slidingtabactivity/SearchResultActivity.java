package com.example.mushirahmed.tastybite.slidingtabactivity;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by mushirahmed on 9/6/15.
 */
public class SearchResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        handleIntent(intent);
    }
    private void handleIntent(Intent intent)
    {
        if(Intent.ACTION_SEARCH.equals(intent.getAction()))
        {
            String query = intent.getStringExtra(SearchManager.QUERY);
        }
    }
}

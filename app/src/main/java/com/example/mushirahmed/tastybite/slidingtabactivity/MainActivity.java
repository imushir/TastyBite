package com.example.mushirahmed.tastybite.slidingtabactivity;

import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Context;
import android.database.MatrixCursor;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.view.MenuItem;
import android.widget.SearchView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

import com.example.mushirahmed.tastybite.R;
import com.example.mushirahmed.tastybite.common.activities.SampleActivityBase;

import java.util.List;


public class MainActivity extends SampleActivityBase {


    public static final String TAG = "MainActivity";

    // Whether the Log Fragment is currently shown


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getActionBar();
        if (savedInstanceState == null)
        {

            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            SlidingTabBasicFragment fragment = new SlidingTabBasicFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }

    }


  /* @Override
   public boolean onCreateOptionsMenu(Menu menu)
   {
       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.activity_main_actions, menu);

       //Associate searchable configuration with the SearchView
      *//* SearchManager searchManager = (SearchManager)getSystemService(Context.SEARCH_SERVICE);
       SearchView searchView = (SearchView)menu.findItem(R.id.action_search).getActionView();
       searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
       return true;
*//*
       String pkg = "com.example.mushirahmed.tastybite";
       String cls = "com.example.mushirahmed.tastybite.slidingtabactivity.MainActivity";
       ComponentName mycomponent = new ComponentName(pkg,cls);
       SearchManager searchManager =(SearchManager)getSystemService(Context.SEARCH_SERVICE);
       SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
       searchView.setSearchableInfo(searchManager.getSearchableInfo(mycomponent));
       return true;

   }*/

   /*@Override
    public boolean onOptionsItemSelected(MenuItem item)
   {
       switch (item.getItemId())
       {
           case R.id.action_search:
               Toast.makeText(getApplication(),"You have click on Search",Toast.LENGTH_LONG).show();
           default:
               return super.onOptionsItemSelected(item);

       }



    }
*/

}

package com.example.mushirahmed.tastybite.slidingtabactivity;

import android.annotation.TargetApi;
import android.app.SearchManager;
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

    private List<String> items;
    private Menu menu;
    public static final String TAG = "MainActivity";

    // Whether the Log Fragment is currently shown


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            SlidingTabBasicFragment fragment = new SlidingTabBasicFragment();
            transaction.replace(R.id.sample_content_fragment, fragment);
            transaction.commit();
        }
    }

  /* @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
   public boolean onCreateOptionsMenu(Menu menu)
   {


       MenuInflater inflater = getMenuInflater();
       inflater.inflate(R.menu.menu_main, menu);
       SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
       SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();

       searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
       searchView.setIconifiedByDefault(false);

       SearchView.OnQueryTextListener textChangeListener = new SearchView.OnQueryTextListener()
       {
           @Override
           public boolean onQueryTextChange(String newText)
           {
               // this is your adapter that will be filtered
               //adapter.getFilter().filter(newText);


               return true;
           }
           @Override
           public boolean onQueryTextSubmit(String query)
           {
               // this is your adapter that will be filtered
               //adapter.getFilter().filter(query);

               return true;
           }
       };
       searchView.setOnQueryTextListener(textChangeListener);



       return super.onCreateOptionsMenu(menu);


    }*/

   /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
       switch (item.getItemId()) {
           // action with ID action_refresh was selected
           case R.id.action_search:
               Toast.makeText(this, "Start Searching", Toast.LENGTH_SHORT)
                       .show();
               break;

           default:
               break;
       }

        return super.onOptionsItemSelected(item);
    }*/


}

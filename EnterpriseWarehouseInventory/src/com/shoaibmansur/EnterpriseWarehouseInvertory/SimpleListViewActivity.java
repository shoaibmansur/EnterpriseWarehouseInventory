package com.shoaibmansur.EnterpriseWarehouseInvertory;

import java.util.ArrayList;
import java.util.Arrays;

import com.shoaibmansur.EnterpriseWarehouseInvertory.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SimpleListViewActivity extends Activity {
  
  private ListView mainListView ;
  private ArrayAdapter<String> listAdapter ;
  
  /** Called when the activity is first created. */
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    
    // Find the ListView resource. 
    mainListView = (ListView) findViewById( R.id.mainListView );

    // Create and populate a List of author names.
    String[] planets = new String[] { "DEVELOPERS DETAILS", "---------------", "Muhammad Shoaib Mansur", "Phone #",
                                      "+1-626-XXX-XXXX", "Email Address: mshoaib.mansur@gmail.com", "---------------", "JXXX XXXR"};  
    ArrayList<String> planetList = new ArrayList<String>();
    planetList.addAll( Arrays.asList(planets) );
    
    // Create ArrayAdapter using the author list.
    listAdapter = new ArrayAdapter<String>(this, R.layout.simplerow, planetList);
    
    // Add more authors. If you passed a String[] instead of a List<String> 
    // into the ArrayAdapter constructor, you must not add more items. 
    // Otherwise an exception will occur.
    listAdapter.add( "Phone #" );
    listAdapter.add( "+1-626-XXX-XXXX" );//dummy number
    listAdapter.add( "Email address: XXXX@gmail.com" );
    listAdapter.add( "-" );
    listAdapter.add( "-" );
    
    // Set the ArrayAdapter as the ListView's adapter.
    mainListView.setAdapter( listAdapter );      
  }
 

}
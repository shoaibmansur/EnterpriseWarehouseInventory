package com.shoaibmansur.EnterpriseWarehouseInvertory;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
 
public class SearchProductActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
 
        TextView text = new TextView(this);
        text.setText("Sorry, but this section is still under-construction!");
        setContentView(text);
    }
}
package com.shoaibmansur.EnterpriseWarehouseInvertory;

import com.shoaibmansur.EnterpriseWarehouseInvertory.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainScreenActivity extends Activity{
	
	Button btnViewProducts;
	Button btnNewProduct;
	Button btnVideo;
	Button btnList;
	Button btnSearch;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);
		
		// Buttons
		btnViewProducts = (Button) findViewById(R.id.btnViewProducts);
		btnNewProduct = (Button) findViewById(R.id.btnCreateProduct);
		btnVideo = (Button) findViewById(R.id.btnVideo);
		btnList = (Button) findViewById(R.id.btnList);
		btnSearch = (Button) findViewById(R.id.btnSearch);
		
	
		
		// view products click event
		btnViewProducts.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching All products Activity
				Intent i = new Intent(getApplicationContext(), AllProductsActivity.class);
				startActivity(i);
				
			}
		});
		
		// view video click event
		btnVideo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching All products Activity
				Intent i = new Intent(getApplicationContext(), VideoplayerActivity.class);
				startActivity(i);
				
			}
		});
		
		// view list click event
		btnList.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching All products Activity
				Intent i = new Intent(getApplicationContext(), SimpleListViewActivity.class);
				startActivity(i);
				
			}
		});
		
		
		// view Search event
				btnSearch.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View view) {
						// Launching All products Activity
						Intent i = new Intent(getApplicationContext(), SearchProductActivity.class);
						startActivity(i);
						
					}
				});
	
		// view products click event
		btnNewProduct.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				// Launching create new product activity
				Intent i = new Intent(getApplicationContext(), NewProductActivity.class);
				startActivity(i);
				
			}
		});
		
		
	}
	 public void linkEmailClicked(View v)
	  {
	      Intent it = new Intent(Intent.ACTION_SEND);
	      String[] tos = {getString(R.string.emailAddress)};
	      it.putExtra(Intent.EXTRA_EMAIL, tos);
	      it.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.emailSubject));
	      it.setType("text/plain");
	      startActivity(it);
	  }

}




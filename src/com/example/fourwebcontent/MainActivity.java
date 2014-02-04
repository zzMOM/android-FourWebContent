package com.example.fourwebcontent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	static final String[] items = new String[]{"War of the Worlds", "Jabberwocky", "U of I at NASA", "Roundball" };
	ListView listView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		listView = (ListView)findViewById(R.id.webLists);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
		listView.setAdapter(adapter);
		listView.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// When clicked, show a toast with the TextView text
			    //Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
				Intent intent = null;
				switch(position){
				case 0:
					intent = new Intent(MainActivity.this, WarWorlds.class);
	                break;
				case 1:
					intent = new Intent(MainActivity.this, Jabberwocky.class);
	                break;
				case 2:
					intent = new Intent(MainActivity.this, UOFINASA.class);
	                break;
				case 3:
					intent = new Intent(MainActivity.this, Roundball.class);
	                break;
				}
				startActivity(intent);
				    
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

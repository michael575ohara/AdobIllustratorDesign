package com.example.adobillustratordesign;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	private GridView text_grid_view;
	private AITextAdapter ai_adapter;
	private List<String> textlist;
	private String init_string  = "This is an Adobe® Illustrator® File that was saved without PDF Content. To Place or open this le in other applications, "
			+ "it should be re-saved from Adobe Illustrator with the Create PDF Compatible File option turned on. This option is in the "
			+ "Illustrator Native Format" + "Options dialog box, which appears when saving an Adobe Illustrator le using the save As command.";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		text_grid_view = (GridView)findViewById(R.id.grid_view);
		
		textlist = new ArrayList<String>();
		
		for (int i = 0 ; i<8; i++){
			textlist.add(init_string);
		}
		
		ai_adapter = new AITextAdapter(this, textlist);
		text_grid_view.setAdapter(ai_adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

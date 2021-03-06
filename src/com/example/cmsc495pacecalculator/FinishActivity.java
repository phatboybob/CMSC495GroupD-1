package com.example.cmsc495pacecalculator;

import java.text.DecimalFormat;
import java.util.Date;

import com.example.cmsc495pacecalculator.R;
import com.example.cmsc495pacecalculator.R.layout;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_finish);
		
		TextView lapResults = (TextView) findViewById(R.id.textView1);
		lapResults.setText(RunActivity.tracker.getStats());
		TextView paceResults = (TextView) findViewById(R.id.textView2);
		DecimalFormat df = new DecimalFormat("#.##");
		paceResults.setText("Your pace was " + df.format(calculatePace(Double.valueOf(Double.valueOf(RunActivity.tracker.getLapsRan()) / 4), RunActivity.tracker.getLastTime())) + " mph.");
//		(
		
 Button button = (Button) findViewById(R.id.button1);
	    
	    
	    
	    button.setOnClickListener(new View.OnClickListener() {
	    	
	    	
	        public void onClick(View v) {
	        	
	        	
	        
	        	Intent myIntent = new Intent(FinishActivity.this, BeginActivity.class);
	        	//myIntent.putExtra("key", value); //Optional parameters
	        	FinishActivity.this.startActivity(myIntent);
	            
	        }
	        
	        
	    });
		
		
	}
	
	
	public static double calculatePace(double miles, long time){
		double pace = (miles / Double.valueOf((Double.valueOf(time) / (1000*60*60))));
		
		
		return pace;
	}
	
	
	
	
	
	
}
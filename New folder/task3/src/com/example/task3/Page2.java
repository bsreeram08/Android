package com.example.task3;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;

public class Page2 extends Activity {

	View v1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_page2);
		Bundle bu = getIntent().getExtras();
		String s1 = bu.getString("number");
		
		v1=(View)findViewById(R.id.view1);
		int data = Integer.parseInt(s1);
		if(data==0)
		{
			Toast.makeText(Page2.this, "google", Toast.LENGTH_LONG).show();
			v1.setBackgroundColor(Color.RED);
		}
		else if(data ==1)
		{
			Toast.makeText(Page2.this, "iphone", Toast.LENGTH_LONG).show();
			v1.setBackgroundColor(Color.GREEN);
		}
		else
		{
			Toast.makeText(Page2.this, "samsung", Toast.LENGTH_LONG).show();
			v1.setBackgroundColor(Color.BLUE);
		}
		
	}
	
}

package com.example.task3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.google);
        b2=(Button)findViewById(R.id.iphone);
        b3=(Button)findViewById(R.id.samsung);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1 =new Intent(MainActivity.this,Page2.class);
				Bundle bu = new Bundle();
				bu.putString("number", "0");
				i1.putExtras(bu);
				startActivity(i1);
			}
		});
		b2.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Intent i1 =new Intent(MainActivity.this,Page2.class);
						Bundle bu = new Bundle();
						bu.putString("number", "1");
						i1.putExtras(bu);
						startActivity(i1);
					}
				});
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i1 =new Intent(MainActivity.this,Page2.class);
				Bundle bu = new Bundle();
				bu.putString("number", "2");
				i1.putExtras(bu);
				startActivity(i1);
			}
		});
    }
    
    
}

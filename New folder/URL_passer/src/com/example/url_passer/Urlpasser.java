package com.example.url_passer;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Urlpasser extends Activity {

	Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urlpasser);
        b1=(Button)findViewById(R.id.Button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				
				Intent intent=new  Intent(Intent.ACTION_VIEW,Uri.parse("http:\\www.gmail.com"));
				startActivity(intent);
				
			}
		});
    }
    
}

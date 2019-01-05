package com.example.loginsave;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity2 extends Activity {
	Button b1;
	SharedPreferences sp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_activity2);
		b1=(Button)findViewById(R.id.Logout);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Activity2.this,Activity1.class);
				sp=getSharedPreferences("Validation",MODE_PRIVATE);
				Editor ed=sp.edit();
				ed.putString("pass","");
				ed.commit();
				startActivity(intent);
			}
		});
	}

}

package com.example.bundle;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	 Button B1;
	 EditText e1;
	 EditText e2;
    @Override
   
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        B1=(Button)findViewById(R.id.buttonpg1);
        e1=(EditText)findViewById(R.id.pg1_2);
        e2=(EditText)findViewById(R.id.pg1_1);
        B1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String val1 =e1.getText().toString();
				String val2 =e2.getText().toString();
				String data =val1+"  "+val2;
				Intent a =new Intent(MainActivity.this,Secondary.class);
				Bundle bu = new Bundle();
				//bu.putString("1", data);
				bu.putString("class1value", data);
				a.putExtras(bu);
				startActivity(a);
			}
		});
    }
    
}

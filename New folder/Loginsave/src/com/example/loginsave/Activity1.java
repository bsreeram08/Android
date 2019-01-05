package com.example.loginsave;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity1 extends Activity {
	EditText e1,e2;
	Button b1;
	SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1);
        sp=getSharedPreferences("Validation",MODE_PRIVATE);
        String data=sp.getString("pass","");
        if(data.equals("YES"))
        {
        	Intent intent = new Intent(Activity1.this,Activity2.class);
        	startActivity(intent);
        }
        else
	    {
	        b1=(Button)findViewById(R.id.button1);
	        b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
						e1=(EditText)findViewById(R.id.editText1);
						e2=(EditText)findViewById(R.id.editText2);
						String uname=e1.getText().toString();
						String pword=e2.getText().toString();
						if(uname.equals("Sreeram")&&pword.equals("Sreeram"))
						{
							Intent intent = new Intent(Activity1.this,Activity2.class);
							Editor ed=sp.edit();
							ed.putString("pass","YES");
							ed.commit();
							startActivity(intent);
						}
						else
						{
							Toast.makeText(Activity1.this, "INVALID DATA", Toast.LENGTH_LONG).show();
						}
				}
			});
	    }
    }
    
}

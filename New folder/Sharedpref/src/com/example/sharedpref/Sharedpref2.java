package com.example.sharedpref;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class Sharedpref2 extends Activity {
	EditText e1,e2;
	Button b1;
	SharedPreferences sp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sharedpref2);
		e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        sp=getSharedPreferences("shareddata", MODE_PRIVATE);
        b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				
				String val1=sp.getString("val1","");
				String val2=sp.getString("val2","");
				e1.append(val1);
				e2.append(val2);
				String data=val1+" "+val2;
				Toast.makeText(Sharedpref2.this,data, Toast.LENGTH_LONG).show();
			}
		});
	}
}
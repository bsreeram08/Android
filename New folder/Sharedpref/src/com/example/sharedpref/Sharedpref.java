package com.example.sharedpref;
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
public class Sharedpref extends Activity {
	EditText e1, e2;
	Button b1;
	SharedPreferences sp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sharedpref);
		e1 = (EditText) findViewById(R.id.editText1);
		e2 = (EditText) findViewById(R.id.editText2);
		b1 = (Button) findViewById(R.id.button1);
		sp = getSharedPreferences("shareddata", MODE_PRIVATE);
		// xml storage//filename and mode ie(read,write//default
		// mode_private//call editor class in onclick function
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Sharedpref.this, Sharedpref2.class);//everythinginsideintend
				String text1 = e1.getText().toString();
				String text2 = e2.getText().toString();
				String data = text1 + " " + text2;
				Toast.makeText(Sharedpref.this, data, Toast.LENGTH_LONG).show();
				Editor ed = sp.edit();
				ed.putString("val1", text1);
				ed.putString("val2", text2);
				ed.commit();
				startActivity(intent);
			}
		});
	}
}	
package com.example.colorchanger;

import java.util.Random;
import java.util.RandomAccess;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Changecolor extends Activity {

	Button b1;
	EditText e1;
	//View v1;
	LinearLayout v1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_changecolor);
		b1 = (Button) findViewById(R.id.button1);
		e1 = (EditText) findViewById(R.id.editText1);
		v1 = (LinearLayout) findViewById(R.id.LinearLayout1);
		b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String str = e1.getText().toString();
				// char[] data=str.toCharArray();
				// int i,color=0;
				// for(i=0;i<e1.length();i++)
				// {
				// char c = data[i];
				// //Toast.makeText(Changecolor.this, String.valueOf(c),
				// Toast.LENGTH_LONG).show();
				// int temp=c-' ';
				// color=(color*10)+temp;
				// }
				// if(color<=100)
				// {
				// v1.setBackgroundColor(Color.RED);
				// }
				// else if(color>100&&color<=200)
				// {
				// v1.setBackgroundColor(Color.GREEN);
				// }
				// else
				// {
				// v1.setBackgroundColor(Color.BLUE);
				// }
				int a = Integer.parseInt(str);
				if(a<=50){
					v1.setBackgroundColor(Color.rgb(255, a, 255-a));
				}
				else if(a<=100){
					v1.setBackgroundColor(Color.rgb(a, 255, 255-a));
				}
				else if(a<=150){
					v1.setBackgroundColor(Color.rgb(255-a, a, 255));
				}
				else if(a<=200){
					v1.setBackgroundColor(Color.rgb(a-10, a, 255-a));
				}
				else
					{
					v1.setBackgroundColor(Color.rgb(a-129, a, 255));
				}
			}
		});
	}

}

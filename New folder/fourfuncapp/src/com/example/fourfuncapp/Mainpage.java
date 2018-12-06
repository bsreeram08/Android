package com.example.fourfuncapp;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Mainpage extends Activity {
	Button sms, call, btnurl, logout;
	EditText phno, message, urldataval;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainpage);
		sms = (Button) findViewById(R.id.sms);
		call = (Button) findViewById(R.id.call);
		btnurl = (Button) findViewById(R.id.urlbtn);
		logout = (Button) findViewById(R.id.logout);
		phno = (EditText) findViewById(R.id.phonenumber);
		message = (EditText) findViewById(R.id.message);
		urldataval = (EditText) findViewById(R.id.urldata);
		sms.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String mobnumber = phno.getText().toString();
				String messagetxt=message.getText().toString();
				SmsManager smsManager=SmsManager.getDefault();
				//smsManager.sendTextMessage(destinationAddress, scAddress, text, sentIntent, deliveryIntent)
				smsManager.sendTextMessage(mobnumber, null, messagetxt, null, null);
				Toast.makeText(Mainpage.this,"sms send", Toast.LENGTH_SHORT).show();
				
				
			}
		});
		call.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String mobnumber = phno.getText().toString();
				Intent intent = new Intent(Intent.ACTION_CALL,Uri.parse("tel:"+mobnumber));
				startActivity(intent);
			}
		});
		btnurl.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				String data = urldataval.getText().toString();
				String urlstr = "https://" + data;
				Toast.makeText(Mainpage.this, data,Toast.LENGTH_LONG ).show();
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(urlstr));
				startActivity(intent);
			}
		});
		logout.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Toast.makeText(Mainpage.this, "Byee!", Toast.LENGTH_SHORT).show();
				finish();
			}
		});
	}

}

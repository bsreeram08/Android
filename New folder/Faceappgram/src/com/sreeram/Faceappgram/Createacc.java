package com.sreeram.Faceappgram;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Createacc extends Activity {
	Button Create,back_btn;
	int flag=0;
	EditText fname,lname,fullname,username,password,confirmpw,emailid,phoneno;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_createacc);
		fname=(EditText)findViewById(R.id.firstname);
		lname=(EditText)findViewById(R.id.lastname);
		fullname=(EditText)findViewById(R.id.fullname);
		username=(EditText)findViewById(R.id.usernamecreate);
		password=(EditText)findViewById(R.id.passwordcreate);
		confirmpw=(EditText)findViewById(R.id.confirmpassword);
		emailid=(EditText)findViewById(R.id.emailid);
		phoneno=(EditText)findViewById(R.id.phoneno);
		Create=(Button)findViewById(R.id.createaccsubmit);
		back_btn=(Button)findViewById(R.id.backtomain);
		
		fullname.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String firstname = fname.getText().toString();
				String lastname = lname.getText().toString();
				String full_name=firstname+" "+lastname;
				fullname.setText(full_name);
				
			}
		});
		Create.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String firstname = fname.getText().toString();
				String lastname = lname.getText().toString();
				String full_name=fullname.getText().toString();
				String u_name=username.getText().toString();
				String pword=password.getText().toString();
				String cnf_pword=confirmpw.getText().toString();
				String e_id=emailid.getText().toString();
				String phno=phoneno.getText().toString();
				
				if(firstname.isEmpty()&&lastname.isEmpty()&&full_name.isEmpty()&&u_name.isEmpty()&&pword.isEmpty()&&cnf_pword.isEmpty()&&e_id.isEmpty()&& phno.isEmpty())
				{
					String data="All Fields empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else if(firstname.isEmpty())
				{
					String data="First name Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else if(lastname.isEmpty())
				{
					String data="Last name Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();	
				}
				else if(full_name.isEmpty())
				{
					String data="Full name Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else if(u_name.isEmpty())
				{
					String data="Username Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else if(pword.isEmpty())
				{
					String data="Password Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else if(cnf_pword.isEmpty())
				{
					String data="Confirm Password Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else if(e_id.isEmpty())
				{
					String data="Email Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else if(phno.isEmpty())
				{
					String data="Phone number Field empty!";
					Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
				}
				else
				{
					if(phno.length()<10)
					{
						String data="Phone number less than 10 Numbers!";
						Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
					}
					else if(u_name.length()<8)
					{
						String data="Username less than 8 Characters!";
						Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
					}
					else if(pword.length()<8)
					{
						String data="Password Weak!";
						Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
					}
					else
					{
						String data="Created Sucessfully!";
						Toast.makeText(Createacc.this,data,Toast.LENGTH_LONG).show();
						flag=1;
					}
				}
			}
		});
		back_btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String u_name=username.getText().toString();
				String pword=password.getText().toString();
				if(flag==1)
				{
					Intent loginpg =new Intent(Createacc.this,Login.class);
					Bundle b1 = new Bundle();
					b1.putString("uname",u_name);
					b1.putString("password",pword);
					loginpg.putExtras(b1);
					startActivity(loginpg);
				}
				else
				{
					Intent createpage = new Intent(Createacc.this,Login.class);
					startActivity(createpage);
				}
			}
		});
	}


}

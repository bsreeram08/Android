package com.sreeram.Faceappgram;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {

	EditText username;
    EditText password;
    Intent createpage;
    Button submit_btn;
    Button createaccbtn;
    TextView forgotpw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);
        createaccbtn=(Button)findViewById(R.id.createaccbutton);
        submit_btn=(Button)findViewById(R.id.submit);
        forgotpw=(TextView)findViewById(R.id.forgotpassword);
        submit_btn.setOnClickListener(new OnClickListener()
        {
        	@Override
			public void onClick(View arg0) {
        		
 				// TODO Auto-generated method stub
				String uname=username.getText().toString();
				String pw=password.getText().toString();
				Bundle bu = getIntent().getExtras();
				String username = bu.getString("uname");
				String passowrd = bu.getString("password");
				if(uname.isEmpty()&&pw.isEmpty())
				{
					String data="Username and Password empty!";
					Toast.makeText(Login.this,data,Toast.LENGTH_LONG).show();
				}
				else if(uname.isEmpty())
				{
					String data="Username field empty!";
					Toast.makeText(Login.this,data,Toast.LENGTH_LONG).show();
				}
				else if(pw.isEmpty())
				{
					String data="Password field empty!";
					Toast.makeText(Login.this,data,Toast.LENGTH_LONG).show();
				}
				else if((uname.equals("Sreeram08")||uname.equals(username))&&(pw.equals("qwerty")||pw.equals(passowrd)))
				{
					String data="Login Sucessful!";
					Toast.makeText(Login.this,data,Toast.LENGTH_LONG).show();
				}
				else
				{
					String data="Username or Password Doesn't match.";
					Toast.makeText(Login.this,data,Toast.LENGTH_LONG).show();
				}
				
			}
        });
        forgotpw.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent forgotpwpage = new Intent(Login.this,Forgotpwpage.class);
				startActivity(forgotpwpage);
			}
		});
        createaccbtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent createpage = new Intent(Login.this,Createacc.class);
				startActivity(createpage);
				
			}
		});
        
    }
    
    
}

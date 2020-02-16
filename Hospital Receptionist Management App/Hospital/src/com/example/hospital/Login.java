package com.example.hospital;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends Activity {
	TextView log,sin,lgsin,lgfop;
	LinearLayout logi,sign;
	EditText logpass,logmail;
	Button login;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_login);

		//edit text declaration
		logmail=(EditText)findViewById(R.id.lguser);
		logpass=(EditText)findViewById(R.id.lgpass);
		
		
		//button declaration
		login=(Button)findViewById(R.id.lgsinin);
		
		
		
		//login button functions
		login.setOnClickListener(new View.OnClickListener() {
					
		@Override
		public void onClick(View arg0) {
		// TODO Auto-generated method stub
			String name=logmail.getText().toString();
			String pass=logpass.getText().toString();
			
			if((name.equals("USERNAME"))&&(pass.equals("PASSWORD")))
			{
				Toast.makeText(Login.this,"Login Successful",Toast.LENGTH_LONG).show();
				Intent ne=new Intent(Login.this,Appear_act.class);
				startActivity(ne);
			}
			else
			{
				Toast.makeText(Login.this,"Login failed",Toast.LENGTH_LONG).show();
			}
						
		 }
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}

}

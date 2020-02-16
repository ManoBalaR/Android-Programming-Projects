package com.example.hospital;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Register_patient extends Activity {
	EditText pid,nam,ag,pnum,hei,wei,blo;
	Button regi;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_register_patient);
		pid=(EditText)findViewById(R.id.patid);
		nam=(EditText)findViewById(R.id.patname);
		ag=(EditText)findViewById(R.id.patage);
		pnum=(EditText)findViewById(R.id.patmobile);
		hei=(EditText)findViewById(R.id.patheight);
		wei=(EditText)findViewById(R.id.patweight);
		blo=(EditText)findViewById(R.id.patbloodgrp);
		regi=(Button)findViewById(R.id.patregiser);
		
		
		regi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				String sid=pid.getText().toString();
				String sname=nam.getText().toString();
				String sage=ag.getText().toString();
				String snumber=pnum.getText().toString();
				String sheight=hei.getText().toString();
				String sweight=wei.getText().toString();
				String sbloodgrp=blo.getText().toString();
				int paid=Integer.parseInt(sid);
				if(paid==1)
				{
					SharedPreferences sp21=getSharedPreferences("register1",MODE_PRIVATE);
					SharedPreferences.Editor edsp21=sp21.edit();
					
					edsp21.putString("patid",sid);
					edsp21.putString("patname",sname);
					edsp21.putString("patage",sage);
					edsp21.putString("patnumber",snumber);
					edsp21.putString("patheight",sheight);
					edsp21.putString("patweight",sweight);
					edsp21.putString("patbloodgrp",sbloodgrp);
					
					edsp21.commit();
				}
				else if(paid==2)
				{
					SharedPreferences sp2=getSharedPreferences("register",MODE_PRIVATE);
					SharedPreferences.Editor edsp2=sp2.edit();
					
					edsp2.putString("patid",sid);
					edsp2.putString("patname",sname);
					edsp2.putString("patage",sage);
					edsp2.putString("patnumber",snumber);
					edsp2.putString("patheight",sheight);
					edsp2.putString("patweight",sweight);
					edsp2.putString("patbloodgrp",sbloodgrp);
					
					edsp2.commit();
				}
				else if(paid==3)
				{
					SharedPreferences sp3=getSharedPreferences("register3",MODE_PRIVATE);
					SharedPreferences.Editor edsp3=sp3.edit();
					
					edsp3.putString("patid",sid);
					edsp3.putString("patname",sname);
					edsp3.putString("patage",sage);
					edsp3.putString("patnumber",snumber);
					edsp3.putString("patheight",sheight);
					edsp3.putString("patweight",sweight);
					edsp3.putString("patbloodgrp",sbloodgrp);
					
					edsp3.commit();
					
				}
				else if(paid==4)
				{
					SharedPreferences sp4=getSharedPreferences("register4",MODE_PRIVATE);
					SharedPreferences.Editor edsp4=sp4.edit();
					
					edsp4.putString("patid",sid);
					edsp4.putString("patname",sname);
					edsp4.putString("patage",sage);
					edsp4.putString("patnumber",snumber);
					edsp4.putString("patheight",sheight);
					edsp4.putString("patweight",sweight);
					edsp4.putString("patbloodgrp",sbloodgrp);
					
					edsp4.commit();
					
				}
				else if(paid==5)
				{
					SharedPreferences sp5=getSharedPreferences("register5",MODE_PRIVATE);
					SharedPreferences.Editor edsp5=sp5.edit();
					
					edsp5.putString("patid",sid);
					edsp5.putString("patname",sname);
					edsp5.putString("patage",sage);
					edsp5.putString("patnumber",snumber);
					edsp5.putString("patheight",sheight);
					edsp5.putString("patweight",sweight);
					edsp5.putString("patbloodgrp",sbloodgrp);
					
					edsp5.commit();

				}
				
				else if(paid==6)
				{
					SharedPreferences sp6=getSharedPreferences("register5",MODE_PRIVATE);
					SharedPreferences.Editor edsp6=sp6.edit();
					
					edsp6.putString("patid",sid);
					edsp6.putString("patname",sname);
					edsp6.putString("patage",sage);
					edsp6.putString("patnumber",snumber);
					edsp6.putString("patheight",sheight);
					edsp6.putString("patweight",sweight);
					edsp6.putString("patbloodgrp",sbloodgrp);
					
					edsp6.commit();
					
					
				}
				else
				{
				
				SharedPreferences sp7=getSharedPreferences("register6",MODE_PRIVATE);
				SharedPreferences.Editor edsp7=sp7.edit();
				
				edsp7.putString("patid",sid);
				edsp7.putString("patname",sname);
				edsp7.putString("patage",sage);
				edsp7.putString("patnumber",snumber);
				edsp7.putString("patheight",sheight);
				edsp7.putString("patweight",sweight);
				edsp7.putString("patbloodgrp",sbloodgrp);
				
				edsp7.commit();
				}
				
				Intent ne=new Intent(Register_patient.this,Appear_act.class);
				startActivity(ne);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_register_patient, menu);
		return true;
	}

}

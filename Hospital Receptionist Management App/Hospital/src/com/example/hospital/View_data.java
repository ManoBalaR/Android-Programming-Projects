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
import android.widget.Toast;

public class View_data extends Activity {
	EditText pid,nam,ag,pnum,hei,wei,blo,dat,vital,diseses,precp;
	Button back1;
	String snam11,snam1,snam2,snam3,snam4,snam5,m1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_view_data);
		//edit text
				pid=(EditText)findViewById(R.id.viewpatid);
				nam=(EditText)findViewById(R.id.viewpatname);
				ag=(EditText)findViewById(R.id.viewpatage);
				pnum=(EditText)findViewById(R.id.viewpatmobile);
				hei=(EditText)findViewById(R.id.viewpatheight);
				wei=(EditText)findViewById(R.id.viewpatweight);
				blo=(EditText)findViewById(R.id.viewpatbloodgrp);
				dat=(EditText)findViewById(R.id.viewpatcheckdate);
				vital=(EditText)findViewById(R.id.viewpatvitalsigns);
				diseses=(EditText)findViewById(R.id.viewpatdiseases);
				precp=(EditText)findViewById(R.id.viewpatprescription);
				//button
				back1=(Button)findViewById(R.id.viewpatback);
				SharedPreferences sp21=getSharedPreferences("register1",MODE_PRIVATE);
				SharedPreferences sp2=getSharedPreferences("register",MODE_PRIVATE);
				SharedPreferences sp3=getSharedPreferences("register3",MODE_PRIVATE);
				SharedPreferences sp4=getSharedPreferences("register4",MODE_PRIVATE);
				SharedPreferences sp5=getSharedPreferences("register5",MODE_PRIVATE);
				SharedPreferences sp6=getSharedPreferences("register5",MODE_PRIVATE);
				snam11=sp21.getString("patname", null);
				snam1=sp2.getString("patname", null);
				snam2=sp3.getString("patname", null);
				snam3=sp4.getString("patname", null);
				snam4=sp5.getString("patname", null);
				snam5=sp6.getString("patname", null);
				
				Intent in=getIntent();
				Bundle bnok=in.getExtras();
				m1=bnok.getString("name");
				Toast.makeText(this,m1,Toast.LENGTH_LONG).show();
				
				if(snam11.equals(m1))
				{
					Toast.makeText(this,snam11,Toast.LENGTH_LONG).show();
					String sid=sp21.getString("patid",null);
					String sname=sp21.getString("patname",null);
					String sage=sp21.getString("patage",null);
					String snumber=sp21.getString("patnumber",null);
					String sheight=sp21.getString("patheight",null);
					String sweight=sp21.getString("patweight",null);
					String sbloodgrp=sp21.getString("patbloodgrp",null);
					
					pid.setText(sid);
					nam.setText(sname);
					ag.setText(sage);
					pnum.setText(snumber);
					hei.setText(sheight);
					wei.setText(sweight);
					blo.setText(sbloodgrp);
				}
				
				else if(snam1.equals(m1))
				{
					Toast.makeText(this,snam1,Toast.LENGTH_LONG).show();
					String sid=sp2.getString("patid",null);
					String sname=sp2.getString("patname",null);
					String sage=sp2.getString("patage",null);
					String snumber=sp2.getString("patnumber",null);
					String sheight=sp2.getString("patheight",null);
					String sweight=sp2.getString("patweight",null);
					String sbloodgrp=sp2.getString("patbloodgrp",null);
					
					pid.setText(sid);
					nam.setText(sname);
					ag.setText(sage);
					pnum.setText(snumber);
					hei.setText(sheight);
					wei.setText(sweight);
					blo.setText(sbloodgrp);
				}
				else if(snam2.equals(m1))
				{
					Toast.makeText(this,snam2,Toast.LENGTH_LONG).show();
					String sid=sp3.getString("patid",null);
					String sname=sp3.getString("patname",null);
					String sage=sp3.getString("patage",null);
					String snumber=sp3.getString("patnumber",null);
					String sheight=sp3.getString("patheight",null);
					String sweight=sp3.getString("patweight",null);
					String sbloodgrp=sp3.getString("patbloodgrp",null);
					
					pid.setText(sid);
					nam.setText(sname);
					ag.setText(sage);
					pnum.setText(snumber);
					hei.setText(sheight);
					wei.setText(sweight);
					blo.setText(sbloodgrp);
				}

				else if(snam3.equals(m1))
				{
					//Toast.makeText(this,snam3,Toast.LENGTH_LONG).show();
					String sid=sp4.getString("patid",null);
					String sname=sp4.getString("patname",null);
					String sage=sp4.getString("patage",null);
					String snumber=sp4.getString("patnumber",null);
					String sheight=sp4.getString("patheight",null);
					String sweight=sp4.getString("patweight",null);
					String sbloodgrp=sp4.getString("patbloodgrp",null);
					
					pid.setText(sid);
					nam.setText(sname);
					ag.setText(sage);
					pnum.setText(snumber);
					hei.setText(sheight);
					wei.setText(sweight);
					blo.setText(sbloodgrp);
				}
				else if(snam4.equals(m1))
				{
					String sid=sp5.getString("patid",null);
					String sname=sp5.getString("patname",null);
					String sage=sp5.getString("patage",null);
					String snumber=sp5.getString("patnumber",null);
					String sheight=sp5.getString("patheight",null);
					String sweight=sp5.getString("patweight",null);
					String sbloodgrp=sp5.getString("patbloodgrp",null);
					
					pid.setText(sid);
					nam.setText(sname);
					ag.setText(sage);
					pnum.setText(snumber);
					hei.setText(sheight);
					wei.setText(sweight);
					blo.setText(sbloodgrp);
				}
				else if(snam5.equals(m1))
				{
					String sid=sp6.getString("patid",null);
					String sname=sp6.getString("patname",null);
					String sage=sp6.getString("patage",null);
					String snumber=sp6.getString("patnumber",null);
					String sheight=sp6.getString("patheight",null);
					String sweight=sp6.getString("patweight",null);
					String sbloodgrp=sp6.getString("patbloodgrp",null);
					
					pid.setText(sid);
					nam.setText(sname);
					ag.setText(sage);
					pnum.setText(snumber);
					hei.setText(sheight);
					wei.setText(sweight);
					blo.setText(sbloodgrp);
				}
				
					
				
				back1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						
						String sid=pid.getText().toString();
						String sname=nam.getText().toString();
						String sage=ag.getText().toString();
						String snumber=pnum.getText().toString();
						String sheight=hei.getText().toString();
						String sweight=wei.getText().toString();
						String sbloodgrp=blo.getText().toString();
						String sdat=dat.getText().toString();
						String svital=vital.getText().toString();
						String sdiseases=diseses.getText().toString();
						String sprecp=precp.getText().toString();
						
						if(snam11.equals(m1))
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
						edsp21.putString("patcdat",sdat);
						edsp21.putString("patvital",svital);
						edsp21.putString("patdiseases",sdiseases);
						edsp21.putString("patprecp",sprecp);
						
						edsp21.commit();
										
						}
						else if(snam1.equals(m1))
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
						edsp2.putString("patcdat",sdat);
						edsp2.putString("patvital",svital);
						edsp2.putString("patdiseases",sdiseases);
						edsp2.putString("patprecp",sprecp);
						
						edsp2.commit();
										
						}
						
						else if(snam2.equals(m1))
						{
						SharedPreferences sp3=getSharedPreferences("register",MODE_PRIVATE);
						SharedPreferences.Editor edsp3=sp3.edit();
						
						edsp3.putString("patid",sid);
						edsp3.putString("patname",sname);
						edsp3.putString("patage",sage);
						edsp3.putString("patnumber",snumber);
						edsp3.putString("patheight",sheight);
						edsp3.putString("patweight",sweight);
						edsp3.putString("patbloodgrp",sbloodgrp);
						edsp3.putString("patcdat",sdat);
						edsp3.putString("patvital",svital);
						edsp3.putString("patdiseases",sdiseases);
						edsp3.putString("patprecp",sprecp);
						
						edsp3.commit();
						
						}
						
						else if(snam3.equals(m1))
						{
						SharedPreferences sp4=getSharedPreferences("register",MODE_PRIVATE);
						SharedPreferences.Editor edsp4=sp4.edit();
						
						edsp4.putString("patid",sid);
						edsp4.putString("patname",sname);
						edsp4.putString("patage",sage);
						edsp4.putString("patnumber",snumber);
						edsp4.putString("patheight",sheight);
						edsp4.putString("patweight",sweight);
						edsp4.putString("patbloodgrp",sbloodgrp);
						edsp4.putString("patcdat",sdat);
						edsp4.putString("patvital",svital);
						edsp4.putString("patdiseases",sdiseases);
						edsp4.putString("patprecp",sprecp);
						
						edsp4.commit();
						
						}
						
						else if(snam4.equals(m1))
						{
						SharedPreferences sp5=getSharedPreferences("register",MODE_PRIVATE);
						SharedPreferences.Editor edsp5=sp5.edit();
						
						edsp5.putString("patid",sid);
						edsp5.putString("patname",sname);
						edsp5.putString("patage",sage);
						edsp5.putString("patnumber",snumber);
						edsp5.putString("patheight",sheight);
						edsp5.putString("patweight",sweight);
						edsp5.putString("patbloodgrp",sbloodgrp);
						edsp5.putString("patcdat",sdat);
						edsp5.putString("patvital",svital);
						edsp5.putString("patdiseases",sdiseases);
						edsp5.putString("patprecp",sprecp);
						
						edsp5.commit();
						}
						
						else if(snam5.equals(m1))
						{
						SharedPreferences sp6=getSharedPreferences("register",MODE_PRIVATE);
						SharedPreferences.Editor edsp6=sp6.edit();
						
						edsp6.putString("patid",sid);
						edsp6.putString("patname",sname);
						edsp6.putString("patage",sage);
						edsp6.putString("patnumber",snumber);
						edsp6.putString("patheight",sheight);
						edsp6.putString("patweight",sweight);
						edsp6.putString("patbloodgrp",sbloodgrp);
						edsp6.putString("patcdat",sdat);
						edsp6.putString("patvital",svital);
						edsp6.putString("patdiseases",sdiseases);
						edsp6.putString("patprecp",sprecp);
						
						edsp6.commit();
						
						}

						
						Intent ne=new Intent(View_data.this,Appear_act.class);
						startActivity(ne);
						
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_view_data, menu);
		return true;
	}

}

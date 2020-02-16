package com.example.hospital;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Queue_act extends Activity {
	TextView bac;
	Button adque;
	EditText checktime;
	Spinner sp;
	ArrayList<String> arr=new ArrayList<String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_queue_act);
		bac=(TextView)findViewById(R.id.bacak);
		adque=(Button)findViewById(R.id.queueadd);
		checktime=(EditText)findViewById(R.id.checkintime);
		sp=(Spinner)findViewById(R.id.spname);
		
		SharedPreferences sp21=getSharedPreferences("register1",MODE_PRIVATE);
		SharedPreferences sp2=getSharedPreferences("register",MODE_PRIVATE);
		SharedPreferences sp3=getSharedPreferences("register3",MODE_PRIVATE);
		SharedPreferences sp4=getSharedPreferences("register4",MODE_PRIVATE);
		SharedPreferences sp5=getSharedPreferences("register5",MODE_PRIVATE);
		SharedPreferences sp6=getSharedPreferences("register5",MODE_PRIVATE);
		SharedPreferences sp7=getSharedPreferences("register5",MODE_PRIVATE);
		String snam11=sp21.getString("patname", null);
		String snam1=sp2.getString("patname", null);
		String snam2=sp3.getString("patname", null);
		String snam3=sp4.getString("patname", null);
		String snam4=sp5.getString("patname", null);
		String snam5=sp6.getString("patname", null);
		String snam6=sp7.getString("patname", null);
		
		if(snam11!=null)
		{
			arr.add(snam11);
		}
		if(snam1!=null)
		{
			arr.add(snam1);
		}
		if(snam2!=null)
		{
			arr.add(snam2);
		}
		if(snam3!=null)
		{
			arr.add(snam3);
		}
		if(snam4!=null)
		{
			arr.add(snam4);
		}
		if(snam5!=null)
		{
			arr.add(snam5);
		}
		if(snam6!=null)
		{
			arr.add(snam6);
		}
		
		final ArrayAdapter<String> ada=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arr);
        ada.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		sp.setAdapter(ada);
     sp.setOnItemSelectedListener(new OnItemSelectedListener() {

		@Override
		public void onItemSelected(AdapterView<?> parent, View arg1, int pos,
				long arg3) {
			String s=parent.getItemAtPosition(pos).toString();
			
			Toast.makeText(parent.getContext(),"you selected "+s, Toast.LENGTH_LONG).show();
		}

		@Override
		public void onNothingSelected(AdapterView<?> arg0) {
			// TODO Auto-generated method stub
			
		}
	});  
       
			
		
        bac.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ne=new Intent(Queue_act.this,Appear_act.class);
				startActivity(ne);
				
			}
		});
        adque.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s1=sp.getSelectedItem().toString();
				String s=checktime.getText().toString();
				int a=Integer.parseInt(s);
				
				if(a==1)
				{
					SharedPreferences spque1=getSharedPreferences("queue1",MODE_PRIVATE);
					SharedPreferences.Editor edque1=spque1.edit();
					edque1.putString("User",s1);
					edque1.putString("check",s);
					edque1.commit();					
				}

				else if(a==2)
				{
					SharedPreferences spque2=getSharedPreferences("queue2",MODE_PRIVATE);
					SharedPreferences.Editor edque2=spque2.edit();
					edque2.putString("User",s1);
					edque2.putString("check",s);
					edque2.commit();					
				}

				else if(a==3)
				{
					SharedPreferences spque3=getSharedPreferences("queue3",MODE_PRIVATE);
					SharedPreferences.Editor edque3=spque3.edit();
					edque3.putString("User",s1);
					edque3.putString("check",s);
					edque3.commit();					
				}

				else if(a==4)
				{
					SharedPreferences spque4=getSharedPreferences("queue4",MODE_PRIVATE);
					SharedPreferences.Editor edque4=spque4.edit();
					edque4.putString("User",s1);
					edque4.putString("check",s);
					edque4.commit();					
				}

				else if(a==5)
				{
					SharedPreferences spque5=getSharedPreferences("queue5",MODE_PRIVATE);
					SharedPreferences.Editor edque5=spque5.edit();
					edque5.putString("User",s1);
					edque5.putString("check",s);
					edque5.commit();					
				}

				else if(a==6)
				{
					SharedPreferences spque6=getSharedPreferences("queue6",MODE_PRIVATE);
					SharedPreferences.Editor edque6=spque6.edit();
					edque6.putString("User",s1);
					edque6.putString("check",s);
					edque6.commit();					
				}

				else if(a==7)
				{
					SharedPreferences spque7=getSharedPreferences("queue7",MODE_PRIVATE);
					SharedPreferences.Editor edque7=spque7.edit();
					edque7.putString("User",s1);
					edque7.putString("check",s);
					edque7.commit();					
				}
				else
				{
					SharedPreferences spque8=getSharedPreferences("queue8",MODE_PRIVATE);
					SharedPreferences.Editor edque8=spque8.edit();
					edque8.putString("User",s1);
					edque8.putString("check",s);
					edque8.commit();					
				}
				
				Toast.makeText(Queue_act.this, "Token Number Added Sucessfully",Toast.LENGTH_SHORT).show();
				Intent ne=new Intent(Queue_act.this,Appear_act.class);
				startActivity(ne);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_queue_act, menu);
		return true;
	}

}

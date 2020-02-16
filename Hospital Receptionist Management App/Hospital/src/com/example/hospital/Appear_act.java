package com.example.hospital;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class Appear_act extends Activity {
	ImageView usr,que,doct;
	Button pat,rep;
	ListView patientlist,queuelist;
	LinearLayout lipat,lirep;
	ArrayList<String> ar=new ArrayList<String>();
	ArrayList<String> arrq=new ArrayList<String>();
	ArrayAdapter<String> adapq;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,  WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_appear_act);
		que=(ImageView)findViewById(R.id.queue);
		usr=(ImageView)findViewById(R.id.regis);
		doct=(ImageView)findViewById(R.id.doctordetails);
		
		pat=(Button)findViewById(R.id.Patients);
		rep=(Button)findViewById(R.id.Reports);
		
		patientlist=(ListView)findViewById(R.id.patient);
		queuelist=(ListView)findViewById(R.id.lstqueue);
		
		lipat=(LinearLayout)findViewById(R.id.listpatientdetails);
		lirep=(LinearLayout)findViewById(R.id.listqueue);
		
		//list view for patient details
		//ar.add("Dhivakaran");
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
			ar.add(snam11);
		}
		if(snam1!=null)
		{
			ar.add(snam1);
		}
		if(snam2!=null)
		{
			ar.add(snam2);
		}
		if(snam3!=null)
		{
			ar.add(snam3);
		}
		if(snam4!=null)
		{
			ar.add(snam4);
		}
		if(snam5!=null)
		{
			ar.add(snam5);
		}
		if(snam6!=null)
		{
			ar.add(snam6);
		}
				
		final ArrayAdapter<String> adap=new ArrayAdapter<String>(Appear_act.this,R.layout.txt,R.id.txtfile, ar);
		patientlist.setAdapter(adap);
		
		//listview for queue
		//arrq.add("Dhivakaran");
		SharedPreferences spque1=getSharedPreferences("queue1",MODE_PRIVATE);
		SharedPreferences spque2=getSharedPreferences("queue2",MODE_PRIVATE);
		SharedPreferences spque3=getSharedPreferences("queue3",MODE_PRIVATE);
		SharedPreferences spque4=getSharedPreferences("queue4",MODE_PRIVATE);
		SharedPreferences spque5=getSharedPreferences("queue5",MODE_PRIVATE);
		SharedPreferences spque6=getSharedPreferences("queue6",MODE_PRIVATE);
		SharedPreferences spque7=getSharedPreferences("queue7",MODE_PRIVATE);
		SharedPreferences spque8=getSharedPreferences("queue7",MODE_PRIVATE);
		String que1=spque1.getString("User", null);
		String que2=spque2.getString("User", null);
		String que3=spque3.getString("User", null);
		String que4=spque4.getString("User", null);
		String que5=spque5.getString("User", null);
		String que6=spque6.getString("User", null);
		String que7=spque7.getString("User", null);
		String que8=spque8.getString("User", null);
		if(que1!=null)
		{
			arrq.add(que1);
		}
		if(que2!=null)
		{
			arrq.add(que2);
		}
		if(que3!=null)
		{
			arrq.add(que3);
		}
		if(que4!=null)
		{
			arrq.add(que4);
		}
		if(que5!=null)
		{
			arrq.add(que5);
		}
		if(que6!=null)
		{
			arrq.add(que6);
		}
		if(que7!=null)
		{
			arrq.add(que7);
		}
		if(que8!=null)
		{
			arrq.add(que8);
		}
		adapq=new ArrayAdapter<String>(Appear_act.this,R.layout.txt,R.id.txtfile, arrq);
        queuelist.setAdapter(adapq);
       
        
        queuelist.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long arg3) {
				// TODO Auto-generated method stub
				String s=adap.getItem(pos);
				decisionfrag(s,pos);
				
			}
		});
        patientlist.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,long arg3) {
				// TODO Auto-generated method stub
				String value = adap.getItem(pos);
				SharedPreferences sp21=getSharedPreferences("register1",MODE_PRIVATE);
				SharedPreferences sp2=getSharedPreferences("register",MODE_PRIVATE);
				SharedPreferences sp3=getSharedPreferences("register3",MODE_PRIVATE);
				SharedPreferences sp4=getSharedPreferences("register4",MODE_PRIVATE);
				SharedPreferences sp5=getSharedPreferences("register5",MODE_PRIVATE);
				SharedPreferences sp6=getSharedPreferences("register5",MODE_PRIVATE);
				SharedPreferences sp7=getSharedPreferences("register6",MODE_PRIVATE);
				String sn11=sp21.getString("patname", null);
				String sn1=sp2.getString("patname", null);
				String sn2=sp3.getString("patname", null);
				String sn3=sp4.getString("patname", null);
				String sn4=sp5.getString("patname", null);
				String sn5=sp6.getString("patname", null);
				String sn6=sp7.getString("patname", null);
				Bundle bnok=new Bundle();
				Intent ne=new Intent(Appear_act.this,View_data.class);
				if(value.equals(sn11))
				{					
					bnok.putString("name",sn11);
					ne.putExtras(bnok);
				}
				else if(value.equals(sn1))
				{					
					bnok.putString("name",sn1);
					ne.putExtras(bnok);
				}
				else if(value.equals(sn2))
				{
					bnok.putString("name",sn2);
					ne.putExtras(bnok);
				}
				else if(value.equals(sn3))
				{
					bnok.putString("name",sn3);
					ne.putExtras(bnok);
				}
				else if(value.equals(sn4))
				{
					bnok.putString("name",sn4);
					ne.putExtras(bnok);
				}
				else if(value.equals(sn5))
				{
					bnok.putString("name",sn5);
					ne.putExtras(bnok);
				}
				else
				{
					bnok.putString("name",sn6);
					ne.putExtras(bnok);
				}
				
				startActivity(ne);
			}
		});
        
        que.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent ne=new Intent(Appear_act.this,Queue_act.class);
				startActivity(ne);
				
			}
		});
        
        usr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ne=new Intent(Appear_act.this,Register_patient.class);
				startActivity(ne);
				
			}
		});
        
        pat.setOnClickListener(new View.OnClickListener() {
	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		
        		lirep.setVisibility(View.VISIBLE);
        		lipat.setVisibility(View.INVISIBLE);
        		
        		
        	}
		});
        doct.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ne=new Intent(Appear_act.this,Doctor_details.class);
				startActivity(ne);
				
			}
		});
        
        rep.setOnClickListener(new View.OnClickListener() {
	
        	@Override
        	public void onClick(View arg0) {
        		// TODO Auto-generated method stub
        		lipat.setVisibility(View.VISIBLE);
        		lirep.setVisibility(View.INVISIBLE);
		
        	}
        });
	}
	public void decisionfrag(String a,int p)
	{
		final String as=a;
		final int ps=p+1;
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
	      alertDialogBuilder.setMessage(as+"\n Token Number "+ps);
	      
	      alertDialogBuilder.setPositiveButton("Patient report", 
	         new DialogInterface.OnClickListener() {
	         @Override
	         public void onClick(DialogInterface arg0, int arg1) {
	           
	            view_report(as);
	         }
	      });

	      alertDialogBuilder.setNegativeButton("Delete",new DialogInterface.OnClickListener() {
	         @Override
	         public void onClick(DialogInterface dialog, int which) {
	            deletefrag(as);
	         }
	      });

	      AlertDialog alertDialog = alertDialogBuilder.create();
	      alertDialog.show();
	}
	public void view_report(String as)
	{
		String value=as;
		SharedPreferences sp21=getSharedPreferences("register1",MODE_PRIVATE);
		SharedPreferences sp2=getSharedPreferences("register",MODE_PRIVATE);
		SharedPreferences sp3=getSharedPreferences("register3",MODE_PRIVATE);
		SharedPreferences sp4=getSharedPreferences("register4",MODE_PRIVATE);
		SharedPreferences sp5=getSharedPreferences("register5",MODE_PRIVATE);
		SharedPreferences sp6=getSharedPreferences("register5",MODE_PRIVATE);
		SharedPreferences sp7=getSharedPreferences("register6",MODE_PRIVATE);
		String sn11=sp21.getString("patname", null);
		String sn1=sp2.getString("patname", null);
		String sn2=sp3.getString("patname", null);
		String sn3=sp4.getString("patname", null);
		String sn4=sp5.getString("patname", null);
		String sn5=sp6.getString("patname", null);
		String sn6=sp7.getString("patname", null);
		Bundle bnok=new Bundle();
		Intent ne=new Intent(Appear_act.this,View_data.class);
		if(value.equals(sn11))
		{					
			bnok.putString("name",sn11);
			ne.putExtras(bnok);
		}
		else if(value.equals(sn1))
		{					
			bnok.putString("name",sn1);
			ne.putExtras(bnok);
		}
		else if(value.equals(sn2))
		{
			bnok.putString("name",sn2);
			ne.putExtras(bnok);
		}
		else if(value.equals(sn3))
		{
			bnok.putString("name",sn3);
			ne.putExtras(bnok);
		}
		else if(value.equals(sn4))
		{
			bnok.putString("name",sn4);
			ne.putExtras(bnok);
		}
		else if(value.equals(sn5))
		{
			bnok.putString("name",sn5);
			ne.putExtras(bnok);
		}
		else
		{
			bnok.putString("name",sn6);
			ne.putExtras(bnok);
		}
		
		startActivity(ne);
	}
        
	
	public void deletefrag(String as)
	{
		final String nam=as;
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
	      alertDialogBuilder.setMessage("Are you sure, you want to delete " +as+" from queue");
	      alertDialogBuilder.setPositiveButton("Delete", 
	         new DialogInterface.OnClickListener() {
	         @Override
	         public void onClick(DialogInterface arg0, int arg1) {
	           
	        	
	                    arrq.remove(nam);
	                    adapq=new ArrayAdapter<String>(Appear_act.this,R.layout.txt,R.id.txtfile, arrq);
        				queuelist.setAdapter(adapq);
	                    Toast.makeText(getApplicationContext(), "deleted", Toast.LENGTH_LONG).show();
	                
	         }
	      });

	      alertDialogBuilder.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
	         @Override
	         public void onClick(DialogInterface dialog, int which) {
	        	 finish();
	         }
	      });

	      AlertDialog alertDialog = alertDialogBuilder.create();
	      alertDialog.show();
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_appear_act, menu);
		return true;
	}

}

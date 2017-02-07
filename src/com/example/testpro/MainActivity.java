package com.example.TestPro;



import com.example.TestPro.SecondActivity;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
	
	
	EditText ed1,ed2,ed3,ed4;
	Button rec,cir,squ,tri;
	String sh;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        ed3=(EditText) findViewById(R.id.ed3);
        ed4=(EditText) findViewById(R.id.ed4);
        rec=(Button) findViewById(R.id.rec);
        cir=(Button) findViewById(R.id.cir);
        squ=(Button) findViewById(R.id.squ);
        tri=(Button) findViewById(R.id.tri);
        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="rectangle";
            	String data1=ed1.getText().toString();
            	String data2=ed2.getText().toString();
            	String data3=ed3.getText().toString();
            	String data4=ed4.getText().toString();
            	
            
            	Intent i=new Intent();
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }

			private void startActivity(Intent i) {
				// TODO Auto-generated method stub
				
			}
        });
        cir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="circle";
            	String data1=ed1.getText().toString();
            	String data2=ed2.getText().toString();
            	String data3=ed3.getText().toString();
            	String data4=ed4.getText().toString();
            	Intent i=new Intent();
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }

			private void startActivity(Intent i) {
				// TODO Auto-generated method stub
				
			}
        });
        squ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="square";
            	String data1=ed1.getText().toString();
            	String data2=ed2.getText().toString();
            	String data3=ed3.getText().toString();
            	String data4=ed4.getText().toString();
            	Intent i=new Intent();
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }

			private void startActivity(Intent i) {
				// TODO Auto-generated method stub
				
			}
        });
        tri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            	sh="triangle";
            	String data1=ed1.getText().toString();
            	String data2=ed2.getText().toString();
            	String data3=ed3.getText().toString();
            	String data4=ed4.getText().toString();
            	Intent i=new Intent();
				i.putExtra("username", sh);
				i.putExtra("userdata1", data1);
				i.putExtra("userdata2", data2);
				i.putExtra("userdata3", data3);
				i.putExtra("userdata4", data4);
				startActivity(i);
            }

			private void startActivity(Intent i) {
				// TODO Auto-generated method stub
				
			}
        });
    }

	private void setContentView(int activityMain) {
		// TODO Auto-generated method stub
		
	}

   
    
}


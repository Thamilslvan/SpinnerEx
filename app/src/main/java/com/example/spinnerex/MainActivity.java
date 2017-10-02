package com.example.spinnerex;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner spn_city;
	String city[]={"cbe","chennai","pdm","tup","trichy"};
	ArrayAdapter<String> adapt;
	
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        spn_city=(Spinner)findViewById(R.id.spn_ma_city);
        adapt =new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,city);
        spn_city.setAdapter(adapt);
        
        spn_city.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int position, long arg3)
			{
				// TODO Auto-generated method stub
				if(position==0)
				{
					Toast.makeText(MainActivity.this, "cbe", Toast.LENGTH_LONG).show();
					
				}else if(position==1)
				{
					
					Toast.makeText(MainActivity.this, "chennai", Toast.LENGTH_LONG).show();
					
				}
				else if(position==2)
				{
					
					Toast.makeText(MainActivity.this, "pdm", Toast.LENGTH_LONG).show();
					
				}
				else if(position==2)
				{
					
					Toast.makeText(MainActivity.this, "tup", Toast.LENGTH_LONG).show();
					
				}
				else if(position==3)
				{
					
					Toast.makeText(MainActivity.this, "trichy", Toast.LENGTH_LONG).show();
					
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
        
        
    }


    
    
}

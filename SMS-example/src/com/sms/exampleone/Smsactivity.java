package com.sms.exampleone;

import android.app.Activity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Smsactivity extends Activity {
	EditText fse1,fse2;
	Button fsb1,fsb2;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fse1=(EditText)findViewById(R.id.fnumtxt);
        fse2=(EditText)findViewById(R.id.fmsgtxt);
        fsb1=(Button)findViewById(R.id.fsendbtn);
        fsb2=(Button)findViewById(R.id.fcancelbtn);
        fsb1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				SmsManager sms=SmsManager.getDefault();
				String num=fse1.getText().toString();
				String msg=fse2.getText().toString();
				if(fse1.getText().length()>9 && fse1.getText().length()<11)
				{
				sms.sendTextMessage(num, null, msg, null, null);
				Toast.makeText(Smsactivity.this,"Your Message Has Been Sent",Toast.LENGTH_SHORT).show();
				}
				else
				{
					Toast.makeText(Smsactivity.this,"Check Phone Number",Toast.LENGTH_SHORT).show();
				}
			}
		});
        fsb2.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				fse1.setText("");
			}
		});
	}
}

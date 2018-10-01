package com.example.asus.voicerecorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText emailreg,namereg,pswdreg;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        emailreg=findViewById(R.id.regemail);
        namereg=findViewById(R.id.regname);
        pswdreg=findViewById(R.id.regpswd);
        signup=findViewById(R.id.signupbtn);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String semail=emailreg.getText().toString();
                String sname=namereg.getText().toString();
                String spswd=pswdreg.getText().toString();
                if(semail.equals(" ")|| sname.equals(" ")||spswd.equals(" "))
                {
                    Toast.makeText(Register.this, "Enter all details", Toast.LENGTH_SHORT).show();
                }
                 else{
                    Toast.makeText(Register.this, "Signed Up", Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Register.this,Login.class);
                    //passing details to login activity
                    i.putExtra("namekey",sname);
                    i.putExtra("emailkey",semail);
                    i.putExtra("pswdkey",spswd);
                    startActivity(i);

                }
            }
        });


    }
}

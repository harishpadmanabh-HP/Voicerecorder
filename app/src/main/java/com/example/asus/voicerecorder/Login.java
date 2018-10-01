package com.example.asus.voicerecorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {
    EditText emaillogin,paswdlogin;
    Button login;
    TextView newuser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        emaillogin=findViewById(R.id.loginemail);
        paswdlogin=findViewById(R.id.loginpassword);
        login=findViewById(R.id.loginbutton);
        newuser=findViewById(R.id.newusertxtview);
newuser.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        startActivity(new Intent(Login.this,Register.class));
    }
});

      login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String loginemailstring=emaillogin.getText().toString();
              String loginpswdtring=paswdlogin.getText().toString();
              if(loginemailstring.equals(" ")||loginpswdtring.equals(""))
              {
                  Toast.makeText(Login.this, "Fields cant be empty", Toast.LENGTH_SHORT).show();
              }
              else{
               //   Toast.makeText(Login.this, "Log in success", Toast.LENGTH_SHORT).show();
                  Bundle bundle=getIntent().getExtras();
                  String regemail=bundle.getString("emailkey");
                  String regpswd=bundle.getString("pswdkey");
                  //ckecking the email and pswd

                  if(loginemailstring.equals(regemail) && loginpswdtring.equals(regpswd))
                  {
                      Toast.makeText(Login.this, "Log in success", Toast.LENGTH_SHORT).show();
                      startActivity(new Intent(Login.this,MainActivity.class));
                  }


              }

          }
      });

    }
}

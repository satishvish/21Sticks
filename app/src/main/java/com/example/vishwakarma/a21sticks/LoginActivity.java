/* this Activity responcible for login and provide the suggestion how to play the game*/

package com.example.vishwakarma.a21sticks;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
     EditText username,password;
     Button login,howtoplay;
    private String Userset="admin";  // username and password
    private String passset="admin";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText)findViewById(R.id.username); //taken the controll of all tha widgets
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.loginbtn);
        howtoplay=(Button)findViewById(R.id.howtoplay);



        login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {               // cheacking the valid username and password and switch to gameActivity
             String User=username.getText().toString();
             String pass=password.getText().toString();
                if(User.equals(Userset)&&pass.equals(passset))
                {
                    Intent intent = new Intent(LoginActivity.this,GameActivity.class);
                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Invalid UserName And Password.",Toast.LENGTH_LONG).show(); //genrate the toast to show username and password is not valid
                }
            }
        });
        howtoplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {  //it is switch the activity from  LoginActivity to InstrucationActivity
                Intent intent = new Intent(LoginActivity.this,InstrucationActivity.class);
                startActivity(intent);

            }
        });


    }
}

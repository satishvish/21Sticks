
/* this is responcible for show the instruction to the user*/
package com.example.vishwakarma.a21sticks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InstrucationActivity extends AppCompatActivity { //it is for return back to home
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instrucation);
        back=(Button)findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InstrucationActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}

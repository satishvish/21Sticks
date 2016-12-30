/* this is showing the winner*/

package com.example.vishwakarma.a21sticks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WinnerbannerActivity extends AppCompatActivity {
    Button Exit,Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winnerbanner);
        Exit=(Button)findViewById(R.id.exit);
        Back=(Button)findViewById(R.id.homeback);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {           //if you want to play again

                
                System.exit(0);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WinnerbannerActivity.this,LoginActivity.class); // if you want to switch to the home page
                startActivity(intent);
            }
        });

    }
}

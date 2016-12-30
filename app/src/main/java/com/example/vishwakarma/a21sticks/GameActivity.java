/* In this code I write the whole logic of game*/



package com.example.vishwakarma.a21sticks;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends AppCompatActivity {
     TextView Aidata, userdata,remainingsticks,turn;
     Button b1, b2, b3, b4;
    int totalmatchsticks = 21;                          // toal number of matchsticks


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        userdata = (TextView) findViewById(R.id.Uservalues);
        Aidata = (TextView) findViewById(R.id.AiselectValues);
        remainingsticks = (TextView) findViewById(R.id.remainingstics);
        turn=(TextView)findViewById(R.id.turn);

        final Handler handler=new Handler();  // it is for providing some delay between two functionlity

        try
        {


            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    totalmatchsticks = totalmatchsticks - 1;  // b1 button decreses the value of totalmatchsticks by 1
                    userdata.setText("01");                     // update the userselected data
                    turn.setText("AI Turn");
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Aidata.setText("04");               // implement the logic that every time sum will be 5.
                            totalmatchsticks = totalmatchsticks - 4;
                            remainingsticks.setText(String.valueOf(totalmatchsticks));
                            turn.setText("User Turn");
                            if (totalmatchsticks == 1) {        //switch to winnerbannerActivity if totalmatchsticks remains 1.
                                Toast.makeText(GameActivity.this, "AI Win The game.", Toast.LENGTH_SHORT).show();
                                b1.setEnabled(false);         //unble all the buttons
                                b2.setEnabled(false);
                                b3.setEnabled(false);
                                b4.setEnabled(false);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {         // this is for the delay
                                        Intent intent = new Intent(GameActivity.this, WinnerbannerActivity.class);
                                        startActivity(intent);

                                    }
                                },1000);



                            }

                        }
                    },1000);

                }
            });

            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {                           //repeate above logic for button 2
                    totalmatchsticks = totalmatchsticks - 2;

                    userdata.setText("02");
                    turn.setText("AI Turn");
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Aidata.setText("03");
                            totalmatchsticks = totalmatchsticks - 3;
                            remainingsticks.setText(String.valueOf(totalmatchsticks));
                            turn.setText("User Turn");
                            if (totalmatchsticks == 1) {
                                Toast.makeText(GameActivity.this, "AI Win The game.", Toast.LENGTH_SHORT).show();
                                b1.setEnabled(false);
                                b2.setEnabled(false);
                                b3.setEnabled(false);
                                b4.setEnabled(false);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent(GameActivity.this, WinnerbannerActivity.class);
                                        startActivity(intent);

                                    }
                                },1000);


                            }

                        }
                    },1000);

                }
            });

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {                               //repeate above logic for button 3
                    totalmatchsticks = totalmatchsticks - 3;

                    userdata.setText("03");
                    turn.setText("AI Turn");
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Aidata.setText("02");
                            totalmatchsticks = totalmatchsticks - 2;
                            remainingsticks.setText(String.valueOf(totalmatchsticks));
                            turn.setText("User Turn");
                            if (totalmatchsticks == 1)
                            {
                                Toast.makeText(GameActivity.this, "AI Win The game.", Toast.LENGTH_SHORT).show();
                                b1.setEnabled(false);
                                b2.setEnabled(false);
                                b3.setEnabled(false);
                                b4.setEnabled(false);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent(GameActivity.this, WinnerbannerActivity.class);
                                        startActivity(intent);

                                    }
                                },1000);


                            }

                        }
                    },1000);


                }
            });

            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {                               //repeate above logic for button 2
                    totalmatchsticks = totalmatchsticks - 4;

                    userdata.setText("04");
                    turn.setText("AI Turn");
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Aidata.setText("01");
                            totalmatchsticks = totalmatchsticks - 1;
                            remainingsticks.setText(String.valueOf(totalmatchsticks));
                            turn.setText("User Turn");
                            if (totalmatchsticks == 1) {
                                Toast.makeText(GameActivity.this, "AI Win The game.", Toast.LENGTH_SHORT).show();
                                b1.setEnabled(false);
                                b2.setEnabled(false);
                                b3.setEnabled(false);
                                b4.setEnabled(false);
                                handler.postDelayed(new Runnable() {
                                    @Override
                                    public void run() {
                                        Intent intent = new Intent(GameActivity.this, WinnerbannerActivity.class);
                                        startActivity(intent);

                                    }
                                },1000);


                            }

                        }
                    },1000);


                }
            });


        }
        catch (Exception e)                 //handle all type of Exceptions
        {
            e.printStackTrace();
            Toast.makeText(GameActivity.this,"Unfortunately Stop",Toast.LENGTH_SHORT).show();
        }

    }
}

package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FeedActivity extends AppCompatActivity {
//    FeedMessage f1 = new FeedMessage("Shikhar Solanki", "Workout", Arrays.asList(
//            "2x20 Squats: 45lbs", "2x30 Lunges", "1x15 Bench Press: 245lbs", "15 minute rest"
//    ));
//    FeedMessage f2 = new FeedMessage("Max Wo", "Workout", Arrays.asList(
//            "2x20 Squats: 45lbs", "2x30 Lunges", "1x15 Bench Press: 245lbs", "15 minute rest"
//    ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button3);
        Button btn4 = (Button) findViewById(R.id.button4);
        Button btn5 = (Button) findViewById(R.id.button5);
        Button btn6 = (Button) findViewById(R.id.button6);
        Button btn7 = (Button) findViewById(R.id.button7);
        Button btn8 = (Button) findViewById(R.id.button8);
        Button btn9 = (Button) findViewById(R.id.button9);
        Button btn10 = (Button) findViewById(R.id.button10);
        Button btn11 = (Button) findViewById(R.id.button11);
        Button btn12 = (Button) findViewById(R.id.button12);
        Button btn13 = (Button) findViewById(R.id.button13);
        Button btn14 = (Button) findViewById(R.id.button14);

        // added to expand buttons
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Shikar's workout:");
                alertDialog.setMessage("10 jumping jacks\n 15 jump ropes\n 20 push ups\n 50 lb bench press");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Kshitij's workout:");
                alertDialog.setMessage("50 calf raises \n 1 mile sprint \n 1 minute rest \n 5 mile run");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Max's workout:");
                alertDialog.setMessage("50 push ups \n 1x15 Bicep Curls: 45 lbs \n 1 minute rest \n 2x5 Bicep Curls: 70 lbs");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Justin's workout:");
                alertDialog.setMessage("5 minute warm up \n 26 mile run");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Greg's workout:");
                alertDialog.setMessage("5 minute run \n 5x4 Calf Raises: 30 lbs \n 1x30 Max Curls: 10 lbs");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Daniels's workout:");
                alertDialog.setMessage("30 minute walk \n 5 minute sprint \n 45 minute walk \n 10 minute sprint");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Bob's workout:");
                alertDialog.setMessage("80 minute run \n 50 minute walk \n 10 push ups");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Will's workout:");
                alertDialog.setMessage("70 minute run \n 100 push ups \n 80 minute swim");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Tim's workout:");
                alertDialog.setMessage("70 minute run \n 100 push ups \n 80 minute swim");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("John's workout:");
                alertDialog.setMessage("70 minute run \n 100 push ups \n 80 minute swim");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Rahul's workout:");
                alertDialog.setMessage("70 minute run \n 100 push ups \n 80 minute swim");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Xiao's workout:");
                alertDialog.setMessage("70 minute run \n 100 push ups \n 80 minute swim");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Myles' workout:");
                alertDialog.setMessage("70 minute run \n 100 push ups \n 80 minute swim");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(FeedActivity.this).create(); //Read Update
                alertDialog.setTitle("Nathan's workout:");
                alertDialog.setMessage("70 minute run \n 100 push ups \n 80 minute swim");
                alertDialog.setButton("Continue..", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {}
                });
                alertDialog.show();  //<-- See This!
            }
        });
    }
}
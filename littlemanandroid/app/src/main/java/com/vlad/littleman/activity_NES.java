package com.vlad.littleman;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import androidx.appcompat.app.AppCompatActivity;

public class activity_NES extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener {
    String IP = "192.126.0.28";

    String IP = "192.168.0.28";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__nes);

        final Button A = findViewById(R.id.buttonA);
        final Button B = findViewById(R.id.buttonB);
        final Button up = findViewById(R.id.buttonUp);
        final Button down = findViewById(R.id.buttonDown);
        final Button left = findViewById(R.id.buttonLeft);
        final Button right = findViewById(R.id.buttonRight);


        A.setOnClickListener(this);
        B.setOnClickListener(this);
        up.setOnTouchListener(this);
        down.setOnTouchListener(this);
        right.setOnTouchListener(this);
        left.setOnTouchListener(this);
    }

    @Override
    public void onClick(View v) {
        int x;

        switch (v.getId()) {
            case R.id.buttonA:
                x = 88;
                Ion.with(activity_NES.this)
                        .load("http://" + IP + ":8080/keyboard?key=" + x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: " + result);
                            }
                        });
                break;
            case R.id.buttonB:
                x = 87;
                Ion.with(activity_NES.this)
                        .load("http://" + IP + ":8080/keyboard?key=" + x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: " + result);
                            }
                        });
                break;
        }

    }


    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int x;
        switch (v.getId()) {
            case R.id.buttonUp:
                x = 72;
                Ion.with(activity_NES.this)
                        .load("http://" + IP + ":8080/keyboard?key=" + x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: " + result);
                            }
                        });
                break;

            case R.id.buttonDown:
                x = 75;
                Ion.with(activity_NES.this)
                        .load("http://" + IP + ":8080/keyboard?key=" + x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: " + result);
                            }
                        });
                break;

            case R.id.buttonLeft:
                x = 78;
                Ion.with(activity_NES.this)
                        .load("http://" + IP + ":8080/keyboard?key=" + x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: " + result);
                            }
                        });
                break;

            case R.id.buttonRight:
                x = 80;
                Ion.with(activity_NES.this)
                        .load("http://" + IP + ":8080/keyboard?key=" + x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: " + result);
                            }
                        });
                break;
        }
        return true;
    }
}


/*        A.setOnLongClickListener(new OnLongClickListener() {

        final int x = 88;

        @Override
        public boolean onClick(View v) {
            Ion.with(activity_NES.this)
                    .load("http://192.168.0.28:8080/keyboard?key="+x)
                    .asString()
                    .setCallback(new FutureCallback<String>() {
                        @Override
                        public void onCompleted(Exception e, String result) {
                            Log.i("activity_NES", "onCompleted: "+result);
                        }
                    });
                    return true
        }
    });

        B.setOnClickListener(new View.OnClickListener() {

        final int x = 87;

        @Override
        public void onClick(View v) {
            Ion.with(activity_NES.this)
                    .load("http://192.168.0.28:8080/keyboard?key="+x)
                    .asString()
                    .setCallback(new FutureCallback<String>() {
                        @Override
                        public void onCompleted(Exception e, String result) {
                            Log.i("activity_NES", "onCompleted: "+result);
                        }
                    });
        }
    });

        up.setOnClickListener(new View.OnClickListener() {

            final int x = 72;

            @Override
            public void onClick(View v) {
                Ion.with(activity_NES.this)
                        .load("http://192.168.0.28:8080/keyboard?key="+x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: "+result);
                            }
                        });
            }
        });

        down.setOnClickListener(new View.OnClickListener() {

            final int x = 75;

            @Override
            public void onClick(View v) {
                Ion.with(activity_NES.this)
                        .load("http://192.168.0.28:8080/keyboard?key="+x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: "+result);
                            }
                        });
            }
        });

        left.setOnClickListener(new View.OnClickListener() {

            final int x = 77;

            @Override
            public void onClick(View v) {
                Ion.with(activity_NES.this)
                        .load("http://192.168.0.28:8080/keyboard?key="+x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: "+result);
                            }
                        });
            }
        });

        right.setOnClickListener(new View.OnClickListener() {

            final int x = 80;

            @Override
            public void onClick(View v) {
                Ion.with(activity_NES.this)
                        .load("http://192.168.0.28:8080/keyboard?key="+x)
                        .asString()
                        .setCallback(new FutureCallback<String>() {
                            @Override
                            public void onCompleted(Exception e, String result) {
                                Log.i("activity_NES", "onCompleted: "+result);
                            }
                        });
            }
        });
    }*/


package com.example.mtrsliit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView2 = findViewById(R.id.textView2);
         textView2.setText(R.string.Msg2);

        Log.i("LifeCycle", "onCreate() Invoked!!!");
    }
    public void onStart(){
        super.onStart();
        Log.i("LifeCycle", "onStart() Invoked!!!");
    }
    public void onRestart(){
        super.onRestart();
        Log.i("LifeCycle", "onRestart() Invoked!!!");
    }
    public void onStop(){
        super.onStop();
        Log.i("LifeCycle", "onStop() Invoked!!!");
    }
    public void onResume(){
        super.onResume();
        Log.i("LifeCycle", "onResume Invoked!!!");
    }
}

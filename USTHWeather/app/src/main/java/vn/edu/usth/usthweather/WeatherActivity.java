package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
    }

    protected void onStart(){
        super.onStart();
        Log.i("WeatherActivity Traces","===onStart===");
    }
    protected void onResume(){
        super.onResume();
        Log.i("WeatherActivity Traces","===onResume===");
    }

    protected void onPause(){
        super.onPause();
        Log.i("WeatherActivity Traces","===onPause===");
    }
    protected void onReSume(){
        super.onResume();
        Log.i("WeatherActivity Traces","===onResume===");
    }
    protected void onStop(){
        super.onStop();
        Log.i("WeatherActivity Traces","===onStop===");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("WeatherActivity Traces","===onDestroy===");
    }
}
package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import androidx.viewpager2.widget.ViewPager2;

public class WeatherActivity extends AppCompatActivity {
    private ViewPagerAdapter viewPagerAdapter;
    private ViewPager2 viewPager2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        viewPagerAdapter= new ViewPagerAdapter(this);
        viewPager2=findViewById(R.id.viewpager);
        viewPager2.setAdapter(viewPagerAdapter);
//        WeatherForecast firstFragment = new WeatherForecast();
//        getSupportFragmentManager().beginTransaction().add(R.id.container,firstFragment).commit();
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
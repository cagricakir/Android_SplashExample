package codedbycagri.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread MyScreen = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                    startActivity(new Intent(getApplicationContext(), SplashClass.class));
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    finish();
                }
            }
        };
        MyScreen.start();
    }
}

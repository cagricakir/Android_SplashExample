package codedbycagri.splash;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        final ProgressBar loading = (ProgressBar)findViewById(R.id.progressBar);
        loading.setMax(5000);

        final Thread MyScreen = new Thread(){
            public void run(){
                try{
                    sleep(1000);
                    loading.setProgress(1000);
                    sleep(1000);
                    loading.setProgress(2000);
                    sleep(1000);
                    loading.setProgress(3000);
                    sleep(1000);
                    loading.setProgress(4000);
                    sleep(1000);
                    loading.setProgress(5000);


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

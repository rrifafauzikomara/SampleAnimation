package id.osg3.sampleanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clockwise(View view){
        ImageView image = findViewById(R.id.image);
        Animation clockwiseAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        image.startAnimation(clockwiseAnim);
    }

    public void zoom(View view){
        ImageView image = findViewById(R.id.image);
        Animation zoomAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        image.startAnimation(zoomAnim);
    }

    public void fade(View view){
        ImageView image = findViewById(R.id.image);
        Animation fadeAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(fadeAnim);
    }

    public void blink(View view){
        ImageView image = findViewById(R.id.image);
        Animation blinkAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(blinkAnim);
    }

    public void move(View view){
        ImageView image = findViewById(R.id.image);
        Animation moveAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(moveAnim);
    }

    public void slide(View view){
        ImageView image = findViewById(R.id.image);
        Animation slideAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(slideAnim);
    }


}
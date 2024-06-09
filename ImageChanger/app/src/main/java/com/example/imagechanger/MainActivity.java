package com.example.imagechanger;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.imagechanger.R;

public class MainActivity extends AppCompatActivity { ImageView imageView;
    Button button; @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView2);
        button = findViewById(R.id.button);
        setImageResource(R.drawable.baseline_brightness_5_24);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { switchImg();
            }
        });
    }
    private void switchImg(){
        @DrawableRes int currentImg = (int)imageView.getTag(); int newImg =
                (currentImg==R.drawable.baseline_brightness_5_24)?R.drawable.baseline_brightness_1_24:R.drawable.baseline_brightness_5_24;
        setImageResource(newImg);
    }
    private void setImageResource(@DrawableRes int resourceId){ imageView.setImageResource(resourceId);
        imageView.setTag(resourceId);//Tag -> additional info about resources
    }
}

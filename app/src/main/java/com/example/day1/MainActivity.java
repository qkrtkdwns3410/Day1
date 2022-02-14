package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.VerifiedInputEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;


public class MainActivity extends AppCompatActivity {
      
      ImageView imageView;
      ImageView imageView2;
      
      int imageIndex = 0;
      
      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.frame_layout);
      
            imageView = findViewById(R.id.imageView);
            imageView2 = findViewById(R.id.imageView2);
      }
      
      public void onButton1Cliked(View view) {
            changeImage();
      }
      
      private void changeImage() {
            if (imageIndex == 0) {
                  imageView.setVisibility(View.VISIBLE);
                  imageView2.setVisibility(View.INVISIBLE);
            
                  imageIndex = 1;
            } else {
                  imageView.setVisibility(View.INVISIBLE);
                  imageView2.setVisibility(View.VISIBLE);
      
                  imageIndex = 0;
            }
      }
      
}







































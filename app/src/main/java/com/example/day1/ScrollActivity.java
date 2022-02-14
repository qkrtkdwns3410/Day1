package com.example.day1;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * packageName    : com.example.scrollview
 * fileName       : MainActtivity
 * author         : letscombine
 * date           : 2022-02-14
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-14        letscombine       최초 생성
 */
public class ScrollActivity extends AppCompatActivity {
      ScrollView scrollView;
      ImageView imageView;
      BitmapDrawable bitmap;
      
      @Override
      protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.scrollview);
            
            
           
            scrollView = findViewById(R.id.scrollView);
            imageView = findViewById(R.id.imageView);
            scrollView.setHorizontalScrollBarEnabled(true);
            
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.flower);
            
            int bitmapWidth = bitmap.getIntrinsicWidth();
            int bitmapHeight = bitmap.getIntrinsicHeight();
            
            /*이미지의 리소스 설정*/
            imageView.setImageDrawable(bitmap);
            /*이미지의 너비 설정*/
            imageView.getLayoutParams().width = bitmapWidth;
            /*이미지의 높이 설정*/
            imageView.getLayoutParams().height = bitmapHeight;
      }
      
      public void onButton1Clicked(View v) {
            changeImage();
      }
      
      private void changeImage() {
            Resources res = getResources();
            bitmap = (BitmapDrawable) res.getDrawable(R.drawable.hongkong);
            
            int bitmapWidth = bitmap.getIntrinsicWidth();
            int bitmapHeight = bitmap.getIntrinsicHeight();
            
            /*이미지의 리소스 설정*/
            imageView.setImageDrawable(bitmap);
            /*이미지의 너비 설정*/
            imageView.getLayoutParams().width = bitmapWidth;
            /*이미지의 높이 설정*/
            imageView.getLayoutParams().height = bitmapHeight;
      }
      
}


























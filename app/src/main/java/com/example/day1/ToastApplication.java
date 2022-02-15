package com.example.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class ToastApplication extends AppCompatActivity {
      
      EditText editText;
      EditText editText2;
      
      @Override
      protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_toast);
      
            editText = findViewById(R.id.editText);
            editText2 = findViewById(R.id.editText2);
      }
      
      
      public void onClicked1(View view) {
            try {
                  Toast toastView = Toast.makeText(this, "위치가 바뀐 토스트 메시지입니다.", Toast.LENGTH_LONG);
      
                  int xOffSet = Integer.parseInt(editText.getText().toString());
                  int yOffSet = Integer.parseInt(editText2.getText().toString());
      
                  toastView.setGravity(Gravity.TOP, xOffSet, yOffSet);
                  toastView.show();
                  
            } catch (NumberFormatException e) {
                  e.printStackTrace();
                  
            }
            
            
      }

      public void onClicked2(View view) {
            /*레이 아웃 인플레이터 객체 참조*/
            LayoutInflater inflater = getLayoutInflater();

            View layout = inflater
                    .inflate(R.layout.toastborder, findViewById(R.id.toast_layout_root));

            TextView text = layout.findViewById(R.id.text);

            Toast toast = new Toast(this);
            text.setText("모양 바꾼 토스트");
            toast.setGravity(Gravity.CENTER, 0, -100);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();

      }

      public void onClicked3(View view) {
            Snackbar.make(view, "스낵바입니다.", Snackbar.LENGTH_LONG).show();
      }
      
}












































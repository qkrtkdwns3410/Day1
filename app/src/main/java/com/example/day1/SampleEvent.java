package com.example.day1;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SampleEvent extends AppCompatActivity {
	TextView textView;
	GestureDetector detector;

	/*키가 눌린 경우 >> AppCompatActivity 의 메서드를 오버라이드*/
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			Toast.makeText(this, "시스템 뒤로가기", Toast.LENGTH_SHORT).show();
			return true;
		}

		return false;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample_event);

		textView = findViewById(R.id.textView);

		View view = findViewById(R.id.view);

		view.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View view, MotionEvent motionEvent) {
				int action = motionEvent.getAction();
				//어떠한 이벤트인지

				float curX = motionEvent.getX();
				float curY = motionEvent.getY();
				//action이 일어난 곳의 X Y 값 GET

				if (action == MotionEvent.ACTION_DOWN) {
					println("손가락 눌림 : " + curX + ", " + curY);
				} else if (action == MotionEvent.ACTION_MOVE) {
					println("손가락 움직임 : " + curX + ", " + curY);
				} else if (action == MotionEvent.ACTION_UP) {
					println("손가락 뗌 : " + curX + ", " + curY);
				}

				return true;
			}
		});

		//용하면 개별 터치 이벤트를 직접 처리하지 않고도 일반적인 동작을 쉽게 감지할 수 있습니다
		detector = new GestureDetector(this, new GestureDetector.OnGestureListener() {

			@Override
			public boolean onDown(MotionEvent motionEvent) {
				println("onDown() 호출됨");

				return true;
			}

			@Override
			public void onShowPress(MotionEvent motionEvent) {
				println("onShowPress() 호출됨");

			}

			@Override
			public boolean onSingleTapUp(MotionEvent motionEvent) {
				println("onSingleTapUp() 호출됨");

				return true;
			}

			@Override
			public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
				println("onScroll() 호출됨");

				return true;

			}

			@Override
			public void onLongPress(MotionEvent motionEvent) {
				println("onLongPress() 호출됨");

			}

			@Override
			public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
				println("onFling() 호출됨");

				return true;

			}

		});

		/*View2 에는 해당 id를 가진 뷰를 가져옵니다*/
		/*구현한 제스처 이벤트를 출력*/
		View view2 = findViewById(R.id.view2);
		view2.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View view, MotionEvent motionEvent) {
				detector.onTouchEvent(motionEvent);

				return true;
			}
		});

	}

	public void println(String data) {
		textView.append(data + "\n");
	}

}
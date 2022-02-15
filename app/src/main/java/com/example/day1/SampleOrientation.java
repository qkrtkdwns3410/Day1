package com.example.day1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class SampleOrientation extends AppCompatActivity {
	String name;

	EditText editText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample_orientation);

		showToast("onCreate호출");

		editText = findViewById(R.id.editText);

		Button button = findViewById(R.id.button);

		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				name = editText.getText().toString(); //클릭시 name 값을 담습니다.
				showToast("입력된 값을 변수에 저장했습니다. " + name);
			}
		});

		if (savedInstanceState != null) {
			/*name 값에 이미 값이 존재한다?! >> 저장된 값이 있다는 의미이므로 해당 값을 복원!*/
			name = savedInstanceState.getString("name");
			showToast("값을 복원했습니다 : " + name);

			//
			//
			//		복원 메시지 출력이 안됨.!
			//
			//
			//
		}
	}

	/*생명주기 메서드 오버라이딩*/
	@Override
	protected void onStart() {
		super.onStart();

		showToast("onStart onStart");
	}

	@Override
	protected void onStop() {
		super.onStop();

		showToast(" onStop onStop");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();

		showToast("onDestroy onDestroy");
	}

	/*
	* 화면을 회전할 때 발생하는 이벤트들은 다음과 같습니다. 화면을 회전할 때마다 Activity가 종료되고 새로 만들어지기 집니다.

	onPause() → onSaveInstanceState() → onStop() → onDestory() → onCreate() → onStart() → onResume()
	* */
	@Override
	protected void onSaveInstanceState(@NonNull Bundle outState) {
		super.onSaveInstanceState(outState);

		outState.putString("name", name); //name변수의 값을 저장합니다.
	}

	// /*설정이 변경되는 경우 해당 토스트메시지를 출력합니다.*/
	// @Override
	// public void onConfigurationChanged(@NonNull Configuration newConfig) {
	// 	super.onConfigurationChanged(newConfig);
	//
	// 	if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
	// 		showToast("방향 : ORIENTATION_LANDSCAPE");
	//
	// 	} else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
	// 		showToast("방향 : ORIENTATION_PROTRAIT");
	// 	}
	// }

	public void showToast(String data) {
		Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
	}
}
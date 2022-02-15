package com.example.day1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	ImageView imageView;
	ImageView imageView2;
	/*원래는 전역변수로 설정하면 안된다고 했음. 저는 소스코드대로 일단 따라적어보았습니다.*/

	int imageIndex = 0;
	//이미지의 인덱스 값을 변경시켜줌으로 두 중첩된 이미지를 visible invisible 해줍니다.

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame_layout);
		//R.layout >>? R : 안드로이드가 리소스를 관리하는 R이라는 클래스를 생성 > 그 안에 레이아웃을 관리하는 layout이 존재 > 해당 접두어로 layout ... id 를 불러옵니다.
		imageView = findViewById(R.id.imageView);
		//findViewById : 해당 imageView라는 아이디를 가진 ViewGroup 안의 뷰들을 순회하면서.... 찾습니다. ..성능상 이슈가 있다고는 하는데 >> 대체:ViewBinding <<그래들에서 별도 설정을 해줘야하는데 근데 뭔가 안쓸거같음.
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







































package com.example.day1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class LayoutCodeActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
/*super class 호출(Activity를 구현하는데 필요한 과정)*/


		LinearLayout mainLayout = new LinearLayout(this);
		mainLayout.setOrientation(LinearLayout.VERTICAL);
		/*new 연산자로 linear... 레이아웃을 만들고
		 *  this = Context 혹은 Context를 상속받은 클래스의 객체를 리턴
		 *	방향을 vertical로 설정합니다
		 *  */

		LinearLayout.LayoutParams params =
			new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT
			);
		/*new 연산자로 레이아웃 안의 추가될 뷰들에 설정한 파라미터를 생성*/

		Button button1 = new Button(this);
		button1.setText("Button1");
		button1.setLayoutParams(params);
		mainLayout.addView(button1);
		/*\버튼에 파라미터를 설정하고 레이아웃에 추가합니다.*/

		setContentView(R.layout.activity_layout_code); // 새로만든 레이아웃을 화면에 설정합니다.

	}
}
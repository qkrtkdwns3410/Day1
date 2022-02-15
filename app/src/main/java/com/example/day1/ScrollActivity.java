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
		/*액티비티에 대한 레이아웃을 지정합니다*/

		scrollView = findViewById(R.id.scrollView);
		imageView = findViewById(R.id.imageView);
		/*해당 뷰들을 검색하고*/
		scrollView.setHorizontalScrollBarEnabled(true);
		/*수평 스크롤바가 사용이 가능하도록 처리합니다*/

		Resources res = getResources();
		/*리소스를 들고오기위한 작업*/
		bitmap = (BitmapDrawable)res.getDrawable(R.drawable.flower);
		/*flower 이미지 리소스를 가져옵니다 >> BItmapDrawable 클래스로 형변환*/
		int bitmapWidth = bitmap.getIntrinsicWidth();
		int bitmapHeight = bitmap.getIntrinsicHeight();
		/*해당 이미지의 너비 높이 가져옴*/


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
		/*클릭하면 이미지가 변경되는 함수입니다.,*/
		Resources res = getResources();
		bitmap = (BitmapDrawable)res.getDrawable(R.drawable.hongkong);

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


























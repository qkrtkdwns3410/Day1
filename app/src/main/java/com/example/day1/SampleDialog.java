package com.example.day1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SampleDialog extends AppCompatActivity {
	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample_dialog);

		textView = findViewById(R.id.textView1);

		Button button = findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				showMessage();
			}
		});
	}

	private void showMessage() {
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("안내");
		builder.setMessage("종료하시겠습니까?");
		builder.setIcon(android.R.drawable.ic_dialog_alert);

		builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int which) {
				String message = "예 버튼이 눌렸습니다";
				textView.setText(message);

			}
		});

		builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int which) {
				String message = "아니오 버튼이 눌렸습니다";
				textView.setText(message);

			}

		});

		AlertDialog dialog = builder.create();
		dialog.show();

	}
}
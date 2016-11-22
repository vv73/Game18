package ru.samsung.itschool.game18;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
		MyDraw myDraw = (MyDraw)findViewById(R.id.view);
		seekBar.setOnSeekBarChangeListener(myDraw);
	}
}

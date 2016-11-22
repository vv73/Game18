package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;

public class MyDraw extends View implements SeekBar.OnSeekBarChangeListener{

	Vector v;

	void init(Context context)
	{
		v = new Vector(30, 100);
		animals = new Animal[51];

		for (int i = 0; i < 3; i++)
		    animals[i] = new Cat(30, (float)Math.random()* 300, (float)Math.random()* 300, context);
		for (int i = 3; i < animals.length; i++) {
			animals[i] = new Mouse(
					(float) (Math.random() * 500),
					(float) (Math.random() * 500), 100,
					context);
		}

	}
	public MyDraw(Context context) {
		super(context);
		init(context);
	}
	Paint paint = new Paint();


	Animal[] animals;

	public MyDraw(Context context, AttributeSet attrs) {
		super(context, attrs);
		init(context);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		//canvas.drawLine(0, 0, v.x, v.y, paint);
		//canvas.drawText(v.toString(), 50, 50, paint);
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Mouse)
				((Mouse)animals[i]).move();
			animals[i].appear(canvas);
		}

		this.invalidate();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// mouseOne.toGo.set();
		float x = event.getX();
		float y = event.getY();
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof OnTouch)
				((OnTouch)animals[i]).onTouch(x, y);
		}
		return false;
	}

	@Override
	public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
		for (Animal m : animals)
		{
			if (m instanceof Mouse) ((Mouse)m).size = 50* (i + 100f)/100;
		}
	}

	@Override
	public void onStartTrackingTouch(SeekBar seekBar) {

	}

	@Override
	public void onStopTrackingTouch(SeekBar seekBar) {

	}
}

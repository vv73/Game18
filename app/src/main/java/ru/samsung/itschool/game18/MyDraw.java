package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class MyDraw extends View{

	Vector v;
	public MyDraw(Context context) {
		super(context);
		v = new Vector(30, 100);
		mouse = new Mouse[50];

		catOne = new Cat(30, 150, 2, context);
		for (int i = 0; i < mouse.length; i++) {
			mouse[i] = new Mouse((float) (Math.random() * 500), (float) (Math.random() * 500), 0.1f, context);
		}
	}
	Paint paint = new Paint();
	Cat catOne;
	Mouse[] mouse;
	@Override
	protected void onDraw(Canvas canvas) {
		//canvas.drawLine(0, 0, v.x, v.y, paint);
		//canvas.drawText(v.toString(), 50, 50, paint);
		catOne.appear(canvas);
		for (int i = 0; i < mouse.length; i++) {
			mouse[i].move();
			mouse[i].appear(canvas);
		}

		this.invalidate();
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// mouseOne.toGo.set();
		for (int i = 0; i < mouse.length; i++) {
			mouse[i].please(event.getX(), event.getY());
		}
		return false;
	}
}

package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class MyDraw extends View{

	Vector v;
	public MyDraw(Context context) {
		super(context);
		v = new Vector(30, 100);
		catOne = new Cat (30, 150, 2, context);
		mouseOne = new Mouse(100, 300, 0.1f, context);
	}

	Paint paint = new Paint();
	Cat catOne;
	Mouse mouseOne;
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawLine(0, 0, v.x, v.y, paint);
		canvas.drawText(v.toString(), 50, 50, paint);
		catOne.appear(canvas);
		mouseOne.move();
		mouseOne.appear(canvas);
		this.invalidate();
		
		
	}
	
	

}

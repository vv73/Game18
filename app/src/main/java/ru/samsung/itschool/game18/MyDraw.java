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
	}

	Paint paint = new Paint();
	Cat catOne;
	@Override
	protected void onDraw(Canvas canvas) {
		canvas.drawLine(0, 0, v.x, v.y, paint);
		canvas.drawText(v.toString(), 50, 50, paint);
		catOne.appear(canvas);
		
		
		
	}
	
	

}

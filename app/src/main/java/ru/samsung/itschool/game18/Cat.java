package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Cat {
	Vector pos;
	float size;
	Bitmap pic;

	Cat(Context context) {
		pos = new Vector(0, 0);
		size = 1;
		pic = BitmapFactory.decodeResource
				(context.getResources(), R.drawable.cat);
	}

	Cat(float x, float y, float size, Context context) {
		pos = new Vector(x, y);
		this.size = size;
		pic = BitmapFactory.decodeResource
				(context.getResources(), R.drawable.cat);
	}
    Paint paint = new Paint();
	void appear(Canvas canvas) {
		Matrix m = new Matrix();
		m.postScale(size, size);
		m.postTranslate(pos.x, pos.y);
		canvas.drawBitmap(pic, m, paint);
	}
}

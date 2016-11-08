package ru.samsung.itschool.game18;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public class Mouse extends Animal{

	Mouse(Context context) {
		super(context, R.drawable.mouse);
	}

	Mouse(float x, float y, float size, Context context) {
	    super(x, y, size, context, R.drawable.mouse);
	}
    void move()
	{
		pos.x += 2;
	}
}

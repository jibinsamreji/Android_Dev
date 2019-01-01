package com.example.jibin.jibin_reji_comp304_001_hands_on_test_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;

/**
 * Created by Ashwin on 12/3/2017.
 */

public class MyImageView extends android.support.v7.widget.AppCompatImageView {

    public MyImageView(Context context) {
        super(context);
    }
    @Override
    protected  void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        Paint p=new Paint (Paint.ANTI_ALIAS_FLAG);
        canvas.drawLine(0,0,20,20,p);
    }
}

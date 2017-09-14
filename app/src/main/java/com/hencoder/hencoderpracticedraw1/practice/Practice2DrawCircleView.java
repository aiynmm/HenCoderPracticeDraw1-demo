package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {
    Paint paint1;
    Paint paint2;
    Paint paint3;
    Paint paint4;

    public Practice2DrawCircleView(Context context) {
        super(context);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint1 = new Paint();
        paint1.setColor(Color.BLACK);
        paint1.setStyle(Paint.Style.FILL);
        paint2 = new Paint();
        paint2.setColor(Color.BLACK);
        paint2.setStyle(Paint.Style.STROKE);
        paint3 = new Paint();
        paint3.setColor(Color.BLUE);
        paint3.setStyle(Paint.Style.FILL);
        paint4 = new Paint();
        paint4.setColor(Color.BLACK);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(20);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
        canvas.drawCircle(300, 200, 100, paint1);
        canvas.drawCircle(720, 200, 100, paint2);
        canvas.drawCircle(300, 520, 100, paint3);
        canvas.drawCircle(720, 520, 100, paint4);
    }
}

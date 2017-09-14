package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {
    Paint paint1;
    Paint paint2;
    Paint paint3;

    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint1=new Paint();
        paint1.setColor(Color.BLACK);
        paint1.setStrokeCap(Paint.Cap.ROUND);
        paint1.setStrokeWidth(80);
        paint2=new Paint();
        paint2.setColor(Color.BLACK);
        paint2.setStrokeCap(Paint.Cap.BUTT);
        paint2.setStrokeWidth(80);
        paint3=new Paint();
        paint3.setColor(Color.BLACK);
        paint3.setStrokeCap(Paint.Cap.SQUARE);
        paint3.setStrokeWidth(80);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        canvas.drawPoint(300,500,paint1);
        canvas.drawPoint(500,500,paint2);
        canvas.drawPoint(700,500,paint3);
    }
}

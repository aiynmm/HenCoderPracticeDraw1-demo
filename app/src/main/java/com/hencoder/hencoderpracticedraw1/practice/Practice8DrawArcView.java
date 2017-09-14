package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint paint1;
    Paint paint2;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint1=new Paint();
        paint1.setStyle(Paint.Style.STROKE);
        paint2=new Paint();
        paint2.setStyle(Paint.Style.FILL);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        //除去4个坐标，第一个参数开始角度是从右边开始，第二个参数是旋转角度，方向为顺时针
        //第三个参数，是否使用中心点
        canvas.drawArc(300,300,700,500,180,60,false,paint1);
        canvas.drawArc(300,300,700,500,250,100,true,paint2);
        canvas.drawArc(300,300,700,500,20,140,false,paint2);
    }
}

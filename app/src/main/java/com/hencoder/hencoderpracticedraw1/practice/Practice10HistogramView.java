package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class Practice10HistogramView extends View {
    Paint paintRect;
    Paint paintText;
    Paint paintLine;
    Path path;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paintRect = new Paint();
        paintRect.setStyle(Paint.Style.FILL);
        paintRect.setColor(Color.GREEN);

        paintLine = new Paint();
        paintLine.setColor(Color.WHITE);
        paintLine.setStyle(Paint.Style.STROKE);

        paintText = new Paint();
        paintText.setColor(Color.WHITE);
        //x默认是这个字符串的左边在屏幕的位置，如果设置了paint.setTextAlign(Paint.Align.CENTER);
        // x就是字符的中心，y是指定这个字符baseline在屏幕上的位置，
        //大家记住了，不要混淆，y不是这个字符中心在屏幕上的位置，而是baseline在屏幕上的位置
        paintText.setTextAlign(Paint.Align.CENTER);
        paintText.setTextSize(30);
        paintText.setStrokeWidth(1);

        path = new Path();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        path.moveTo(100, 50);
        path.lineTo(100, 600);
        path.lineTo(1000, 600);
        canvas.drawPath(path, paintLine);

        Paint.FontMetrics fontMetrics = paintText.getFontMetrics();
        Log.e("top", fontMetrics.top + "");//-31.801758
        Log.e("ascent", fontMetrics.ascent + "");//-27.832031
        Log.e("descent", fontMetrics.descent + "");// 7.3242188
        Log.e("bottom", fontMetrics.bottom + "");//8.24707
        float yBaseLine = 600 - fontMetrics.top;

        //每一个直方图宽度为100，间隔为20
        canvas.drawRect(120, 595, 220, 600, paintRect);//Froyo  5  0.42%
        canvas.drawText("Froyo", 170, yBaseLine, paintText);
        canvas.drawRect(240, 580, 340, 600, paintRect);//GB   20   1.67%
        canvas.drawText("GB", 290, yBaseLine, paintText);
        canvas.drawRect(360, 580, 460, 600, paintRect);//ICS  20   1.67%
        canvas.drawText("ICS", 410, yBaseLine, paintText);
        canvas.drawRect(480, 400, 580, 600, paintRect);//JB   200  16.73%
        canvas.drawText("JB", 530, yBaseLine, paintText);
        canvas.drawRect(600, 250, 700, 600, paintRect);//Kitkat   350  29.29%
        canvas.drawText("Kitkat", 650, yBaseLine, paintText);
        canvas.drawRect(720, 150, 820, 600, paintRect);//L    450   37.66%
        canvas.drawText("L", 770, yBaseLine, paintText);
        canvas.drawRect(840, 450, 940, 600, paintRect);//M    150  12.55%
        canvas.drawText("M", 890, yBaseLine, paintText);

    }
}

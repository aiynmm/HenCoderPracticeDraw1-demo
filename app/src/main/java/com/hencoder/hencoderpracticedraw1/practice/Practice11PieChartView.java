package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class Practice11PieChartView extends View {
    Paint paintLine;
    Paint paintText;
    Paint paintArc;
    Path path;
    boolean isRedSelected = false;
    private static final int PART_ONE = 1;

    private static final int PART_TWO = 2;

    private static final int PART_THREE = 3;

    private static final int PART_FOUR = 4;

    private int moveValue;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paintLine = new Paint();
        paintLine.setAntiAlias(true);
        paintLine.setColor(Color.WHITE);
        paintLine.setStyle(Paint.Style.STROKE);
        paintText = new Paint();
        paintText.setAntiAlias(true);
        paintText.setColor(Color.WHITE);
        paintText.setTextSize(28);
        paintArc = new Paint();
        paintArc.setAntiAlias(true);
        path = new Path();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    @TargetApi(21)
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        //共1195

        //Froyo  5  0.42%
        paintArc.setColor(Color.MAGENTA);
        canvas.drawArc(200, 100, 800, 700, 0, 1.512f, true, paintArc);
        path.moveTo(500 + 300 * (float) Math.cos(Math.toRadians(1.512) / 2), 400 + 300 * (float) Math.sin(Math.toRadians(1.512) / 2));
        path.lineTo(850,400 + 300 * (float) Math.sin(Math.toRadians(1.512) / 2));
        canvas.drawPath(path,paintLine);
        canvas.drawText("Froyo",850,400 + 300 * (float) Math.sin(Math.toRadians(1.512) / 2),paintText);
        //GB   20   1.67%
        paintArc.setColor(Color.CYAN);
        canvas.drawArc(200, 100, 800, 700, 1.512f, 6.012f, true, paintArc);
        path.reset();
        path.moveTo(500 + 300 * (float) Math.cos(Math.toRadians(4.5)), 400 + 300 * (float) Math.sin(Math.toRadians(4.5)));
        path.lineTo(820,400 + 300 * (float) Math.sin(Math.toRadians(4.5)));
        path.lineTo(830,400 + 300 * (float) Math.sin(Math.toRadians(4.5))+20);
        path.lineTo(850,400 + 300 * (float) Math.sin(Math.toRadians(4.5))+20);
        canvas.drawPath(path,paintLine);
        canvas.drawText("Gingerbread",850,400 + 300 * (float) Math.sin(Math.toRadians(4.5))+20,paintText);
        //ICS  20   1.67%
        paintArc.setColor(Color.LTGRAY);
        canvas.drawArc(200, 100, 800, 700, 7.524f, 6.012f, true, paintArc);
        path.reset();
        path.moveTo(500 + 300 * (float) Math.cos(Math.toRadians(10.536)), 400 + 300 * (float) Math.sin(Math.toRadians(10.536)));
        path.lineTo(820,400 + 300 * (float) Math.sin(Math.toRadians(10.536)));
        path.lineTo(830,400 + 300 * (float) Math.sin(Math.toRadians(10.536))+20);
        path.lineTo(850,400 + 300 * (float) Math.sin(Math.toRadians(10.536))+20);
        canvas.drawPath(path,paintLine);
        canvas.drawText("Ice Cream Sandwich",850,400 + 300 * (float) Math.sin(Math.toRadians(10.536))+20,paintText);
        //JB   200  16.73%
        paintArc.setColor(Color.GREEN);
        canvas.drawArc(200, 100, 800, 700, 13.536f, 60.228f, true, paintArc);
        path.reset();
        path.moveTo(500 + 300 * (float) Math.cos(Math.toRadians(43.536)), 400 + 300 * (float) Math.sin(Math.toRadians(43.536)));
        path.lineTo(500 + 300 * (float) Math.cos(Math.toRadians(43.536))+20,400 + 300 * (float) Math.sin(Math.toRadians(43.536))+20);
        path.lineTo(850,400 + 300 * (float) Math.sin(Math.toRadians(43.536))+20);
        canvas.drawPath(path,paintLine);
        canvas.drawText("Jelly Bean",850,400 + 300 * (float) Math.sin(Math.toRadians(43.536))+20,paintText);
        //Kitkat   350  29.29%
        paintArc.setColor(Color.BLUE);
        canvas.drawArc(200, 100, 800, 700, 73.764f, 105.444f, true, paintArc);
        path.reset();
        path.moveTo(500 - 300 * (float) Math.sin(Math.toRadians(36.486)), 400 + 300 * (float) Math.cos(Math.toRadians(36.486)));
        path.lineTo(500 - 300 * (float) Math.sin(Math.toRadians(36.486))-20,400 + 300 * (float) Math.cos(Math.toRadians(36.486))+20);
        path.lineTo(150,400 + 300 * (float) Math.cos(Math.toRadians(36.486))+20);
        canvas.drawPath(path,paintLine);
        paintText.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText("Kitkat",150,400 + 300 * (float) Math.cos(Math.toRadians(36.486))+20,paintText);
        //L    450   37.66%
        paintArc.setColor(Color.RED);
        if (isRedSelected) {
            canvas.drawArc(200 - moveValue, 100 - moveValue, 800 - moveValue, 700 - moveValue, 179.208f, 135.576f, true, paintArc);
        } else {
            canvas.drawArc(200, 100, 800, 700, 179.208f, 135.576f, true, paintArc);
            path.reset();
            path.moveTo(500-300 * (float) Math.cos(Math.toRadians(67)), 400 - 300 * (float) Math.sin(Math.toRadians(67)));
            path.lineTo(500-300 * (float) Math.cos(Math.toRadians(67))-20, 400 - 300 * (float) Math.sin(Math.toRadians(67))-20);
            path.lineTo(150,400 - 300 * (float) Math.sin(Math.toRadians(67))-20);
            canvas.drawPath(path,paintLine);
            paintText.setTextAlign(Paint.Align.RIGHT);
            canvas.drawText("Lollipop",150,400 - 300 * (float) Math.sin(Math.toRadians(67))-20,paintText);
        }

        //M    150  12.55%
        paintArc.setColor(Color.YELLOW);
        canvas.drawArc(200, 100, 800, 700, 314.784f, 45.18f, true, paintArc);
        path.reset();
        path.moveTo(500 + 300 * (float) Math.sin(Math.toRadians(67.374)), 400 - 300 * (float) Math.cos(Math.toRadians(67.374)));
        path.lineTo(500 + 300 * (float) Math.sin(Math.toRadians(67.374))+20,400 - 300 * (float) Math.cos(Math.toRadians(67.374))-20);
        path.lineTo(850,400 - 300 * (float) Math.cos(Math.toRadians(67.374))-20);
        canvas.drawPath(path,paintLine);
        paintText.setTextAlign(Paint.Align.LEFT);//这里要再切回默认，LEFT
        canvas.drawText("Marshmallow",850,400 - 300 * (float) Math.cos(Math.toRadians(67.374))-20,paintText);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                float eventX = event.getX();
                float eventY = event.getY();
                double distance = Math.sqrt(Math.pow(eventX - 500, 2) + Math.pow(eventY - 400, 2));
                double degrees = 0;
                if (distance <= 300) {//点击在圆内
                    int which = touchOnWhichPart(event);
                    switch (which) {
                        case PART_ONE:
                            //这里使用atan2方法，求正切的反函数，得到是一个-π到π的弧度值
                            //然后使用toDegreses()方法转换为角度
                            degrees = Math.toDegrees(Math.atan2(eventY - 400, eventX - 500));//弧度转为角度
                            Log.e("degrees", degrees + "");
                            break;
                        case PART_TWO:
                            degrees = Math.toDegrees(Math.atan2(500 - eventX, eventY - 400)) + 90;
                            Log.e("degrees", degrees + "");
                            break;
                        case PART_THREE:
                            degrees = Math.toDegrees(Math.atan2(500 - eventX, 400 - eventY)) + 180;
                            Log.e("degrees", degrees + "");
                            break;
                        case PART_FOUR:
                            degrees = Math.toDegrees(Math.atan2(eventX - 500, 400 - eventY)) + 270;
                            Log.e("degrees", degrees + "");
                            break;
                    }

                    //这里以红色为例，红色占据的度数范围是（179.208f，314.784f）
                    //所以只要degrees在此范围的，都是点击的红色区域
                    if (degrees > 179.208f && degrees < 314.784f) {
                        if (isRedSelected) {
                            isRedSelected = false;
                            invalidate();
                            moveValue = 0;
                        } else {
                            isRedSelected = true;
                            while (moveValue <= 20) {
                                invalidate();
                                moveValue += 5;
                            }

                        }

                    }
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    /**
     * 3  |  4
     * ---|----
     * 2  |  1
     * 圆被分成四等份，判断点击在圆的哪一部分
     * 这里1为绘制开始的部分，即 0-90°
     */
    private int touchOnWhichPart(MotionEvent event) {
        if (event.getX() > 500) {
            if (event.getY() > 400) return PART_ONE;
            else return PART_FOUR;
        } else {
            if (event.getY() > 400) return PART_TWO;
            else return PART_THREE;
        }
    }
}

package com.example.study.myapplication6;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.WindowManager;

public class DrawView extends View {

    Paint paint = new Paint();
    Point screen=new Point();
    float scaling= (float) 0.8;
    float height,width;

    public DrawView(Context context) {
        super(context);
        paint.setColor(Color.BLUE);
        WindowManager wm= (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display d=wm.getDefaultDisplay();
        d.getSize(screen);
        width=screen.x;
        height=screen.y;
    }

    @Override
    public void onDraw(Canvas canvas){

        canvas.save();
        canvas.scale(scaling,scaling);
        canvas.rotate(-15);
        paint.setStrokeWidth(10);
     //   canvas.translate(0,50);
        canvas.drawLine(0, 0, 0, height, paint);
        canvas.drawLine(0, height/2,width/5,height/2, paint);
        canvas.drawLine(width/5, 0,width/5, height, paint);

        canvas.translate(width/5+20,0);
        canvas.drawLine(0,0,0,height, paint);
        canvas.drawLine(0, 0, width/5, 0, paint);
        canvas.drawLine(0,height/2, width/5,height/2, paint);
        canvas.drawLine(0, height, width/5, height, paint);

        canvas.translate(width/5+20,0);
        canvas.drawLine(0,0,0,height, paint);
        canvas.drawLine(0,height,width/5,height, paint);

        canvas.translate(width/5+20,0);
        canvas.drawLine(0,0,0,height, paint);
        canvas.drawLine(0,height,width/5,height, paint);

        canvas.translate(width/5+20,0);
        RectF oval=new RectF(0,0,width/5,height);
        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawOval(oval,paint);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawOval(oval,paint);
        canvas.restore();
    }

}

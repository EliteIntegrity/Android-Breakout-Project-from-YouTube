package com.gamecodeschool.breakout;

import android.graphics.RectF;

public class Brick {

    private RectF rect;

    private boolean isVisible;

    Brick(int row, int column, int width, int height){

        isVisible = true;

        int padding = 1;

        rect = new RectF(column * width + padding,
                row * height + padding,
                column * width + width - padding,
                row * height + height - padding);
    }

    RectF getRect(){
        return this.rect;
    }

    void setInvisible(){
        isVisible = false;
    }

    boolean getVisibility(){
        return isVisible;
    }
}

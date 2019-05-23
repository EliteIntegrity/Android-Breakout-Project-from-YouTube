package com.gamecodeschool.breakout;

import android.graphics.RectF;

import java.util.Random;

public class Ball {

    private RectF rect;
    private float xVelocity;
    private float yVelocity;
    private float ballWidth = 10;
    private float ballHeight = 10;

    Ball(){

        xVelocity = 200;
        yVelocity = -400;

        rect = new RectF();
    }

    RectF getRect(){
        return rect;
    }

    void update(long fps){
        rect.left = rect.left + (xVelocity / fps);
        rect.top = rect.top + (yVelocity / fps);
        rect.right = rect.left + ballWidth;
        rect.bottom = rect.top - ballHeight;
    }

    void reverseYVelocity(){
        yVelocity = -yVelocity;
    }

    void reverseXVelocity(){
        xVelocity = - xVelocity;
    }

    void setRandomXVelocity(){
        Random generator = new Random();
        int answer = generator.nextInt(2);

        if(answer == 0){
            reverseXVelocity();
        }
    }

    void clearObstacleY(float y){
        rect.bottom = y;
        rect.top = y - ballHeight;
    }

    void clearObstacleX(float x){
        rect.left = x;
        rect.right = x + ballWidth;
    }

    void reset(int x, int y){
        rect.left = x / 2;
        rect.top = y - 20;
        rect.right = x / 2 + ballWidth;
        rect.bottom = y - 20 - ballHeight;
    }
}

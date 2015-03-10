package com.sarahserussi.mainactivity;

/**
 * Created by sarahserussi on 04.03.15.
 */
public class Ball {

    private int ballPositionX;
    private int ballPositionY;
    private int ballSpeedX;
    private int ballSpeedY;
    private Speed speed;
    private int superspeedtest;

    /* method that toggles direction */

    public int getBallPositionX() {
        return ballPositionX;
    }

    public void setBallPositionX(int ballPositionX) {
        this.ballPositionX = ballPositionX;
    }

    public int getBallPositionY() {
        return ballPositionY;
    }

    public void setBallPositionY(int ballPositionY) {
        this.ballPositionY = ballPositionY;
    }

    public Speed getSpeed() { return speed; }

    public void setSpeed(Speed speed) { this.speed = speed; }
}

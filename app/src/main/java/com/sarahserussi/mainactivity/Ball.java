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
    private int testHakon;

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

    /* checks if the ball touches the player, needs editing (bitmapRect) */
    public boolean touchesPlayer(Player player){
        if(this.getBallPositionX() == player.getPositionX()
                && this.getBallPositionY() == player.getPositionY()){
            return true;
        } else {
            return false;
        }
    }
}

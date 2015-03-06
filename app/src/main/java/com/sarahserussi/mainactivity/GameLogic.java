package com.sarahserussi.mainactivity;

/**
 * Created by sarahserussi on 04.03.15.
 */
public class GameLogic {

    private Ball ball;
    private int screenWidth;
    private int screenHeight;
    private Score score;
    private Player player1; //player on the left side
    private Player player2; //player on the right side
    private Speed speed;

    private int speed2;

    /* method that ensures the ball bounces off of the walls, but not the ceiling */
    private void bounceWall(){

    }
    /* method that ensures the ball bounces off of the player */
    private void bouncePlayer(){

    }

    /* method that checks if the ball is dropped on the ground and gives point to the winning player*/
    private boolean checkBallDroppedAndGivePoints(){
        if (ball.getBallPositionY() >= screenHeight){
            if (checkSideOfBall() == -1){
                score.addPoint(player2);
            } else if (checkSideOfBall() == 1){
                score.addPoint(player1);
            }
            return true;
        } else {
            return false;
        }
    }

     /* check if a player has won */
    private void hasWon(Player player){

    }

    /* check which side of the net the ball has dropped on */
    private int checkSideOfBall(){
        if (ball.getBallPositionX() < screenWidth/2){
            return -1;
        } else if (ball.getBallPositionX() > screenWidth/2){
            return 1;
        }
        return 0;
    }

    /* check if the ball collides with the left wall OBS! check logic!*/
    public void checkLeftWallCollision(Ball ball) {
        if (ball.getSpeed().getxDirection() == Speed.DIRECTION_LEFT
                && ball.getBallPositionX() / 2 <= 0) {
            ball.getSpeed().toggleXDirection();
        }
    }

    /* check if the ball collides with the right wall OBS! check logic!*/
    public void checkRightWallCollision(Ball ball) {
        if (ball.getSpeed().getxDirection() == Speed.DIRECTION_RIGHT
                && ball.getBallPositionX() + ball.getBitmap().getWidth() / 2 >= screenWidth) {
            /* need to add the width of the bitmap to check outer position of the ball */
            ball.getSpeed().toggleXDirection();
        }
    }

    /* check if the ball collides with the bottom wall OBS! check logic!*/
    public void checkBottomWallCollision(Ball ball) {
        if (ball.getSpeed().getyDirection() == Speed.DIRECTION_DOWN
                && ball.getBallPositionY() + ball.getBitmap().getHeight() / 2 >= screenHeight) {
            ball.getSpeed().toggleYDirection();
        }
    }

    /* check if the ball collides with the top wall OBS! check logic!*/
    public void checkTopWallCollision(Ball ball){

    }
}

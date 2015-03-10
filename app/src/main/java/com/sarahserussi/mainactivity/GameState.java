package com.sarahserussi.mainactivity;

import android.view.MotionEvent;
import android.view.WindowManager;

/**
 * Created by sarahserussi on 04.03.15.
 */
public class GameState {

    /* Where the touch methods go */

    /* init */
    public GameState () {
        //add player
        //set player to startPos
        //add background
        //add ball
        //set ball to servePos
        //set new score
        
    }

    public void update (MotionEvent e) {
        //move player
        //if touchPos is left of playerPos - move player left
        //if touchPos is right of playerPos - move player right
        //player jumps
    }

    public boolean onTouchEvent (MotionEvent event){
        //update(event);
        return true;
    }
}

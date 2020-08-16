package org.learnwithllew.teachingextensions.logo.utils;

import org.learnwithllew.teachingextensions.logo.Turtle;

public class TestableTurtle extends Turtle {

    public TestableTurtle(){
        super.setSpeed(Turtle.TEST_SPEED);
    }
    @Override
    public void setSpeed(int speed) {
         // do nothing
    }

    @Override
    public void show() {
        // do nothing
    }
}

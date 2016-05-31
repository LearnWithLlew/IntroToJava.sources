package org.learnwithllew.teachingextensions.logo.tests;

import org.learnwithllew.teachingextensions.logo.Turtle;

public class TurtleUtils
{

  public static Turtle getTurtle()
  {
    Turtle turtle = new Turtle();
    turtle.setSpeed(Turtle.TEST_SPEED);
    return turtle;
  }
}

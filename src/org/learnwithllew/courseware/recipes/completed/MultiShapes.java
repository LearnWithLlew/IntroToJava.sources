package org.learnwithllew.courseware.recipes.completed;

import org.learnwithllew.teachingextensions.logo.Turtle;
import org.learnwithllew.teachingextensions.logo.TurtlePanel;

import com.spun.util.Colors;

public class MultiShapes
{
  public static void main(String[] args)
  {
    TurtlePanel turtlePanel = Turtle.createTurtlePanel(true);
    for (int i = 3; i <= 18; i += 1)
    {
      launchShape(i, turtlePanel);
    }
  }
  private static void launchShape(int i, TurtlePanel turtlePanel)
  {
    com.spun.util.ThreadLauncher.launch(() -> drawShape(i, turtlePanel));
  }
  private static void drawShape(int sides, TurtlePanel turtlePanel)
  {
    Turtle t = new Turtle(turtlePanel);
    t.setSpeed(9);
    t.setPenWidth(1);
    t.setPenColor(Colors.getRandomColor());
    t.setX(300 - (20 * sides));
    t.setY(400);
    while (true)
    {
      for (int i = 1; i <= sides; i++)
      {
        t.move(100);
        t.turn(360.0 / sides);
      }
      t.penUp();
    }
  }
}

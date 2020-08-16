package org.learnwithllew.courseware.recipes.completed;

import java.awt.Color;

import com.spun.util.LambdaThreadLauncher;
import org.junit.Test;
import org.learnwithllew.teachingextensions.logo.ColorWheel;
import org.learnwithllew.teachingextensions.logo.Turtle;
import org.learnwithllew.teachingextensions.logo.TurtlePanel;

import com.spun.util.Colors;
import org.learnwithllew.teachingextensions.logo.utils.TortoiseUtils;

public class MultiShapes
{

  public static void main(String[] args)
  {
    TurtlePanel turtlePanel = Turtle.createTurtlePanel(true);
    createColors();
    for (int i = 3; i <= 18; i += 1)
    {
      launchShape(i, turtlePanel, ColorWheel.getNextColor());
    }
  }
  private static void createColors()
  {
    ColorWheel.addColor(Colors.Reds.Crimson);
    ColorWheel.addColor(Colors.Oranges.Coral);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    ColorWheel.addColor(Colors.Greens.LightGreen);
    ColorWheel.addColor(Colors.Greens.DarkSeaGreen);
    ColorWheel.addColor(Colors.Greens.Aquamarine);
    ColorWheel.addColor(Colors.Blues.LightBlue);
    ColorWheel.addColor(Colors.Blues.CornflowerBlue);
    ColorWheel.addColor(Colors.Blues.DarkBlue);
    ColorWheel.addColor(Colors.Purples.BlueViolet);
    ColorWheel.addColor(Colors.Purples.Indigo);
    ColorWheel.addColor(Colors.Purples.Purple);
  }
  private static void launchShape(int i, TurtlePanel turtlePanel, Color color)
  {
    new LambdaThreadLauncher(() -> drawShape(i, turtlePanel, color));
  }
  private static void drawShape(int sides, TurtlePanel turtlePanel, Color color)
  {
    Turtle t = initTurtle(sides, turtlePanel, color);
    while (true)
    {
      for (int i = 1; i <= sides; i++)
      {
        t.move(77);
        t.turn(360.0 / sides);
      }
      t.penUp();
    }
  }
  private static Turtle initTurtle(int sides, TurtlePanel turtlePanel, Color color)
  {
    Turtle t = new Turtle(turtlePanel);
    t.setSpeed(9);
    t.turn(-90);
    t.setPenWidth(1);
    t.setPenColor(color);
    t.setY(200 + (14 * sides));
    t.setX(400);
    return t;
  }
}

package org.learnwithllew.teachingextensions.logo.tests;

import junit.framework.TestCase;

import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.learnwithllew.teachingextensions.logo.Colors;
import org.learnwithllew.teachingextensions.logo.Tortoise;
import org.learnwithllew.teachingextensions.logo.Turtle;
import org.learnwithllew.teachingextensions.logo.utils.TortoiseUtils;

public class TortoiseTest extends TestCase
{
  public void testSimpleSquare() throws Exception
  {
    Tortoise.setSpeed(Turtle.TEST_SPEED);
    Tortoise.show();
    int sides = 4;
    for (int i = 1; i <= sides; i++)
    {
      Tortoise.setPenColor(Colors.Blues.Blue);
      Tortoise.move(50);
      Tortoise.turn(90);
    }
    TortoiseUtils.verify();
  }
  public void testBigWidth() throws Exception
  {
    Tortoise.setSpeed(Turtle.TEST_SPEED);
    Tortoise.show();
    Tortoise.setPenColor(Colors.Browns.Maroon);
    Tortoise.setPenWidth(100);
    Tortoise.move(10);
    TortoiseUtils.verify();
  }
}

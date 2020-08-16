package org.learnwithllew.courseware.recipes.completed;

import org.junit.Test;
import org.learnwithllew.teachingextensions.logo.Colors;
import org.learnwithllew.teachingextensions.logo.Tortoise;
import org.learnwithllew.teachingextensions.logo.utils.TortoiseUtils;

public class SimpleSquare
{
  @Test
  public void testCompleted() {
    TortoiseUtils.verifyMain(this.getClass());
  }
  public static void main(String[] args) throws Exception
  {
    //  Show the tortoise --#1
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    Tortoise.setSpeed(10);
    //  Do the following 4 times --#5.1
    for (int i = 1; i <= 4; i++)
    {
      //      Change the color of the line the tortoise draws to "blue" --#4
      Tortoise.setPenColor(Colors.Blues.Blue);
      //      Move the tortoise 50 pixels --#2
      Tortoise.move(50);
      //      Turn the tortoise to the right (90 degrees) --#3
      Tortoise.turn(90);
      //  Repeat --#5.2
    }
  }
}

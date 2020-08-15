package org.learnwithllew.courseware.recipes.quizzes.tests;

import junit.framework.TestCase;

import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.DelayedClipboardReporter;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.learnwithllew.teachingextensions.logo.Colors;
import org.learnwithllew.teachingextensions.logo.Tortoise;
import org.learnwithllew.teachingextensions.logo.Turtle;
import org.learnwithllew.teachingextensions.logo.utils.TortoiseUtils;
import org.learnwithllew.courseware.recipes.quizzes.graders.SimpleSquareQuizGrader;
import org.learnwithllew.courseware.recipes.quizzes.graders.SquareQuiz;


public class SimpleSquareQuizTest extends TestCase
{
  public static class SimpleSquareCorrectQuiz implements SquareQuiz
  {
    public void question1()
    {
      //  Move the tortoise 110 pixels
      Tortoise.move(110);
    }
    public void question2()
    {
      //  Turn the tortoise 1/5 of 360 degrees to the right
      Tortoise.turn(360 / 5);
    }
    public void question3()
    {
      //  Change the color the tortoise draws to yellow
      Tortoise.setPenColor(Colors.Yellows.Yellow);
    }
    public void question4()
    {
      //  Change the width of the line the tortoise draws to 5 pixels
      Tortoise.setPenWidth(5);
    }
  }
  public void testCorrect() throws Exception
  {
    SimpleSquareQuizGrader.TURTLE_SPEED = Turtle.TEST_SPEED;
    new SimpleSquareQuizGrader().grade(new SimpleSquareCorrectQuiz());
    TortoiseUtils.verifyForOs();
  }
  public static class SimpleSquareIncorrectQuiz implements SquareQuiz
  {
    public void question1()
    {
      //  Move the tortoise 110 pixels
      Tortoise.move(75);
    }
    public void question2()
    {
      //  Turn the tortoise 1/5 of 360 degrees to the right
      Tortoise.turn(360.0 / 6);
    }
    public void question3()
    {
      //  Change the color the tortoise draws to yellow
      Tortoise.setPenColor(Colors.Yellows.Gold);
    }
    public void question4()
    {
      //  Change the width of the line the tortoise draws to 5 pixels
      Tortoise.setPenWidth(9);
    }
  }
  public void testIncorrect() throws Exception
  {
    SimpleSquareQuizGrader.TURTLE_SPEED = Turtle.TEST_SPEED;
    new SimpleSquareQuizGrader().grade(new SimpleSquareIncorrectQuiz());
    TortoiseUtils.verifyForOs();
  }
}

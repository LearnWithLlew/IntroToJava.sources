package org.learnwithllew.courseware.recipes.quizzes.tests;

import junit.framework.TestCase;

import org.approvaltests.reporters.DelayedClipboardReporter;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.FileLauncherReporter;
import org.approvaltests.reporters.UseReporter;
import org.learnwithllew.courseware.recipes.quizzes.graders.AdLibsQuizAdapter;
import org.learnwithllew.courseware.recipes.quizzes.graders.AdLibsQuizGrader;
import org.learnwithllew.courseware.recipes.quizzes.graders.TreeQuizGrader;
import org.learnwithllew.teachingextensions.logo.Turtle;
import org.learnwithllew.teachingextensions.logo.utils.TortoiseUtils;
import org.learnwithllew.teachingextensions.simpleparser.Parser;

@UseReporter({DelayedClipboardReporter.class, DiffReporter.class})
public class AdLibsQuizTest extends TestCase
{
  public static class AdLibsCorrectQuiz extends AdLibsQuizAdapter
  {
    public void question1(String letter1, String letter3)
    {
      //set current value of word1 to be letter1 + 'o' + letter3
      word1 = letter1 + "o" + letter3;
    }
    public void question2(String letter1)
    {
      //add the letter1 to the end of word2 
      word2 += letter1;
    }
    public void question3(String templateText, Object model)
    {
      //use the parser to combine the template and the model as word3
      word3 = Parser.parse(templateText, model);
    }
    public void question4(Pieces pieces)
    {
      //set template4 to the template which does'g' + pieces.middle + 'e'
      template4 = "g{middle}e";
    }
  }
  public void testCorrect() throws Exception
  {
    TreeQuizGrader.TURTLE_SPEED = Turtle.TEST_SPEED;
    new AdLibsQuizGrader().grade(new AdLibsCorrectQuiz());
    TortoiseUtils.verifyForOs();
  }
  public static class AdLibsIncorrectQuiz extends AdLibsQuizAdapter
  {
    public void question1(String letter1, String letter3)
    {
    }
    public void question2(String letter1)
    {
    }
    public void question3(String templateText, Object model)
    {
    }
    public void question4(Pieces pieces)
    {
    }
  }
  public void testIncorrect() throws Exception
  {
    TreeQuizGrader.TURTLE_SPEED = Turtle.TEST_SPEED;
    new AdLibsQuizGrader().grade(new AdLibsIncorrectQuiz());
 }
}

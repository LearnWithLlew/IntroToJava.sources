package org.learnwithllew.teachingextensions.logo.tests;

import junit.framework.TestCase;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.ClipboardReporter;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.learnwithllew.teachingextensions.logo.Turtle;

@UseReporter({ClipboardReporter.class, DiffReporter.class})
public class TurtlePanelTest extends TestCase
{
  public void testImageForBackground() throws Exception
  {
    Turtle turtle = TurtleUtils.getTurtle();
    turtle.move(50);
    turtle.getBackgroundWindow().setBackgroundImage(
        "https://raw.githubusercontent.com/LearnWithLlew/IntroToJava.Finnish/master/Graphics/Tortoise.png");
    Approvals.verify(turtle.getImage());
  }
}

package org.learnwithllew.teachingextensions.simpleparser.tests;

import org.approvaltests.Approvals;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.UseReporter;
import org.learnwithllew.teachingextensions.simpleparser.Parser;

import junit.framework.TestCase;

public class ParserTest extends TestCase
{
  private int    a = 1;
  private String b = "howdy";
  public void testSimpleParse() throws Exception
  {
    String text = Parser.parse("This should show \n  a = {a} \n  b = {b}", this);
    Approvals.verify(text);
  }
}

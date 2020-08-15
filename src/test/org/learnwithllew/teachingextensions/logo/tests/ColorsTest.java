package org.learnwithllew.teachingextensions.logo.tests;

import junit.framework.TestCase;

import org.learnwithllew.teachingextensions.logo.Colors;

public class ColorsTest extends TestCase
{
  public void testTransparency() throws Exception
  {
    assertEquals(0, Colors.calculateTransparency(100));
    assertEquals(255, Colors.calculateTransparency(0));
  }
}

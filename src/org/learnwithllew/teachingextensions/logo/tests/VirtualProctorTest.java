package org.learnwithllew.teachingextensions.logo.tests;

import junit.framework.TestCase;

import org.learnwithllew.teachingextensions.utils.VirtualProctor;

public class VirtualProctorTest extends TestCase
{
  public void testSetName() throws Exception
  {
    VirtualProctor.internals.resetName();
    assertEquals("WIN-J2264SMJD6Q", VirtualProctor.internals.getName());
    VirtualProctor.setName("Lynn");
    assertEquals("Lynn", VirtualProctor.internals.getName());
  }
}

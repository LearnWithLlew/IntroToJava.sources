package org.learnwithllew.teachingextensions.setup.tests;

import java.io.File;

import org.junit.Test;
import org.learnwithllew.teachingextensions.setup.SetupConfig;

import com.spun.util.io.ZipUtils;

public class UnzipTest // extends TestCase
{
  public void ptestUnzip() throws Exception
  {
    String zip = "C:/Users/Llewellyn/Downloads/master/eclipse_workspace.zip";
    String dir = "C:/Users/Llewellyn/Downloads/master/";
    ZipUtils.doUnzip(new File(dir), new File(zip));
  }
  @Test
  public void testEclipseForMacPath() throws Exception
  {
    System.out.println("Path=" + SetupConfig.getEclipsePathForMac());
  }
}

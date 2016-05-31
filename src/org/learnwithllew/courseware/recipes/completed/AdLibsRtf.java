package org.learnwithllew.courseware.recipes.completed;

import org.learnwithllew.teachingextensions.simpleparser.Parser;
import org.learnwithllew.teachingextensions.utils.Viewer;
import org.learnwithllew.teachingextensions.windows.MessageBox;

public class AdLibsRtf
{
  public static class Words
  {
    public String adverb;
    public String edVerb;
    public String bodyPart;
  }
  public static void main(String[] args)
  {
    Words word = new Words();
    word.adverb = MessageBox.askForTextInput("What is the adverb?");
    word.edVerb = MessageBox.askForTextInput("What is the -ed verb?");
    word.bodyPart = MessageBox.askForTextInput("What is the body part?");
    String currentStory = Parser.parseRtfFile("view.rtf", word);
    Viewer.displayRtfFile(currentStory);
  }
}
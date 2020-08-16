package org.learnwithllew.teachingextensions.logo.utils;

import org.approvaltests.Approvals;
import org.approvaltests.awt.AwtApprovals;
import org.approvaltests.namer.ApprovalResults;
import org.approvaltests.namer.NamedEnvironment;
import org.approvaltests.namer.NamerFactory;
import org.learnwithllew.teachingextensions.logo.ColorWheel;
import org.learnwithllew.teachingextensions.logo.Colors;
import org.learnwithllew.teachingextensions.logo.Turtle;

import com.spun.util.ObjectUtils;

import java.lang.reflect.InvocationTargetException;

public class TortoiseUtils {
    private static Turtle TURTLE = new Turtle();

    /**
     * Captures an image of the result of your program and displays it to you
     */
    public static void verify() {
        try {
            AwtApprovals.verify(TURTLE.getImage());
        } catch (Exception e) {
            throw ObjectUtils.throwAsError(e);
        } finally {
            TortoiseUtils.resetTurtle();
        }
    }

    public static void resetTurtle() {
        resetTurtle(false);
    }
    public static void resetTurtle(boolean testable) {
        TURTLE.clear();
        TURTLE = testable ? new TestableTurtle(): new Turtle();
    }

    public static void setOrientation(int x, int y, int angle) {
        TURTLE.setX(x);
        TURTLE.setY(y);
        TURTLE.setAngleInDegrees(angle);
    }

    public static Turtle getTurtle() {
        return TURTLE;
    }

    public static void setTurtle(Turtle turtle) {
        TortoiseUtils.TURTLE = turtle;
    }

    public static void verifyForOs() {
        try (NamedEnvironment namedEnvironment = NamerFactory.asOsSpecificTest();) {
            verify();
        }
    }

    public static void writeMessage(String string, int x, int y) {
        TURTLE.setX(x);
        TURTLE.setY(y);
        TURTLE.print(string);
    }

    public static synchronized void verifyMain(Class<?> clazz) {
        try {
            Colors.mockRandom();
            ColorWheel.removeAllColors();
            TortoiseUtils.resetTurtle(true);
            clazz.getMethod("main", String[].class).invoke(null, new Object[]{new String[0]});
            TortoiseUtils.verify();
        } catch (Throwable e) {
            ObjectUtils.throwAsError(e);
        }
    }
}

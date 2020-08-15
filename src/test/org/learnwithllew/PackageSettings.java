package org.learnwithllew;

import org.approvaltests.core.ApprovalFailureReporter;
import org.approvaltests.reporters.DelayedClipboardReporter;
import org.approvaltests.reporters.DiffReporter;
import org.approvaltests.reporters.MultiReporter;

public class PackageSettings {
    public static ApprovalFailureReporter UseReporter = new MultiReporter(new DelayedClipboardReporter(), new DiffReporter());
}

package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaTrackerTest
implements org.j8unit.repository.java.awt.MediaTrackerTests<java.awt.MediaTracker> {

    @Override
    public java.awt.MediaTracker createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.MediaTracker] available.");
    }

}

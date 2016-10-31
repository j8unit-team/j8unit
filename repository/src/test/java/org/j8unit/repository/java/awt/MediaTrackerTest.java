package org.j8unit.repository.java.awt;

import java.awt.MediaTracker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaTrackerTest
implements org.j8unit.repository.java.awt.MediaTrackerTests<MediaTracker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MediaTracker]

    @Override
    public MediaTracker createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.MediaTracker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.MediaTracker]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.MediaTracker]

}

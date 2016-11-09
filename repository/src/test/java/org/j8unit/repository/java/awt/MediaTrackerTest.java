package org.j8unit.repository.java.awt;

import java.awt.MediaTracker;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link MediaTracker} (by simply reusing the
 * J8Unit test interface {@link MediaTrackerTests}).
 */

@RunWith(J8Unit4.class)
public class MediaTrackerTest
implements MediaTrackerTests<MediaTracker> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.MediaTracker]

    @Override
    public MediaTracker createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.awt.MediaTracker], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.MediaTracker]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.MediaTracker]

}

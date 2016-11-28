package org.j8unit.repository.javax.swing;

import javax.swing.Box;
import javax.swing.Box.Filler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Box} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.BoxTests}).
 */
@RunWith(J8Unit4.class)
public class BoxTest
implements BoxTests<Box> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Box]

    @Override
    public Box createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.Box], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Box]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Box]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link Filler} (by simply reusing the
     * J8Unit test interface {@link org.j8unit.repository.javax.swing.BoxTests.FillerTests}).
     */
    @RunWith(J8Unit4.class)
    public static class FillerTest
    implements FillerTests<Filler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Box$Filler]

        @Override
        public Filler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.Box.Filler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.Box$Filler]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.Box$Filler]

    }

}

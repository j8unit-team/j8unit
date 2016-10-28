package org.j8unit.repository.javax.swing;

import javax.swing.Box;
import javax.swing.Box.Filler;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoxTest
implements org.j8unit.repository.javax.swing.BoxTests<Box> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Box]

    @Override
    public Box createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.Box], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Box]

    @RunWith(J8Unit4.class)
    public static class FillerTest
    implements org.j8unit.repository.javax.swing.BoxTests.FillerTests<Filler> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Box$Filler]

        @Override
        public Filler createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.Box.Filler], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.Box$Filler]

    }

}

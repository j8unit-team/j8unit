package org.j8unit.repository.javax.swing;

import javax.swing.ProgressMonitorInputStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ProgressMonitorInputStream} (by
 * simply reusing the J8Unit test interface {@link ProgressMonitorInputStreamTests}).
 */

@RunWith(J8Unit4.class)
public class ProgressMonitorInputStreamTest
implements ProgressMonitorInputStreamTests<ProgressMonitorInputStream> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ProgressMonitorInputStream]

    @Override
    public ProgressMonitorInputStream createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.ProgressMonitorInputStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ProgressMonitorInputStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ProgressMonitorInputStream]

}

package org.j8unit.repository.javax.swing;

import javax.swing.TransferHandler;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.TransferHandler.TransferSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TransferHandler} (by simply reusing
 * the J8Unit test interface {@link TransferHandlerTests}).
 */

@RunWith(J8Unit4.class)
public class TransferHandlerTest
implements TransferHandlerTests<TransferHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler]

    @Override
    public TransferHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.TransferHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.TransferHandler]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.TransferHandler]

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link DropLocation} (by simply reusing
     * the J8Unit test interface {@link org.j8unit.repository.javax.swing.TransferHandlerTests.DropLocationTests}).
     */

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.TransferHandlerTests.DropLocationTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler$DropLocation]

        @Override
        public DropLocation createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.TransferHandler.DropLocation], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.TransferHandler$DropLocation]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.TransferHandler$DropLocation]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TransferSupport} (by simply
     * reusing the J8Unit test interface {@link TransferSupportTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TransferSupportTest
    implements TransferSupportTests<TransferSupport> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler$TransferSupport]

        @Override
        public TransferSupport createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.TransferHandler.TransferSupport], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.TransferHandler$TransferSupport]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.TransferHandler$TransferSupport]

    }

}

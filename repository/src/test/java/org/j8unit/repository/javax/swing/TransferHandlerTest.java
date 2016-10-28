package org.j8unit.repository.javax.swing;

import javax.swing.TransferHandler;
import javax.swing.TransferHandler.DropLocation;
import javax.swing.TransferHandler.TransferSupport;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransferHandlerTest
implements org.j8unit.repository.javax.swing.TransferHandlerTests<TransferHandler> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler]

    @Override
    public TransferHandler createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.TransferHandler], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler]

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.TransferHandlerTests.DropLocationTests<DropLocation> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler$DropLocation]

        @Override
        public DropLocation createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.TransferHandler.DropLocation], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler$DropLocation]

    }

    @RunWith(J8Unit4.class)
    public static class TransferSupportTest
    implements org.j8unit.repository.javax.swing.TransferHandlerTests.TransferSupportTests<TransferSupport> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler$TransferSupport]

        @Override
        public TransferSupport createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.TransferHandler.TransferSupport], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.TransferHandler$TransferSupport]

    }

}

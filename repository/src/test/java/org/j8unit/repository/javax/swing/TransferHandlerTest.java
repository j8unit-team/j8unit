package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransferHandlerTest
implements org.j8unit.repository.javax.swing.TransferHandlerTests<javax.swing.TransferHandler> {

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.TransferHandlerTests.DropLocationTests<javax.swing.TransferHandler.DropLocation> {

        @Override
        public javax.swing.TransferHandler.DropLocation createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.TransferHandler.DropLocation] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class TransferSupportTest
    implements org.j8unit.repository.javax.swing.TransferHandlerTests.TransferSupportTests<javax.swing.TransferHandler.TransferSupport> {

        @Override
        public javax.swing.TransferHandler.TransferSupport createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.TransferHandler.TransferSupport] available.");
        }

    }

    @Override
    public javax.swing.TransferHandler createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [javax.swing.TransferHandler] available.");
    }

}

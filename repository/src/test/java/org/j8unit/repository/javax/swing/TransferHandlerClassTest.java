package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransferHandlerClassTest
implements org.j8unit.repository.javax.swing.TransferHandlerClassTests<javax.swing.TransferHandler> {

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.TransferHandlerClassTests.DropLocationClassTests<javax.swing.TransferHandler.DropLocation> {

        @Override
        public Class<javax.swing.TransferHandler.DropLocation> createNewSUT() {
            return javax.swing.TransferHandler.DropLocation.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class TransferSupportClassTest
    implements org.j8unit.repository.javax.swing.TransferHandlerClassTests.TransferSupportClassTests<javax.swing.TransferHandler.TransferSupport> {

        @Override
        public Class<javax.swing.TransferHandler.TransferSupport> createNewSUT() {
            return javax.swing.TransferHandler.TransferSupport.class;
        }

    }

    @Override
    public Class<javax.swing.TransferHandler> createNewSUT() {
        return javax.swing.TransferHandler.class;
    }

}

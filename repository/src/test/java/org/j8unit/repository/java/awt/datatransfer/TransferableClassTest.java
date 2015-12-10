package org.j8unit.repository.java.awt.datatransfer;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransferableClassTest
implements org.j8unit.repository.java.awt.datatransfer.TransferableClassTests<java.awt.datatransfer.Transferable> {

    @Override
    public Class<java.awt.datatransfer.Transferable> createNewSUT() {
        return java.awt.datatransfer.Transferable.class;
    }

}

package org.j8unit.repository.java.awt.datatransfer;

import java.awt.datatransfer.Transferable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TransferableTest
implements org.j8unit.repository.java.awt.datatransfer.TransferableTests<Transferable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.Transferable]

    @Override
    public Transferable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.datatransfer.Transferable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.datatransfer.Transferable]

}

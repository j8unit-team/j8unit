package org.j8unit.repository.java.rmi.dgc;

import java.rmi.dgc.DGC;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DGCTest
implements org.j8unit.repository.java.rmi.dgc.DGCTests<DGC> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.dgc.DGC]

    @Override
    public DGC createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.dgc.DGC], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.dgc.DGC]

}

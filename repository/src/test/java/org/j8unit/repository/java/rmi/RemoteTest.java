package org.j8unit.repository.java.rmi;

import java.rmi.Remote;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RemoteTest
implements org.j8unit.repository.java.rmi.RemoteTests<Remote> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.Remote]

    @Override
    public Remote createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.rmi.Remote], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.rmi.Remote]

}

package org.j8unit.repository.javax.rmi;

import javax.rmi.PortableRemoteObject;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PortableRemoteObjectTest
implements org.j8unit.repository.javax.rmi.PortableRemoteObjectTests<PortableRemoteObject> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.PortableRemoteObject]

    @Override
    public PortableRemoteObject createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.rmi.PortableRemoteObject], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.rmi.PortableRemoteObject]

}

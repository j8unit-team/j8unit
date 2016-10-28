package org.j8unit.repository.org.omg.PortableServer.POAPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableServer.POAPackage.InvalidPolicyHelper;

@RunWith(J8Unit4.class)
public class InvalidPolicyHelperTest
implements org.j8unit.repository.org.omg.PortableServer.POAPackage.InvalidPolicyHelperTests<InvalidPolicyHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.InvalidPolicyHelper]

    @Override
    public InvalidPolicyHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableServer.POAPackage.InvalidPolicyHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableServer.POAPackage.InvalidPolicyHelper]

}

package org.j8unit.repository.org.omg.PortableInterceptor;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.PortableInterceptor.InvalidSlotHelper;

@RunWith(J8Unit4.class)
public class InvalidSlotHelperTest
implements org.j8unit.repository.org.omg.PortableInterceptor.InvalidSlotHelperTests<InvalidSlotHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.InvalidSlotHelper]

    @Override
    public InvalidSlotHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.PortableInterceptor.InvalidSlotHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.PortableInterceptor.InvalidSlotHelper]

}

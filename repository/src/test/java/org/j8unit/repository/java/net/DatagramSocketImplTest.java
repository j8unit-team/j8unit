package org.j8unit.repository.java.net;

import java.net.DatagramSocketImpl;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatagramSocketImplTest
implements org.j8unit.repository.java.net.DatagramSocketImplTests<DatagramSocketImpl> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.DatagramSocketImpl]

    @Override
    public DatagramSocketImpl createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.DatagramSocketImpl], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.DatagramSocketImpl]

}

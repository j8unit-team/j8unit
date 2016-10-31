package org.j8unit.repository.java.net;

import java.net.DatagramSocketImplFactory;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DatagramSocketImplFactoryTest
implements org.j8unit.repository.java.net.DatagramSocketImplFactoryTests<DatagramSocketImplFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.net.DatagramSocketImplFactory]

    @Override
    public DatagramSocketImplFactory createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.net.DatagramSocketImplFactory], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.net.DatagramSocketImplFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.net.DatagramSocketImplFactory]

}

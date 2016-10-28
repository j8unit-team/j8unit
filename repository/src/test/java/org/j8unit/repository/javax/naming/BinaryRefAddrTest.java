package org.j8unit.repository.javax.naming;

import javax.naming.BinaryRefAddr;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BinaryRefAddrTest
implements org.j8unit.repository.javax.naming.BinaryRefAddrTests<BinaryRefAddr> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.BinaryRefAddr]

    @Override
    public BinaryRefAddr createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.naming.BinaryRefAddr], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.BinaryRefAddr]

}

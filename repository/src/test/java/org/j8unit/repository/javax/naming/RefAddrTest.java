package org.j8unit.repository.javax.naming;

import javax.naming.RefAddr;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RefAddrTest
implements org.j8unit.repository.javax.naming.RefAddrTests<RefAddr> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.naming.RefAddr]

    @Override
    public RefAddr createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.naming.RefAddr], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.naming.RefAddr]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.naming.RefAddr]

}

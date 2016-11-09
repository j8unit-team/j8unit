package org.j8unit.repository.javax.transaction.xa;

import javax.transaction.xa.XAResource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link XAResource} (by simply reusing the
 * J8Unit test interface {@link XAResourceTests}).
 */

@RunWith(J8Unit4.class)
public class XAResourceTest
implements XAResourceTests<XAResource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.transaction.xa.XAResource]

    @Override
    public XAResource createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.transaction.xa.XAResource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.transaction.xa.XAResource]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.transaction.xa.XAResource]

}

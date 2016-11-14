package org.j8unit.repository.javax.transaction.xa;

import javax.transaction.xa.Xid;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Xid} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.transaction.xa.XidTests}).
 */

@RunWith(J8Unit4.class)
public class XidTest
implements XidTests<Xid> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.transaction.xa.Xid]

    @Override
    public Xid createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.transaction.xa.Xid], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.transaction.xa.Xid]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.transaction.xa.Xid]

}

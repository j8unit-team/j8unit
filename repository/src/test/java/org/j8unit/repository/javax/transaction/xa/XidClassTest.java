package org.j8unit.repository.javax.transaction.xa;

import javax.transaction.xa.Xid;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Xid} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.transaction.xa.XidClassTests}).
 */
@RunWith(J8Unit4.class)
public class XidClassTest
implements XidClassTests<Xid> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.transaction.xa.Xid]

    @Override
    public Class<Xid> createNewSUT() {
        return Xid.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.transaction.xa.Xid]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.transaction.xa.Xid]

}

package org.j8unit.repository.javax.transaction.xa;

import javax.transaction.xa.Xid;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XidClassTest
implements org.j8unit.repository.javax.transaction.xa.XidClassTests<Xid> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.transaction.xa.Xid]

    @Override
    public Class<Xid> createNewSUT() {
        return Xid.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.transaction.xa.Xid]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.transaction.xa.Xid]

}

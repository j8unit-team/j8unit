package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XidClassTest
implements org.j8unit.repository.javax.transaction.xa.XidClassTests<javax.transaction.xa.Xid> {

    @Override
    public Class<javax.transaction.xa.Xid> createNewSUT() {
        return javax.transaction.xa.Xid.class;
    }

}

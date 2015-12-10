package org.j8unit.repository.javax.transaction.xa;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XAResourceClassTest
implements org.j8unit.repository.javax.transaction.xa.XAResourceClassTests<javax.transaction.xa.XAResource> {

    @Override
    public Class<javax.transaction.xa.XAResource> createNewSUT() {
        return javax.transaction.xa.XAResource.class;
    }

}

package org.j8unit.repository.javax.transaction.xa;

import javax.transaction.xa.XAResource;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XAResourceClassTest
implements org.j8unit.repository.javax.transaction.xa.XAResourceClassTests<XAResource> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.transaction.xa.XAResource]

    @Override
    public Class<XAResource> createNewSUT() {
        return XAResource.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.transaction.xa.XAResource]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.transaction.xa.XAResource]

}

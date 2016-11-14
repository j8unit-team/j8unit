package org.j8unit.repository.org.omg.stub.java.rmi;

import org.junit.Test;
import org.omg.CORBA.BAD_OPERATION;
import org.omg.stub.java.rmi._Remote_Stub;

/**
 * @since 0.9.7
 */
public class _Remote_StubBugs {

    @Test(expected = BAD_OPERATION.class)
    public void hashCodeThrowsAnException() {
        final _Remote_StubTests<_Remote_Stub> rs = _Remote_Stub::new;
        rs.hashCodeMustBeConsistent();
    }

}

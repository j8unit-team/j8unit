package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OperationNotSupportedExceptionClassTest
implements org.j8unit.repository.javax.naming.OperationNotSupportedExceptionClassTests<javax.naming.OperationNotSupportedException> {

    @Override
    public Class<javax.naming.OperationNotSupportedException> createNewSUT() {
        return javax.naming.OperationNotSupportedException.class;
    }

}

package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OperationNotSupportedExceptionTest
implements org.j8unit.repository.javax.naming.OperationNotSupportedExceptionTests<javax.naming.OperationNotSupportedException> {

    @Override
    public javax.naming.OperationNotSupportedException createNewSUT() {
        return new javax.naming.OperationNotSupportedException();
    }

}

package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OperationsExceptionTest
implements org.j8unit.repository.javax.management.OperationsExceptionTests<javax.management.OperationsException> {

    @Override
    public javax.management.OperationsException createNewSUT() {
        return new javax.management.OperationsException();
    }

}

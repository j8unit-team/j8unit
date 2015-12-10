package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OperationsExceptionClassTest
implements org.j8unit.repository.javax.management.OperationsExceptionClassTests<javax.management.OperationsException> {

    @Override
    public Class<javax.management.OperationsException> createNewSUT() {
        return javax.management.OperationsException.class;
    }

}

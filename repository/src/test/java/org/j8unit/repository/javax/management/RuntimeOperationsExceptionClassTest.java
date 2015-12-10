package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RuntimeOperationsExceptionClassTest
implements org.j8unit.repository.javax.management.RuntimeOperationsExceptionClassTests<javax.management.RuntimeOperationsException> {

    @Override
    public Class<javax.management.RuntimeOperationsException> createNewSUT() {
        return javax.management.RuntimeOperationsException.class;
    }

}

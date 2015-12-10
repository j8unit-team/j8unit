package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BadStringOperationExceptionClassTest
implements org.j8unit.repository.javax.management.BadStringOperationExceptionClassTests<javax.management.BadStringOperationException> {

    @Override
    public Class<javax.management.BadStringOperationException> createNewSUT() {
        return javax.management.BadStringOperationException.class;
    }

}

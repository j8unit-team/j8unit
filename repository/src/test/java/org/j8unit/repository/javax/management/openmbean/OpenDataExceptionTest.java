package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class OpenDataExceptionTest
implements org.j8unit.repository.javax.management.openmbean.OpenDataExceptionTests<javax.management.openmbean.OpenDataException> {

    @Override
    public javax.management.openmbean.OpenDataException createNewSUT() {
        return new javax.management.openmbean.OpenDataException();
    }

}

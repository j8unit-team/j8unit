package org.j8unit.repository.javax.management.openmbean;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidOpenTypeExceptionClassTest
implements org.j8unit.repository.javax.management.openmbean.InvalidOpenTypeExceptionClassTests<javax.management.openmbean.InvalidOpenTypeException> {

    @Override
    public Class<javax.management.openmbean.InvalidOpenTypeException> createNewSUT() {
        return javax.management.openmbean.InvalidOpenTypeException.class;
    }

}

package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MalformedObjectNameExceptionClassTest
implements org.j8unit.repository.javax.management.MalformedObjectNameExceptionClassTests<javax.management.MalformedObjectNameException> {

    @Override
    public Class<javax.management.MalformedObjectNameException> createNewSUT() {
        return javax.management.MalformedObjectNameException.class;
    }

}

package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JMRuntimeExceptionClassTest
implements org.j8unit.repository.javax.management.JMRuntimeExceptionClassTests<javax.management.JMRuntimeException> {

    @Override
    public Class<javax.management.JMRuntimeException> createNewSUT() {
        return javax.management.JMRuntimeException.class;
    }

}

package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntrospectionExceptionTest
implements org.j8unit.repository.javax.management.IntrospectionExceptionTests<javax.management.IntrospectionException> {

    @Override
    public javax.management.IntrospectionException createNewSUT() {
        return new javax.management.IntrospectionException();
    }

}

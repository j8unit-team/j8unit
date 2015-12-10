package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntrospectionExceptionClassTest
implements org.j8unit.repository.javax.management.IntrospectionExceptionClassTests<javax.management.IntrospectionException> {

    @Override
    public Class<javax.management.IntrospectionException> createNewSUT() {
        return javax.management.IntrospectionException.class;
    }

}

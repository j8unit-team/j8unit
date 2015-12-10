package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntrospectionExceptionClassTest
implements org.j8unit.repository.java.beans.IntrospectionExceptionClassTests<java.beans.IntrospectionException> {

    @Override
    public Class<java.beans.IntrospectionException> createNewSUT() {
        return java.beans.IntrospectionException.class;
    }

}

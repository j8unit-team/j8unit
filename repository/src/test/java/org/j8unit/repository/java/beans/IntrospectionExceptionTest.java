package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IntrospectionExceptionTest
implements org.j8unit.repository.java.beans.IntrospectionExceptionTests<java.beans.IntrospectionException> {

    @Override
    public java.beans.IntrospectionException createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.beans.IntrospectionException] available.");
    }

}

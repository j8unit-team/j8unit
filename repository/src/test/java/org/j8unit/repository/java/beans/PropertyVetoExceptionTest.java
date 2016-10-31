package org.j8unit.repository.java.beans;

import java.beans.PropertyVetoException;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyVetoExceptionTest
implements org.j8unit.repository.java.beans.PropertyVetoExceptionTests<PropertyVetoException> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.beans.PropertyVetoException]

    @Override
    public PropertyVetoException createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.beans.PropertyVetoException], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.beans.PropertyVetoException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.beans.PropertyVetoException]

}

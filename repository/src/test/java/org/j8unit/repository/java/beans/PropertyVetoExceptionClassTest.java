package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertyVetoExceptionClassTest
implements org.j8unit.repository.java.beans.PropertyVetoExceptionClassTests<java.beans.PropertyVetoException> {

    @Override
    public Class<java.beans.PropertyVetoException> createNewSUT() {
        return java.beans.PropertyVetoException.class;
    }

}

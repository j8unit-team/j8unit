package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoClassDefFoundErrorTest
implements org.j8unit.repository.java.lang.NoClassDefFoundErrorTests<java.lang.NoClassDefFoundError> {

    @Override
    public java.lang.NoClassDefFoundError createNewSUT() {
        return new java.lang.NoClassDefFoundError();
    }

}

package org.j8unit.repository.java.lang;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NoClassDefFoundErrorClassTest
implements org.j8unit.repository.java.lang.NoClassDefFoundErrorClassTests<java.lang.NoClassDefFoundError> {

    @Override
    public Class<java.lang.NoClassDefFoundError> createNewSUT() {
        return java.lang.NoClassDefFoundError.class;
    }

}

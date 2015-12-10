package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MissingResourceExceptionClassTest
implements org.j8unit.repository.java.util.MissingResourceExceptionClassTests<java.util.MissingResourceException> {

    @Override
    public Class<java.util.MissingResourceException> createNewSUT() {
        return java.util.MissingResourceException.class;
    }

}

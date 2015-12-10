package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertiesTest
implements org.j8unit.repository.java.util.PropertiesTests<java.util.Properties> {

    @Override
    public java.util.Properties createNewSUT() {
        return new java.util.Properties();
    }

}

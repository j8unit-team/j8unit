package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PropertiesClassTest
implements org.j8unit.repository.java.util.PropertiesClassTests<java.util.Properties> {

    @Override
    public Class<java.util.Properties> createNewSUT() {
        return java.util.Properties.class;
    }

}

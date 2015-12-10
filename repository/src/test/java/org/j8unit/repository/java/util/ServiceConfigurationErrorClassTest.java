package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceConfigurationErrorClassTest
implements org.j8unit.repository.java.util.ServiceConfigurationErrorClassTests<java.util.ServiceConfigurationError> {

    @Override
    public Class<java.util.ServiceConfigurationError> createNewSUT() {
        return java.util.ServiceConfigurationError.class;
    }

}

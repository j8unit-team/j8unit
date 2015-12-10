package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ServiceConfigurationErrorTest
implements org.j8unit.repository.java.util.ServiceConfigurationErrorTests<java.util.ServiceConfigurationError> {

    @Override
    public java.util.ServiceConfigurationError createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.ServiceConfigurationError] available.");
    }

}

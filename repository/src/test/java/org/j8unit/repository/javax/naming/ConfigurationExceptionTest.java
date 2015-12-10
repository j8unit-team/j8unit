package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConfigurationExceptionTest
implements org.j8unit.repository.javax.naming.ConfigurationExceptionTests<javax.naming.ConfigurationException> {

    @Override
    public javax.naming.ConfigurationException createNewSUT() {
        return new javax.naming.ConfigurationException();
    }

}

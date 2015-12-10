package org.j8unit.repository.javax.naming;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ConfigurationExceptionClassTest
implements org.j8unit.repository.javax.naming.ConfigurationExceptionClassTests<javax.naming.ConfigurationException> {

    @Override
    public Class<javax.naming.ConfigurationException> createNewSUT() {
        return javax.naming.ConfigurationException.class;
    }

}

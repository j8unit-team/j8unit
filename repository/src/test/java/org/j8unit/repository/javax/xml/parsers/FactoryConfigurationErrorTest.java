package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FactoryConfigurationErrorTest
implements org.j8unit.repository.javax.xml.parsers.FactoryConfigurationErrorTests<javax.xml.parsers.FactoryConfigurationError> {

    @Override
    public javax.xml.parsers.FactoryConfigurationError createNewSUT() {
        return new javax.xml.parsers.FactoryConfigurationError();
    }

}

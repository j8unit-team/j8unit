package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FactoryConfigurationErrorClassTest
implements org.j8unit.repository.javax.xml.parsers.FactoryConfigurationErrorClassTests<javax.xml.parsers.FactoryConfigurationError> {

    @Override
    public Class<javax.xml.parsers.FactoryConfigurationError> createNewSUT() {
        return javax.xml.parsers.FactoryConfigurationError.class;
    }

}

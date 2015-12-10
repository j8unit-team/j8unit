package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserConfigurationExceptionClassTest
implements org.j8unit.repository.javax.xml.parsers.ParserConfigurationExceptionClassTests<javax.xml.parsers.ParserConfigurationException> {

    @Override
    public Class<javax.xml.parsers.ParserConfigurationException> createNewSUT() {
        return javax.xml.parsers.ParserConfigurationException.class;
    }

}

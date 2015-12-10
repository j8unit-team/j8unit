package org.j8unit.repository.javax.xml.parsers;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ParserConfigurationExceptionTest
implements org.j8unit.repository.javax.xml.parsers.ParserConfigurationExceptionTests<javax.xml.parsers.ParserConfigurationException> {

    @Override
    public javax.xml.parsers.ParserConfigurationException createNewSUT() {
        return new javax.xml.parsers.ParserConfigurationException();
    }

}

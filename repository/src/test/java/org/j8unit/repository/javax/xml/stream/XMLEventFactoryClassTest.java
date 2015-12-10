package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEventFactoryClassTest
implements org.j8unit.repository.javax.xml.stream.XMLEventFactoryClassTests<javax.xml.stream.XMLEventFactory> {

    @Override
    public Class<javax.xml.stream.XMLEventFactory> createNewSUT() {
        return javax.xml.stream.XMLEventFactory.class;
    }

}

package org.j8unit.repository.javax.xml.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MessageFactoryClassTest
implements org.j8unit.repository.javax.xml.soap.MessageFactoryClassTests<javax.xml.soap.MessageFactory> {

    @Override
    public Class<javax.xml.soap.MessageFactory> createNewSUT() {
        return javax.xml.soap.MessageFactory.class;
    }

}

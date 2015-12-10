package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AddressingClassTest
implements org.j8unit.repository.javax.xml.ws.soap.AddressingClassTests<javax.xml.ws.soap.Addressing> {

    @Override
    public Class<javax.xml.ws.soap.Addressing> createNewSUT() {
        return javax.xml.ws.soap.Addressing.class;
    }

}

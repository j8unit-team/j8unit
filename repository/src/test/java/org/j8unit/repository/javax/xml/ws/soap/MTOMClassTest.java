package org.j8unit.repository.javax.xml.ws.soap;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MTOMClassTest
implements org.j8unit.repository.javax.xml.ws.soap.MTOMClassTests<javax.xml.ws.soap.MTOM> {

    @Override
    public Class<javax.xml.ws.soap.MTOM> createNewSUT() {
        return javax.xml.ws.soap.MTOM.class;
    }

}

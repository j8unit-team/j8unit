package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLSignContextClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignContextClassTests<javax.xml.crypto.dsig.XMLSignContext> {

    @Override
    public Class<javax.xml.crypto.dsig.XMLSignContext> createNewSUT() {
        return javax.xml.crypto.dsig.XMLSignContext.class;
    }

}

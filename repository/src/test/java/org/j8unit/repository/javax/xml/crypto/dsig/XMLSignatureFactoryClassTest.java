package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLSignatureFactoryClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureFactoryClassTests<javax.xml.crypto.dsig.XMLSignatureFactory> {

    @Override
    public Class<javax.xml.crypto.dsig.XMLSignatureFactory> createNewSUT() {
        return javax.xml.crypto.dsig.XMLSignatureFactory.class;
    }

}

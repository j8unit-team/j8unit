package org.j8unit.repository.javax.xml.crypto;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLCryptoContextClassTest
implements org.j8unit.repository.javax.xml.crypto.XMLCryptoContextClassTests<javax.xml.crypto.XMLCryptoContext> {

    @Override
    public Class<javax.xml.crypto.XMLCryptoContext> createNewSUT() {
        return javax.xml.crypto.XMLCryptoContext.class;
    }

}

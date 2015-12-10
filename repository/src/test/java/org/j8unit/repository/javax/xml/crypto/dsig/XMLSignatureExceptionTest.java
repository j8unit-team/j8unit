package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLSignatureExceptionTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLSignatureExceptionTests<javax.xml.crypto.dsig.XMLSignatureException> {

    @Override
    public javax.xml.crypto.dsig.XMLSignatureException createNewSUT() {
        return new javax.xml.crypto.dsig.XMLSignatureException();
    }

}

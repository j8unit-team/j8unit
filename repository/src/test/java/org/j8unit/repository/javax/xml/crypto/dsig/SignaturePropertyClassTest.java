package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignaturePropertyClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.SignaturePropertyClassTests<javax.xml.crypto.dsig.SignatureProperty> {

    @Override
    public Class<javax.xml.crypto.dsig.SignatureProperty> createNewSUT() {
        return javax.xml.crypto.dsig.SignatureProperty.class;
    }

}

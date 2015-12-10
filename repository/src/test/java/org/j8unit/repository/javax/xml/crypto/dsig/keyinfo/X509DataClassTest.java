package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class X509DataClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.X509DataClassTests<javax.xml.crypto.dsig.keyinfo.X509Data> {

    @Override
    public Class<javax.xml.crypto.dsig.keyinfo.X509Data> createNewSUT() {
        return javax.xml.crypto.dsig.keyinfo.X509Data.class;
    }

}

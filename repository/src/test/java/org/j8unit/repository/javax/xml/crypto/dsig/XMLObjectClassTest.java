package org.j8unit.repository.javax.xml.crypto.dsig;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLObjectClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLObjectClassTests<javax.xml.crypto.dsig.XMLObject> {

    @Override
    public Class<javax.xml.crypto.dsig.XMLObject> createNewSUT() {
        return javax.xml.crypto.dsig.XMLObject.class;
    }

}

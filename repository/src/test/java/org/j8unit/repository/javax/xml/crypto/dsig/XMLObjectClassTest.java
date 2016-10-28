package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLObjectClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.XMLObjectClassTests<XMLObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLObject]

    @Override
    public Class<XMLObject> createNewSUT() {
        return XMLObject.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLObject]

}

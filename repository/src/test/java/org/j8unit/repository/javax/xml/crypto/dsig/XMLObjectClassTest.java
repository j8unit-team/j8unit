package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.XMLObject;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link XMLObject} (by simply reusing the J8Unit
 * test interface {@link XMLObjectClassTests}).
 */

@RunWith(J8Unit4.class)
public class XMLObjectClassTest
implements XMLObjectClassTests<XMLObject> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.XMLObject]

    @Override
    public Class<XMLObject> createNewSUT() {
        return XMLObject.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.XMLObject]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.XMLObject]

}

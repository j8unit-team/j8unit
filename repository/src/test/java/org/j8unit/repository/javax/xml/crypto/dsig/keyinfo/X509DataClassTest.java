package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.X509Data;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link X509Data} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.X509DataClassTests}).
 */
@RunWith(J8Unit4.class)
public class X509DataClassTest
implements X509DataClassTests<X509Data> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509Data]

    @Override
    public Class<X509Data> createNewSUT() {
        return X509Data.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509Data]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.X509Data]

}

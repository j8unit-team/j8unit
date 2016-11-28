package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignedInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SignedInfo} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.SignedInfoClassTests}).
 */
@RunWith(J8Unit4.class)
public class SignedInfoClassTest
implements SignedInfoClassTests<SignedInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.SignedInfo]

    @Override
    public Class<SignedInfo> createNewSUT() {
        return SignedInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.SignedInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.SignedInfo]

}

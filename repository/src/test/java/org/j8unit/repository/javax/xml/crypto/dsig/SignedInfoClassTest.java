package org.j8unit.repository.javax.xml.crypto.dsig;

import javax.xml.crypto.dsig.SignedInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SignedInfoClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.SignedInfoClassTests<SignedInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.SignedInfo]

    @Override
    public Class<SignedInfo> createNewSUT() {
        return SignedInfo.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.SignedInfo]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.SignedInfo]

}

package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyInfoClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyInfoClassTests<KeyInfo> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyInfo]

    @Override
    public Class<KeyInfo> createNewSUT() {
        return KeyInfo.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyInfo]

}

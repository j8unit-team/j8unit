package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.KeyName;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyNameClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyNameClassTests<KeyName> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyName]

    @Override
    public Class<KeyName> createNewSUT() {
        return KeyName.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyName]

}

package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyValueClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyValueClassTests<KeyValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyValue]

    @Override
    public Class<KeyValue> createNewSUT() {
        return KeyValue.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.KeyValue]

}

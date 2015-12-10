package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyValueClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyValueClassTests<javax.xml.crypto.dsig.keyinfo.KeyValue> {

    @Override
    public Class<javax.xml.crypto.dsig.keyinfo.KeyValue> createNewSUT() {
        return javax.xml.crypto.dsig.keyinfo.KeyValue.class;
    }

}

package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyNameClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyNameClassTests<javax.xml.crypto.dsig.keyinfo.KeyName> {

    @Override
    public Class<javax.xml.crypto.dsig.keyinfo.KeyName> createNewSUT() {
        return javax.xml.crypto.dsig.keyinfo.KeyName.class;
    }

}

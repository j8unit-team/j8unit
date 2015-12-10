package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyInfoClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyInfoClassTests<javax.xml.crypto.dsig.keyinfo.KeyInfo> {

    @Override
    public Class<javax.xml.crypto.dsig.keyinfo.KeyInfo> createNewSUT() {
        return javax.xml.crypto.dsig.keyinfo.KeyInfo.class;
    }

}

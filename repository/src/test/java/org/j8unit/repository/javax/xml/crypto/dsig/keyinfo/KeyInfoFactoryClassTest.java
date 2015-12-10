package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KeyInfoFactoryClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.KeyInfoFactoryClassTests<javax.xml.crypto.dsig.keyinfo.KeyInfoFactory> {

    @Override
    public Class<javax.xml.crypto.dsig.keyinfo.KeyInfoFactory> createNewSUT() {
        return javax.xml.crypto.dsig.keyinfo.KeyInfoFactory.class;
    }

}

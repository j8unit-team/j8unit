package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PGPDataClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.PGPDataClassTests<javax.xml.crypto.dsig.keyinfo.PGPData> {

    @Override
    public Class<javax.xml.crypto.dsig.keyinfo.PGPData> createNewSUT() {
        return javax.xml.crypto.dsig.keyinfo.PGPData.class;
    }

}

package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.PGPData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PGPDataClassTest
implements org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.PGPDataClassTests<PGPData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.PGPData]

    @Override
    public Class<PGPData> createNewSUT() {
        return PGPData.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.PGPData]

}

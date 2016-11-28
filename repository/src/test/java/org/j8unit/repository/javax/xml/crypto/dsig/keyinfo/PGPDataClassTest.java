package org.j8unit.repository.javax.xml.crypto.dsig.keyinfo;

import javax.xml.crypto.dsig.keyinfo.PGPData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PGPData} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.crypto.dsig.keyinfo.PGPDataClassTests}).
 */
@RunWith(J8Unit4.class)
public class PGPDataClassTest
implements PGPDataClassTests<PGPData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.PGPData]

    @Override
    public Class<PGPData> createNewSUT() {
        return PGPData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.PGPData]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.crypto.dsig.keyinfo.PGPData]

}

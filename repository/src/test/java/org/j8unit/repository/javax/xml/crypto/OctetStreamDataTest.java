package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.OctetStreamData;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link OctetStreamData} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.xml.crypto.OctetStreamDataTests}).
 */

@RunWith(J8Unit4.class)
public class OctetStreamDataTest
implements OctetStreamDataTests<OctetStreamData> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.OctetStreamData]

    @Override
    public OctetStreamData createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.xml.crypto.OctetStreamData], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.OctetStreamData]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.OctetStreamData]

}

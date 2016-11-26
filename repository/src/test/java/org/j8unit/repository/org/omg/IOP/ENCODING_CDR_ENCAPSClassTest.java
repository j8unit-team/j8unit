package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.ENCODING_CDR_ENCAPS;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ENCODING_CDR_ENCAPS} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.ENCODING_CDR_ENCAPSClassTests}).
 */
@RunWith(J8Unit4.class)
public class ENCODING_CDR_ENCAPSClassTest
implements ENCODING_CDR_ENCAPSClassTests<ENCODING_CDR_ENCAPS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.ENCODING_CDR_ENCAPS]

    @Override
    public Class<ENCODING_CDR_ENCAPS> createNewSUT() {
        return ENCODING_CDR_ENCAPS.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.ENCODING_CDR_ENCAPS]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.ENCODING_CDR_ENCAPS]

}

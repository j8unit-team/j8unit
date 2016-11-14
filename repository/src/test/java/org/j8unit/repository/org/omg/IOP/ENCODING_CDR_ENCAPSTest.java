package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.ENCODING_CDR_ENCAPS;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ENCODING_CDR_ENCAPS} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.ENCODING_CDR_ENCAPSTests}).
 */

@RunWith(J8Unit4.class)
public class ENCODING_CDR_ENCAPSTest
implements ENCODING_CDR_ENCAPSTests<ENCODING_CDR_ENCAPS> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.ENCODING_CDR_ENCAPS]

    @Override
    public ENCODING_CDR_ENCAPS createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.ENCODING_CDR_ENCAPS], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.ENCODING_CDR_ENCAPS]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.ENCODING_CDR_ENCAPS]

}

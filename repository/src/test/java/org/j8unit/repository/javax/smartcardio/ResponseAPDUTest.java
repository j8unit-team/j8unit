package org.j8unit.repository.javax.smartcardio;

import javax.smartcardio.ResponseAPDU;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ResponseAPDU} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.smartcardio.ResponseAPDUTests}).
 */

@RunWith(J8Unit4.class)
@SuppressWarnings("restriction")
public class ResponseAPDUTest
implements ResponseAPDUTests<ResponseAPDU> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.smartcardio.ResponseAPDU]

    @Override
    public ResponseAPDU createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.smartcardio.ResponseAPDU], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.smartcardio.ResponseAPDU]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.smartcardio.ResponseAPDU]

}

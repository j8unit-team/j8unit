package org.j8unit.repository.org.omg.IOP.CodecPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidTypeForEncodingHelper} (by
 * simply reusing the J8Unit test interface {@link InvalidTypeForEncodingHelperTests}).
 */

@RunWith(J8Unit4.class)
public class InvalidTypeForEncodingHelperTest
implements InvalidTypeForEncodingHelperTests<InvalidTypeForEncodingHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper]

    @Override
    public InvalidTypeForEncodingHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodecPackage.InvalidTypeForEncodingHelper]

}

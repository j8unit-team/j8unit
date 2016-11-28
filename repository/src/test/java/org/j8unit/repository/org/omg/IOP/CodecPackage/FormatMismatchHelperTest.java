package org.j8unit.repository.org.omg.IOP.CodecPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.CodecPackage.FormatMismatchHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link FormatMismatchHelper} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.CodecPackage.FormatMismatchHelperTests}).
 */
@RunWith(J8Unit4.class)
public class FormatMismatchHelperTest
implements FormatMismatchHelperTests<FormatMismatchHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.CodecPackage.FormatMismatchHelper]

    @Override
    public FormatMismatchHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.CodecPackage.FormatMismatchHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.CodecPackage.FormatMismatchHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.CodecPackage.FormatMismatchHelper]

}

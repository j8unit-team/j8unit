package org.j8unit.repository.javax.crypto;

import javax.crypto.Mac;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Mac} (by simply reusing the J8Unit
 * test interface {@link MacTests}).
 */

@RunWith(J8Unit4.class)
public class MacTest
implements MacTests<Mac> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.crypto.Mac]

    @Override
    public Mac createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.crypto.Mac], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.crypto.Mac]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.crypto.Mac]

}

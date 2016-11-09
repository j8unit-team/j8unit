package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_INTERNET_IOP;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TAG_INTERNET_IOP} (by simply reusing
 * the J8Unit test interface {@link TAG_INTERNET_IOPTests}).
 */

@RunWith(J8Unit4.class)
public class TAG_INTERNET_IOPTest
implements TAG_INTERNET_IOPTests<TAG_INTERNET_IOP> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.IOP.TAG_INTERNET_IOP]

    @Override
    public TAG_INTERNET_IOP createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.IOP.TAG_INTERNET_IOP], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.IOP.TAG_INTERNET_IOP]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.IOP.TAG_INTERNET_IOP]

}

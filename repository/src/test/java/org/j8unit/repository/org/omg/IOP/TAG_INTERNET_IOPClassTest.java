package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_INTERNET_IOP;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TAG_INTERNET_IOP} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.IOP.TAG_INTERNET_IOPClassTests}).
 */

@RunWith(J8Unit4.class)
public class TAG_INTERNET_IOPClassTest
implements TAG_INTERNET_IOPClassTests<TAG_INTERNET_IOP> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TAG_INTERNET_IOP]

    @Override
    public Class<TAG_INTERNET_IOP> createNewSUT() {
        return TAG_INTERNET_IOP.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TAG_INTERNET_IOP]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TAG_INTERNET_IOP]

}

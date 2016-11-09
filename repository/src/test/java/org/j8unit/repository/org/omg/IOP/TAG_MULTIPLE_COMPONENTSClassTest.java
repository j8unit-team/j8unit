package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.TAG_MULTIPLE_COMPONENTS;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TAG_MULTIPLE_COMPONENTS} (by simply
 * reusing the J8Unit test interface {@link TAG_MULTIPLE_COMPONENTSClassTests}).
 */

@RunWith(J8Unit4.class)
public class TAG_MULTIPLE_COMPONENTSClassTest
implements TAG_MULTIPLE_COMPONENTSClassTests<TAG_MULTIPLE_COMPONENTS> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.TAG_MULTIPLE_COMPONENTS]

    @Override
    public Class<TAG_MULTIPLE_COMPONENTS> createNewSUT() {
        return TAG_MULTIPLE_COMPONENTS.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.IOP.TAG_MULTIPLE_COMPONENTS]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.TAG_MULTIPLE_COMPONENTS]

}

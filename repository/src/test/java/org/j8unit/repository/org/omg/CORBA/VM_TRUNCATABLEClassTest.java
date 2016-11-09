package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.VM_TRUNCATABLE;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link VM_TRUNCATABLE} (by simply reusing the
 * J8Unit test interface {@link VM_TRUNCATABLEClassTests}).
 */

@RunWith(J8Unit4.class)
public class VM_TRUNCATABLEClassTest
implements VM_TRUNCATABLEClassTests<VM_TRUNCATABLE> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.VM_TRUNCATABLE]

    @Override
    public Class<VM_TRUNCATABLE> createNewSUT() {
        return VM_TRUNCATABLE.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.VM_TRUNCATABLE]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.VM_TRUNCATABLE]

}

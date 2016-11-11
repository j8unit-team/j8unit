package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DomainManager;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DomainManager} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.DomainManagerClassTests}).
 */

@RunWith(J8Unit4.class)
public class DomainManagerClassTest
implements DomainManagerClassTests<DomainManager> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DomainManager]

    @Override
    public Class<DomainManager> createNewSUT() {
        return DomainManager.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DomainManager]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DomainManager]

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DomainManagerOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DomainManagerOperations} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.CORBA.DomainManagerOperationsClassTests}).
 */
@RunWith(J8Unit4.class)
public class DomainManagerOperationsClassTest
implements DomainManagerOperationsClassTests<DomainManagerOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DomainManagerOperations]

    @Override
    public Class<DomainManagerOperations> createNewSUT() {
        return DomainManagerOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DomainManagerOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DomainManagerOperations]

}

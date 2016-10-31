package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.CORBA.DomainManagerOperations;

@RunWith(J8Unit4.class)
public class DomainManagerOperationsClassTest
implements org.j8unit.repository.org.omg.CORBA.DomainManagerOperationsClassTests<DomainManagerOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.CORBA.DomainManagerOperations]

    @Override
    public Class<DomainManagerOperations> createNewSUT() {
        return DomainManagerOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.CORBA.DomainManagerOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.CORBA.DomainManagerOperations]

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DomainManagerClassTest
implements org.j8unit.repository.org.omg.CORBA.DomainManagerClassTests<org.omg.CORBA.DomainManager> {

    @Override
    public Class<org.omg.CORBA.DomainManager> createNewSUT() {
        return org.omg.CORBA.DomainManager.class;
    }

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RepositoryIdHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.RepositoryIdHelperClassTests<org.omg.CORBA.RepositoryIdHelper> {

    @Override
    public Class<org.omg.CORBA.RepositoryIdHelper> createNewSUT() {
        return org.omg.CORBA.RepositoryIdHelper.class;
    }

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IdentifierHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.IdentifierHelperClassTests<org.omg.CORBA.IdentifierHelper> {

    @Override
    public Class<org.omg.CORBA.IdentifierHelper> createNewSUT() {
        return org.omg.CORBA.IdentifierHelper.class;
    }

}

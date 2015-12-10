package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StructMemberHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.StructMemberHelperClassTests<org.omg.CORBA.StructMemberHelper> {

    @Override
    public Class<org.omg.CORBA.StructMemberHelper> createNewSUT() {
        return org.omg.CORBA.StructMemberHelper.class;
    }

}

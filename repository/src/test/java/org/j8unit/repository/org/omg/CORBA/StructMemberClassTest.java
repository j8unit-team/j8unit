package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StructMemberClassTest
implements org.j8unit.repository.org.omg.CORBA.StructMemberClassTests<org.omg.CORBA.StructMember> {

    @Override
    public Class<org.omg.CORBA.StructMember> createNewSUT() {
        return org.omg.CORBA.StructMember.class;
    }

}

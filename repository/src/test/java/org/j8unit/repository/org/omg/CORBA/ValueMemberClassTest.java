package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueMemberClassTest
implements org.j8unit.repository.org.omg.CORBA.ValueMemberClassTests<org.omg.CORBA.ValueMember> {

    @Override
    public Class<org.omg.CORBA.ValueMember> createNewSUT() {
        return org.omg.CORBA.ValueMember.class;
    }

}

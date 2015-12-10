package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueMemberTest
implements org.j8unit.repository.org.omg.CORBA.ValueMemberTests<org.omg.CORBA.ValueMember> {

    @Override
    public org.omg.CORBA.ValueMember createNewSUT() {
        return new org.omg.CORBA.ValueMember();
    }

}

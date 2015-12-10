package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnionMemberTest
implements org.j8unit.repository.org.omg.CORBA.UnionMemberTests<org.omg.CORBA.UnionMember> {

    @Override
    public org.omg.CORBA.UnionMember createNewSUT() {
        return new org.omg.CORBA.UnionMember();
    }

}

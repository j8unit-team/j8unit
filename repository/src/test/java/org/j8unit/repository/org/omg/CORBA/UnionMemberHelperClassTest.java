package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class UnionMemberHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.UnionMemberHelperClassTests<org.omg.CORBA.UnionMemberHelper> {

    @Override
    public Class<org.omg.CORBA.UnionMemberHelper> createNewSUT() {
        return org.omg.CORBA.UnionMemberHelper.class;
    }

}

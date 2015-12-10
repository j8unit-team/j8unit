package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringValueHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.StringValueHelperClassTests<org.omg.CORBA.StringValueHelper> {

    @Override
    public Class<org.omg.CORBA.StringValueHelper> createNewSUT() {
        return org.omg.CORBA.StringValueHelper.class;
    }

}

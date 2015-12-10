package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StringValueHelperTest
implements org.j8unit.repository.org.omg.CORBA.StringValueHelperTests<org.omg.CORBA.StringValueHelper> {

    @Override
    public org.omg.CORBA.StringValueHelper createNewSUT() {
        return new org.omg.CORBA.StringValueHelper();
    }

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WStringValueHelperTest
implements org.j8unit.repository.org.omg.CORBA.WStringValueHelperTests<org.omg.CORBA.WStringValueHelper> {

    @Override
    public org.omg.CORBA.WStringValueHelper createNewSUT() {
        return new org.omg.CORBA.WStringValueHelper();
    }

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class WStringValueHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.WStringValueHelperClassTests<org.omg.CORBA.WStringValueHelper> {

    @Override
    public Class<org.omg.CORBA.WStringValueHelper> createNewSUT() {
        return org.omg.CORBA.WStringValueHelper.class;
    }

}

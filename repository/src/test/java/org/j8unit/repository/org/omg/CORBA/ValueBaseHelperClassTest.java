package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ValueBaseHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ValueBaseHelperClassTests<org.omg.CORBA.ValueBaseHelper> {

    @Override
    public Class<org.omg.CORBA.ValueBaseHelper> createNewSUT() {
        return org.omg.CORBA.ValueBaseHelper.class;
    }

}

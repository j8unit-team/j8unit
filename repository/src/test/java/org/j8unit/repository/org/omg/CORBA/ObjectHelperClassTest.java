package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ObjectHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.ObjectHelperClassTests<org.omg.CORBA.ObjectHelper> {

    @Override
    public Class<org.omg.CORBA.ObjectHelper> createNewSUT() {
        return org.omg.CORBA.ObjectHelper.class;
    }

}

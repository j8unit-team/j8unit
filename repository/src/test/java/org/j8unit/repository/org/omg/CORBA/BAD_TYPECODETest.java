package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_TYPECODETest
implements org.j8unit.repository.org.omg.CORBA.BAD_TYPECODETests<org.omg.CORBA.BAD_TYPECODE> {

    @Override
    public org.omg.CORBA.BAD_TYPECODE createNewSUT() {
        return new org.omg.CORBA.BAD_TYPECODE();
    }

}

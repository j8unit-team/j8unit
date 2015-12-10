package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IMP_LIMITTest
implements org.j8unit.repository.org.omg.CORBA.IMP_LIMITTests<org.omg.CORBA.IMP_LIMIT> {

    @Override
    public org.omg.CORBA.IMP_LIMIT createNewSUT() {
        return new org.omg.CORBA.IMP_LIMIT();
    }

}

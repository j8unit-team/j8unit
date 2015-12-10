package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IMP_LIMITClassTest
implements org.j8unit.repository.org.omg.CORBA.IMP_LIMITClassTests<org.omg.CORBA.IMP_LIMIT> {

    @Override
    public Class<org.omg.CORBA.IMP_LIMIT> createNewSUT() {
        return org.omg.CORBA.IMP_LIMIT.class;
    }

}

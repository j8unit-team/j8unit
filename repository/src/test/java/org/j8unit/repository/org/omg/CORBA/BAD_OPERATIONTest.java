package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_OPERATIONTest
implements org.j8unit.repository.org.omg.CORBA.BAD_OPERATIONTests<org.omg.CORBA.BAD_OPERATION> {

    @Override
    public org.omg.CORBA.BAD_OPERATION createNewSUT() {
        return new org.omg.CORBA.BAD_OPERATION();
    }

}

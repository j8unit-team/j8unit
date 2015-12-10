package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_OPERATIONClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_OPERATIONClassTests<org.omg.CORBA.BAD_OPERATION> {

    @Override
    public Class<org.omg.CORBA.BAD_OPERATION> createNewSUT() {
        return org.omg.CORBA.BAD_OPERATION.class;
    }

}

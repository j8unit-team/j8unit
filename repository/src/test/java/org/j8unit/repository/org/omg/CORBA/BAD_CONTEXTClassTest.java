package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_CONTEXTClassTest
implements org.j8unit.repository.org.omg.CORBA.BAD_CONTEXTClassTests<org.omg.CORBA.BAD_CONTEXT> {

    @Override
    public Class<org.omg.CORBA.BAD_CONTEXT> createNewSUT() {
        return org.omg.CORBA.BAD_CONTEXT.class;
    }

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BAD_CONTEXTTest
implements org.j8unit.repository.org.omg.CORBA.BAD_CONTEXTTests<org.omg.CORBA.BAD_CONTEXT> {

    @Override
    public org.omg.CORBA.BAD_CONTEXT createNewSUT() {
        return new org.omg.CORBA.BAD_CONTEXT();
    }

}

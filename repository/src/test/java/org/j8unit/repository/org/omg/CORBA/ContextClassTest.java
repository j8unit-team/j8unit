package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContextClassTest
implements org.j8unit.repository.org.omg.CORBA.ContextClassTests<org.omg.CORBA.Context> {

    @Override
    public Class<org.omg.CORBA.Context> createNewSUT() {
        return org.omg.CORBA.Context.class;
    }

}

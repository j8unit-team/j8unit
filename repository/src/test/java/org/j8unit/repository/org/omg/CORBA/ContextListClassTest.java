package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ContextListClassTest
implements org.j8unit.repository.org.omg.CORBA.ContextListClassTests<org.omg.CORBA.ContextList> {

    @Override
    public Class<org.omg.CORBA.ContextList> createNewSUT() {
        return org.omg.CORBA.ContextList.class;
    }

}

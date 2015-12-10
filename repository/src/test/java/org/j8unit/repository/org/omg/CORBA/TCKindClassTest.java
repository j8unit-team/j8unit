package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TCKindClassTest
implements org.j8unit.repository.org.omg.CORBA.TCKindClassTests<org.omg.CORBA.TCKind> {

    @Override
    public Class<org.omg.CORBA.TCKind> createNewSUT() {
        return org.omg.CORBA.TCKind.class;
    }

}

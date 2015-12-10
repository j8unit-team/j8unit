package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class IDLTypeHelperClassTest
implements org.j8unit.repository.org.omg.CORBA.IDLTypeHelperClassTests<org.omg.CORBA.IDLTypeHelper> {

    @Override
    public Class<org.omg.CORBA.IDLTypeHelper> createNewSUT() {
        return org.omg.CORBA.IDLTypeHelper.class;
    }

}

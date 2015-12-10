package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynUnionClassTest
implements org.j8unit.repository.org.omg.CORBA.DynUnionClassTests<org.omg.CORBA.DynUnion> {

    @Override
    public Class<org.omg.CORBA.DynUnion> createNewSUT() {
        return org.omg.CORBA.DynUnion.class;
    }

}

package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeCodeHolderClassTest
implements org.j8unit.repository.org.omg.CORBA.TypeCodeHolderClassTests<org.omg.CORBA.TypeCodeHolder> {

    @Override
    public Class<org.omg.CORBA.TypeCodeHolder> createNewSUT() {
        return org.omg.CORBA.TypeCodeHolder.class;
    }

}

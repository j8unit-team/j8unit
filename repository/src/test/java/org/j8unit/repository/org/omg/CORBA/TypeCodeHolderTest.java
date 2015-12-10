package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeCodeHolderTest
implements org.j8unit.repository.org.omg.CORBA.TypeCodeHolderTests<org.omg.CORBA.TypeCodeHolder> {

    @Override
    public org.omg.CORBA.TypeCodeHolder createNewSUT() {
        return new org.omg.CORBA.TypeCodeHolder();
    }

}

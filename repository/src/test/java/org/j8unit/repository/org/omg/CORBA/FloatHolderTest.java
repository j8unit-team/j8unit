package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FloatHolderTest
implements org.j8unit.repository.org.omg.CORBA.FloatHolderTests<org.omg.CORBA.FloatHolder> {

    @Override
    public org.omg.CORBA.FloatHolder createNewSUT() {
        return new org.omg.CORBA.FloatHolder();
    }

}

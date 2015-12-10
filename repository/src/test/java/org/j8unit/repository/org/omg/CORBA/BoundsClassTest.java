package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoundsClassTest
implements org.j8unit.repository.org.omg.CORBA.BoundsClassTests<org.omg.CORBA.Bounds> {

    @Override
    public Class<org.omg.CORBA.Bounds> createNewSUT() {
        return org.omg.CORBA.Bounds.class;
    }

}

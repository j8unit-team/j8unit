package org.j8unit.repository.org.omg.CORBA;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoundsTest
implements org.j8unit.repository.org.omg.CORBA.BoundsTests<org.omg.CORBA.Bounds> {

    @Override
    public org.omg.CORBA.Bounds createNewSUT() {
        return new org.omg.CORBA.Bounds();
    }

}

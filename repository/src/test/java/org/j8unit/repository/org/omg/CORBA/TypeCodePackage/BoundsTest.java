package org.j8unit.repository.org.omg.CORBA.TypeCodePackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoundsTest
implements org.j8unit.repository.org.omg.CORBA.TypeCodePackage.BoundsTests<org.omg.CORBA.TypeCodePackage.Bounds> {

    @Override
    public org.omg.CORBA.TypeCodePackage.Bounds createNewSUT() {
        return new org.omg.CORBA.TypeCodePackage.Bounds();
    }

}

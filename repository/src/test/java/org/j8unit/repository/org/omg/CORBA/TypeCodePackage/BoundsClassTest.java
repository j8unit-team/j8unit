package org.j8unit.repository.org.omg.CORBA.TypeCodePackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class BoundsClassTest
implements org.j8unit.repository.org.omg.CORBA.TypeCodePackage.BoundsClassTests<org.omg.CORBA.TypeCodePackage.Bounds> {

    @Override
    public Class<org.omg.CORBA.TypeCodePackage.Bounds> createNewSUT() {
        return org.omg.CORBA.TypeCodePackage.Bounds.class;
    }

}

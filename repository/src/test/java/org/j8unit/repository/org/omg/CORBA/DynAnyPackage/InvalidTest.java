package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidTests<org.omg.CORBA.DynAnyPackage.Invalid> {

    @Override
    public org.omg.CORBA.DynAnyPackage.Invalid createNewSUT() {
        return new org.omg.CORBA.DynAnyPackage.Invalid();
    }

}

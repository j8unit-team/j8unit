package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidClassTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.InvalidClassTests<org.omg.CORBA.DynAnyPackage.Invalid> {

    @Override
    public Class<org.omg.CORBA.DynAnyPackage.Invalid> createNewSUT() {
        return org.omg.CORBA.DynAnyPackage.Invalid.class;
    }

}

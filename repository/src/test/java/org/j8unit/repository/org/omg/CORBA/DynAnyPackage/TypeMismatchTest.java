package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMismatchTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.TypeMismatchTests<org.omg.CORBA.DynAnyPackage.TypeMismatch> {

    @Override
    public org.omg.CORBA.DynAnyPackage.TypeMismatch createNewSUT() {
        return new org.omg.CORBA.DynAnyPackage.TypeMismatch();
    }

}

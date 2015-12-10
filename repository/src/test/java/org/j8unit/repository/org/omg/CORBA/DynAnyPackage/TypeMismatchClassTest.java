package org.j8unit.repository.org.omg.CORBA.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMismatchClassTest
implements org.j8unit.repository.org.omg.CORBA.DynAnyPackage.TypeMismatchClassTests<org.omg.CORBA.DynAnyPackage.TypeMismatch> {

    @Override
    public Class<org.omg.CORBA.DynAnyPackage.TypeMismatch> createNewSUT() {
        return org.omg.CORBA.DynAnyPackage.TypeMismatch.class;
    }

}

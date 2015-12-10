package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMismatchClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchClassTests<org.omg.DynamicAny.DynAnyPackage.TypeMismatch> {

    @Override
    public Class<org.omg.DynamicAny.DynAnyPackage.TypeMismatch> createNewSUT() {
        return org.omg.DynamicAny.DynAnyPackage.TypeMismatch.class;
    }

}

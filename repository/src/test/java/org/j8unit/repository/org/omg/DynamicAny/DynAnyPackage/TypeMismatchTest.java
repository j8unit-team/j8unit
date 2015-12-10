package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMismatchTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchTests<org.omg.DynamicAny.DynAnyPackage.TypeMismatch> {

    @Override
    public org.omg.DynamicAny.DynAnyPackage.TypeMismatch createNewSUT() {
        return new org.omg.DynamicAny.DynAnyPackage.TypeMismatch();
    }

}

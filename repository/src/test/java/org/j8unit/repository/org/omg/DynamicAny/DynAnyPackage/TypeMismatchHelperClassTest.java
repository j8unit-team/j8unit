package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMismatchHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelperClassTests<org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper> createNewSUT() {
        return org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper.class;
    }

}

package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidValueClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.InvalidValueClassTests<org.omg.DynamicAny.DynAnyPackage.InvalidValue> {

    @Override
    public Class<org.omg.DynamicAny.DynAnyPackage.InvalidValue> createNewSUT() {
        return org.omg.DynamicAny.DynAnyPackage.InvalidValue.class;
    }

}

package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InvalidValueTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.InvalidValueTests<org.omg.DynamicAny.DynAnyPackage.InvalidValue> {

    @Override
    public org.omg.DynamicAny.DynAnyPackage.InvalidValue createNewSUT() {
        return new org.omg.DynamicAny.DynAnyPackage.InvalidValue();
    }

}

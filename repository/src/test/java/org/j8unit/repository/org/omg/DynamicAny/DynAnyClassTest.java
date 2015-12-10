package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynAnyClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyClassTests<org.omg.DynamicAny.DynAny> {

    @Override
    public Class<org.omg.DynamicAny.DynAny> createNewSUT() {
        return org.omg.DynamicAny.DynAny.class;
    }

}

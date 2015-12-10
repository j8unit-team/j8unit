package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynValueClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueClassTests<org.omg.DynamicAny.DynValue> {

    @Override
    public Class<org.omg.DynamicAny.DynValue> createNewSUT() {
        return org.omg.DynamicAny.DynValue.class;
    }

}

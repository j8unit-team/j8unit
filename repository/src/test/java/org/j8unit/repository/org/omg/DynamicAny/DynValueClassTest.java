package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynValue;

@RunWith(J8Unit4.class)
public class DynValueClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueClassTests<DynValue> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynValue]

    @Override
    public Class<DynValue> createNewSUT() {
        return DynValue.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynValue]

}

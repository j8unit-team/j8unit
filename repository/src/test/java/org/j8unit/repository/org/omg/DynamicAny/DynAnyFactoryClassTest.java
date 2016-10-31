package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyFactory;

@RunWith(J8Unit4.class)
public class DynAnyFactoryClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryClassTests<DynAnyFactory> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynAnyFactory]

    @Override
    public Class<DynAnyFactory> createNewSUT() {
        return DynAnyFactory.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynAnyFactory]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynAnyFactory]

}

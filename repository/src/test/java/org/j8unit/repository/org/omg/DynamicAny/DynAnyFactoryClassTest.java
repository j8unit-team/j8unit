package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynAnyFactoryClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryClassTests<org.omg.DynamicAny.DynAnyFactory> {

    @Override
    public Class<org.omg.DynamicAny.DynAnyFactory> createNewSUT() {
        return org.omg.DynamicAny.DynAnyFactory.class;
    }

}

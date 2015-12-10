package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynAnyFactoryHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryHelperClassTests<org.omg.DynamicAny.DynAnyFactoryHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynAnyFactoryHelper> createNewSUT() {
        return org.omg.DynamicAny.DynAnyFactoryHelper.class;
    }

}

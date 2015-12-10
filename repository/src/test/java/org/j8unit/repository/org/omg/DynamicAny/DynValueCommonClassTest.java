package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynValueCommonClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueCommonClassTests<org.omg.DynamicAny.DynValueCommon> {

    @Override
    public Class<org.omg.DynamicAny.DynValueCommon> createNewSUT() {
        return org.omg.DynamicAny.DynValueCommon.class;
    }

}

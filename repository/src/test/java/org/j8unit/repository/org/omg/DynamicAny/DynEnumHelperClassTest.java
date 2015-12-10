package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynEnumHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynEnumHelperClassTests<org.omg.DynamicAny.DynEnumHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynEnumHelper> createNewSUT() {
        return org.omg.DynamicAny.DynEnumHelper.class;
    }

}

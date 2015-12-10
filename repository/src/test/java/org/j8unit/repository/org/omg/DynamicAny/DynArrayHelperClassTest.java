package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynArrayHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynArrayHelperClassTests<org.omg.DynamicAny.DynArrayHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynArrayHelper> createNewSUT() {
        return org.omg.DynamicAny.DynArrayHelper.class;
    }

}

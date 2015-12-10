package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynStructHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynStructHelperClassTests<org.omg.DynamicAny.DynStructHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynStructHelper> createNewSUT() {
        return org.omg.DynamicAny.DynStructHelper.class;
    }

}

package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynValueHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueHelperClassTests<org.omg.DynamicAny.DynValueHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynValueHelper> createNewSUT() {
        return org.omg.DynamicAny.DynValueHelper.class;
    }

}

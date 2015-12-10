package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynUnionHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynUnionHelperClassTests<org.omg.DynamicAny.DynUnionHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynUnionHelper> createNewSUT() {
        return org.omg.DynamicAny.DynUnionHelper.class;
    }

}

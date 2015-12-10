package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynAnyHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyHelperClassTests<org.omg.DynamicAny.DynAnyHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynAnyHelper> createNewSUT() {
        return org.omg.DynamicAny.DynAnyHelper.class;
    }

}

package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynFixedHelperClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynFixedHelperClassTests<org.omg.DynamicAny.DynFixedHelper> {

    @Override
    public Class<org.omg.DynamicAny.DynFixedHelper> createNewSUT() {
        return org.omg.DynamicAny.DynFixedHelper.class;
    }

}

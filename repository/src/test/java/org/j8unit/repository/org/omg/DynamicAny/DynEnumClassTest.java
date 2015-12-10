package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynEnumClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynEnumClassTests<org.omg.DynamicAny.DynEnum> {

    @Override
    public Class<org.omg.DynamicAny.DynEnum> createNewSUT() {
        return org.omg.DynamicAny.DynEnum.class;
    }

}

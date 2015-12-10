package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynArrayClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynArrayClassTests<org.omg.DynamicAny.DynArray> {

    @Override
    public Class<org.omg.DynamicAny.DynArray> createNewSUT() {
        return org.omg.DynamicAny.DynArray.class;
    }

}

package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynUnionClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynUnionClassTests<org.omg.DynamicAny.DynUnion> {

    @Override
    public Class<org.omg.DynamicAny.DynUnion> createNewSUT() {
        return org.omg.DynamicAny.DynUnion.class;
    }

}

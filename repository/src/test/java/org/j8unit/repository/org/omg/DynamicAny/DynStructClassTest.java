package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynStructClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynStructClassTests<org.omg.DynamicAny.DynStruct> {

    @Override
    public Class<org.omg.DynamicAny.DynStruct> createNewSUT() {
        return org.omg.DynamicAny.DynStruct.class;
    }

}

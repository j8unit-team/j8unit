package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynFixedClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynFixedClassTests<org.omg.DynamicAny.DynFixed> {

    @Override
    public Class<org.omg.DynamicAny.DynFixed> createNewSUT() {
        return org.omg.DynamicAny.DynFixed.class;
    }

}

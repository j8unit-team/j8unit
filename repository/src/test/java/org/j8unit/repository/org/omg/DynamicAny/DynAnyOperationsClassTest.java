package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynAnyOperationsClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynAnyOperationsClassTests<org.omg.DynamicAny.DynAnyOperations> {

    @Override
    public Class<org.omg.DynamicAny.DynAnyOperations> createNewSUT() {
        return org.omg.DynamicAny.DynAnyOperations.class;
    }

}

package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynArrayOperationsClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynArrayOperationsClassTests<org.omg.DynamicAny.DynArrayOperations> {

    @Override
    public Class<org.omg.DynamicAny.DynArrayOperations> createNewSUT() {
        return org.omg.DynamicAny.DynArrayOperations.class;
    }

}

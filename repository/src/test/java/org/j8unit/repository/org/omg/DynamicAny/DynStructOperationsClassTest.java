package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynStructOperationsClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynStructOperationsClassTests<org.omg.DynamicAny.DynStructOperations> {

    @Override
    public Class<org.omg.DynamicAny.DynStructOperations> createNewSUT() {
        return org.omg.DynamicAny.DynStructOperations.class;
    }

}

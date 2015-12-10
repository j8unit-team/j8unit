package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DynValueOperationsClassTest
implements org.j8unit.repository.org.omg.DynamicAny.DynValueOperationsClassTests<org.omg.DynamicAny.DynValueOperations> {

    @Override
    public Class<org.omg.DynamicAny.DynValueOperations> createNewSUT() {
        return org.omg.DynamicAny.DynValueOperations.class;
    }

}

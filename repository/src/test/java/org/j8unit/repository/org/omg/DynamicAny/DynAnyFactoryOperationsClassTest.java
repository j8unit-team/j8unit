package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyFactoryOperations;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DynAnyFactoryOperations} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryOperationsClassTests}).
 */

@RunWith(J8Unit4.class)
public class DynAnyFactoryOperationsClassTest
implements DynAnyFactoryOperationsClassTests<DynAnyFactoryOperations> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.DynamicAny.DynAnyFactoryOperations]

    @Override
    public Class<DynAnyFactoryOperations> createNewSUT() {
        return DynAnyFactoryOperations.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.omg.DynamicAny.DynAnyFactoryOperations]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.DynamicAny.DynAnyFactoryOperations]

}

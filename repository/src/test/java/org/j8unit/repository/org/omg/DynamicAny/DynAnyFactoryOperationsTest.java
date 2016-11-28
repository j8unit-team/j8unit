package org.j8unit.repository.org.omg.DynamicAny;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyFactoryOperations;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DynAnyFactoryOperations} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyFactoryOperationsTests}).
 */
@RunWith(J8Unit4.class)
public class DynAnyFactoryOperationsTest
implements DynAnyFactoryOperationsTests<DynAnyFactoryOperations> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynAnyFactoryOperations]

    @Override
    public DynAnyFactoryOperations createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.DynAnyFactoryOperations], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynAnyFactoryOperations]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynAnyFactoryOperations]

}

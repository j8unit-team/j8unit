package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link InvalidValueHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.InvalidValueHelperTests}).
 */
@RunWith(J8Unit4.class)
public class InvalidValueHelperTest
implements InvalidValueHelperTests<InvalidValueHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper]

    @Override
    public InvalidValueHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.InvalidValueHelper]

}

package org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TypeMismatchHelper} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelperTests}).
 */
@RunWith(J8Unit4.class)
public class TypeMismatchHelperTest
implements TypeMismatchHelperTests<TypeMismatchHelper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper]

    @Override
    public TypeMismatchHelper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[org.omg.DynamicAny.DynAnyPackage.TypeMismatchHelper]

}

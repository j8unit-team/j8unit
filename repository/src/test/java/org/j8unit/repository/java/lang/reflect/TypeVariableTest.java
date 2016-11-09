package org.j8unit.repository.java.lang.reflect;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.TypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link TypeVariable} (by simply reusing the
 * J8Unit test interface {@link TypeVariableTests}).
 */

@RunWith(J8Unit4.class)
public class TypeVariableTest<D extends GenericDeclaration>
implements TypeVariableTests<TypeVariable<D>, D> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.reflect.TypeVariable]

    @Override
    public TypeVariable<D> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.lang.reflect.TypeVariable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.reflect.TypeVariable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.reflect.TypeVariable]

}

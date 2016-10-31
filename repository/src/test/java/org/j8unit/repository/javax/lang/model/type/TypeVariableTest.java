package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.TypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeVariableTest
implements org.j8unit.repository.javax.lang.model.type.TypeVariableTests<TypeVariable> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.type.TypeVariable]

    @Override
    public TypeVariable createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.type.TypeVariable], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.type.TypeVariable]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.type.TypeVariable]

}

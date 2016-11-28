package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.TypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeVariable} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.TypeVariableClassTests}).
 */
@RunWith(J8Unit4.class)
public class TypeVariableClassTest
implements TypeVariableClassTests<TypeVariable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.TypeVariable]

    @Override
    public Class<TypeVariable> createNewSUT() {
        return TypeVariable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.TypeVariable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.TypeVariable]

}

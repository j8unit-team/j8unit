package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.TypeVariable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeVariableClassTest
implements org.j8unit.repository.javax.lang.model.type.TypeVariableClassTests<TypeVariable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.TypeVariable]

    @Override
    public Class<TypeVariable> createNewSUT() {
        return TypeVariable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.TypeVariable]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.TypeVariable]

}

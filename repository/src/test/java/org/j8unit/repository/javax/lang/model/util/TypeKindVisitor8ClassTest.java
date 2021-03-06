package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.TypeKindVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeKindVisitor8} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.TypeKindVisitor8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class TypeKindVisitor8ClassTest
implements TypeKindVisitor8ClassTests<TypeKindVisitor8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.TypeKindVisitor8]

    @Override
    public Class<TypeKindVisitor8> createNewSUT() {
        return TypeKindVisitor8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.TypeKindVisitor8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.TypeKindVisitor8]

}

package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.TypeVisitor;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link TypeVisitor} (by simply reusing the
 * J8Unit test interface {@link TypeVisitorClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class TypeVisitorClassTest
implements TypeVisitorClassTests<TypeVisitor> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.TypeVisitor]

    @Override
    public Class<TypeVisitor> createNewSUT() {
        return TypeVisitor.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.TypeVisitor]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.TypeVisitor]

}

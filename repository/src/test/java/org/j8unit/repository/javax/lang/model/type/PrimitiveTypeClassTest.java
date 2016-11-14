package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.PrimitiveType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link PrimitiveType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.PrimitiveTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class PrimitiveTypeClassTest
implements PrimitiveTypeClassTests<PrimitiveType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.PrimitiveType]

    @Override
    public Class<PrimitiveType> createNewSUT() {
        return PrimitiveType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.PrimitiveType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.PrimitiveType]

}

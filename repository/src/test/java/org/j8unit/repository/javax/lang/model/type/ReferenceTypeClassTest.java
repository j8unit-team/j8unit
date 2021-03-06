package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.ReferenceType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ReferenceType} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.type.ReferenceTypeClassTests}).
 */
@RunWith(J8Unit4.class)
public class ReferenceTypeClassTest
implements ReferenceTypeClassTests<ReferenceType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.ReferenceType]

    @Override
    public Class<ReferenceType> createNewSUT() {
        return ReferenceType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.ReferenceType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.ReferenceType]

}

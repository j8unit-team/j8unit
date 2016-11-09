package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.IntersectionType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link IntersectionType} (by simply reusing the
 * J8Unit test interface {@link IntersectionTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class IntersectionTypeClassTest
implements IntersectionTypeClassTests<IntersectionType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.IntersectionType]

    @Override
    public Class<IntersectionType> createNewSUT() {
        return IntersectionType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.IntersectionType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.IntersectionType]

}

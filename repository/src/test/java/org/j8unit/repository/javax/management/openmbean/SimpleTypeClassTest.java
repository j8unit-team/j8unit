package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.SimpleType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleType} (by simply reusing the J8Unit
 * test interface {@link SimpleTypeClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleTypeClassTest
implements SimpleTypeClassTests<SimpleType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.SimpleType]

    @Override
    public Class<SimpleType> createNewSUT() {
        return SimpleType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.SimpleType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.SimpleType]

}

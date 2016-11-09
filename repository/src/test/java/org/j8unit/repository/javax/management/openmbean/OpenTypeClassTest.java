package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.OpenType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link OpenType} (by simply reusing the J8Unit
 * test interface {@link OpenTypeClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class OpenTypeClassTest
implements OpenTypeClassTests<OpenType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.OpenType]

    @Override
    public Class<OpenType> createNewSUT() {
        return OpenType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.OpenType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.OpenType]

}

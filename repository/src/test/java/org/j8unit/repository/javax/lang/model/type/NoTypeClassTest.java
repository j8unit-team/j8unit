package org.j8unit.repository.javax.lang.model.type;

import javax.lang.model.type.NoType;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link NoType} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.lang.model.type.NoTypeClassTests}).
 */

@RunWith(J8Unit4.class)
public class NoTypeClassTest
implements NoTypeClassTests<NoType> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.type.NoType]

    @Override
    public Class<NoType> createNewSUT() {
        return NoType.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.type.NoType]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.type.NoType]

}

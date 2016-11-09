package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.Types;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Types} (by simply reusing the J8Unit test
 * interface {@link TypesClassTests}).
 */

@RunWith(J8Unit4.class)
public class TypesClassTest
implements TypesClassTests<Types> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.Types]

    @Override
    public Class<Types> createNewSUT() {
        return Types.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.Types]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.Types]

}

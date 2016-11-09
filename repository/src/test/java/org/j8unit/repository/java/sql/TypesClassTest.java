package org.j8unit.repository.java.sql;

import java.sql.Types;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Types} (by simply reusing the J8Unit test
 * interface {@link TypesClassTests}).
 */

@RunWith(J8Unit4.class)
public class TypesClassTest
implements TypesClassTests<Types> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.sql.Types]

    @Override
    public Class<Types> createNewSUT() {
        return Types.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.sql.Types]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.sql.Types]

}

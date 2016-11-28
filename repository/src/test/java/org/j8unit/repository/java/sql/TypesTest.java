package org.j8unit.repository.java.sql;

import java.sql.Types;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Types} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.sql.TypesTests}).
 */
@RunWith(J8Unit4.class)
public class TypesTest
implements TypesTests<Types> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Types]

    @Override
    public Types createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.sql.Types], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Types]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Types]

}

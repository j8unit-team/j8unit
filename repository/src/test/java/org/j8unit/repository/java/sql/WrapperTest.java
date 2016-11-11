package org.j8unit.repository.java.sql;

import java.sql.Wrapper;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Wrapper} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.sql.WrapperTests}).
 */

@RunWith(J8Unit4.class)
public class WrapperTest
implements WrapperTests<Wrapper> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.sql.Wrapper]

    @Override
    public Wrapper createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.sql.Wrapper], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.sql.Wrapper]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.sql.Wrapper]

}

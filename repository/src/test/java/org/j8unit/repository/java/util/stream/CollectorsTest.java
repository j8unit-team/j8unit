package org.j8unit.repository.java.util.stream;

import java.util.stream.Collectors;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Collectors} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.stream.CollectorsTests}).
 */

@RunWith(J8Unit4.class)
public class CollectorsTest
implements CollectorsTests<Collectors> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.Collectors]

    @Override
    public Collectors createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [java.util.stream.Collectors], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.Collectors]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.Collectors]

}

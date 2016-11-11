package org.j8unit.repository.java.util.stream;

import java.util.stream.BaseStream;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BaseStream} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.java.util.stream.BaseStreamTests}).
 */

@RunWith(J8Unit4.class)
public class BaseStreamTest<T, S extends BaseStream<T, S>>
implements BaseStreamTests<BaseStream<T, S>, T, S> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.stream.BaseStream]

    @Override
    public BaseStream<T, S> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.stream.BaseStream], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.stream.BaseStream]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.stream.BaseStream]

}

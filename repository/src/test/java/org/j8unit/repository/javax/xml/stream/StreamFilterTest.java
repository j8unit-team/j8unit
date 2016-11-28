package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.StreamFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link StreamFilter} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.stream.StreamFilterTests}).
 */
@RunWith(J8Unit4.class)
public class StreamFilterTest
implements StreamFilterTests<StreamFilter> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.stream.StreamFilter]

    @Override
    public StreamFilter createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.stream.StreamFilter], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.stream.StreamFilter]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.stream.StreamFilter]

}

package org.j8unit.repository.javax.xml.stream;

import javax.xml.stream.StreamFilter;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link StreamFilter} (by simply reusing the
 * J8Unit test interface {@link StreamFilterClassTests}).
 */

@RunWith(J8Unit4.class)
public class StreamFilterClassTest
implements StreamFilterClassTests<StreamFilter> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.stream.StreamFilter]

    @Override
    public Class<StreamFilter> createNewSUT() {
        return StreamFilter.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.stream.StreamFilter]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.stream.StreamFilter]

}

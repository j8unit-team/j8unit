package org.j8unit.repository.javax.management.openmbean;

import javax.management.openmbean.CompositeData;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link CompositeData} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.management.openmbean.CompositeDataClassTests}).
 */

@RunWith(J8Unit4.class)
public class CompositeDataClassTest
implements CompositeDataClassTests<CompositeData> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.openmbean.CompositeData]

    @Override
    public Class<CompositeData> createNewSUT() {
        return CompositeData.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.openmbean.CompositeData]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.openmbean.CompositeData]

}

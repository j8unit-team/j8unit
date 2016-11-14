package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.SourceLocator;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SourceLocator} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.xml.transform.SourceLocatorClassTests}).
 */

@RunWith(J8Unit4.class)
public class SourceLocatorClassTest
implements SourceLocatorClassTests<SourceLocator> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.SourceLocator]

    @Override
    public Class<SourceLocator> createNewSUT() {
        return SourceLocator.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.SourceLocator]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.SourceLocator]

}

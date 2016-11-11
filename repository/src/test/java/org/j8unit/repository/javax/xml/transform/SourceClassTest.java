package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Source;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Source} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.SourceClassTests}).
 */

@RunWith(J8Unit4.class)
public class SourceClassTest
implements SourceClassTests<Source> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.xml.transform.Source]

    @Override
    public Class<Source> createNewSUT() {
        return Source.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.xml.transform.Source]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.xml.transform.Source]

}

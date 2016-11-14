package org.j8unit.repository.javax.xml.transform;

import javax.xml.transform.Source;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Source} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.xml.transform.SourceTests}).
 */

@RunWith(J8Unit4.class)
public class SourceTest
implements SourceTests<Source> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.transform.Source]

    @Override
    public Source createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.xml.transform.Source], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.transform.Source]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.transform.Source]

}

package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleExtendedText;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleExtendedText} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleExtendedTextTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleExtendedTextTest
implements AccessibleExtendedTextTests<AccessibleExtendedText> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleExtendedText]

    @Override
    public AccessibleExtendedText createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleExtendedText], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleExtendedText]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleExtendedText]

}

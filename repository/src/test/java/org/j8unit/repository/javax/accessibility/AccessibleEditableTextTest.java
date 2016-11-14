package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleEditableText;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link AccessibleEditableText} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleEditableTextTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleEditableTextTest
implements AccessibleEditableTextTests<AccessibleEditableText> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.accessibility.AccessibleEditableText]

    @Override
    public AccessibleEditableText createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.accessibility.AccessibleEditableText], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.accessibility.AccessibleEditableText]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.accessibility.AccessibleEditableText]

}

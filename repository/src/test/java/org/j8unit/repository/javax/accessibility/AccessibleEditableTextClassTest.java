package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleEditableText;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleEditableText} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.accessibility.AccessibleEditableTextClassTests}).
 */

@RunWith(J8Unit4.class)
public class AccessibleEditableTextClassTest
implements AccessibleEditableTextClassTests<AccessibleEditableText> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleEditableText]

    @Override
    public Class<AccessibleEditableText> createNewSUT() {
        return AccessibleEditableText.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleEditableText]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleEditableText]

}

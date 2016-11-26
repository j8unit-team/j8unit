package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleExtendedText;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleExtendedText} (by simply
 * reusing the J8Unit test interface
 * {@link org.j8unit.repository.javax.accessibility.AccessibleExtendedTextClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleExtendedTextClassTest
implements AccessibleExtendedTextClassTests<AccessibleExtendedText> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleExtendedText]

    @Override
    public Class<AccessibleExtendedText> createNewSUT() {
        return AccessibleExtendedText.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleExtendedText]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleExtendedText]

}

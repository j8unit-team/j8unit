package org.j8unit.repository.javax.accessibility;

import javax.accessibility.AccessibleText;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AccessibleText} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.accessibility.AccessibleTextClassTests}).
 */
@RunWith(J8Unit4.class)
public class AccessibleTextClassTest
implements AccessibleTextClassTests<AccessibleText> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.accessibility.AccessibleText]

    @Override
    public Class<AccessibleText> createNewSUT() {
        return AccessibleText.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.accessibility.AccessibleText]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.accessibility.AccessibleText]

}

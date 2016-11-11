package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.ElementScanner7;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ElementScanner7} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.ElementScanner7ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ElementScanner7ClassTest
implements ElementScanner7ClassTests<ElementScanner7> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.ElementScanner7]

    @Override
    public Class<ElementScanner7> createNewSUT() {
        return ElementScanner7.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.ElementScanner7]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.ElementScanner7]

}

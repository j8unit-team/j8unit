package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.ElementScanner8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ElementScanner8} (by simply reusing the
 * J8Unit test interface {@link ElementScanner8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ElementScanner8ClassTest
implements ElementScanner8ClassTests<ElementScanner8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.ElementScanner8]

    @Override
    public Class<ElementScanner8> createNewSUT() {
        return ElementScanner8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.ElementScanner8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.ElementScanner8]

}

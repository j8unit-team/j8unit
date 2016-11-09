package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.Elements;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Elements} (by simply reusing the J8Unit
 * test interface {@link ElementsClassTests}).
 */

@RunWith(J8Unit4.class)
public class ElementsClassTest
implements ElementsClassTests<Elements> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.Elements]

    @Override
    public Class<Elements> createNewSUT() {
        return Elements.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.Elements]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.Elements]

}

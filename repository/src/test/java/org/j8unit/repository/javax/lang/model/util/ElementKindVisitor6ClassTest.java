package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.ElementKindVisitor6;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ElementKindVisitor6} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.ElementKindVisitor6ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class ElementKindVisitor6ClassTest
implements ElementKindVisitor6ClassTests<ElementKindVisitor6> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.ElementKindVisitor6]

    @Override
    public Class<ElementKindVisitor6> createNewSUT() {
        return ElementKindVisitor6.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.ElementKindVisitor6]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.ElementKindVisitor6]

}

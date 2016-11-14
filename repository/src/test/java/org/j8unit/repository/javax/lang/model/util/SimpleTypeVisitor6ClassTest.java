package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleTypeVisitor6;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleTypeVisitor6} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.SimpleTypeVisitor6ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleTypeVisitor6ClassTest
implements SimpleTypeVisitor6ClassTests<SimpleTypeVisitor6> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor6]

    @Override
    public Class<SimpleTypeVisitor6> createNewSUT() {
        return SimpleTypeVisitor6.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor6]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor6]

}

package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleTypeVisitor7;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleTypeVisitor7} (by simply reusing
 * the J8Unit test interface {@link SimpleTypeVisitor7ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleTypeVisitor7ClassTest
implements SimpleTypeVisitor7ClassTests<SimpleTypeVisitor7> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor7]

    @Override
    public Class<SimpleTypeVisitor7> createNewSUT() {
        return SimpleTypeVisitor7.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor7]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.SimpleTypeVisitor7]

}

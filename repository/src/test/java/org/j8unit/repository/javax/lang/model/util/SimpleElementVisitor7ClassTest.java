package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleElementVisitor7;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleElementVisitor7} (by simply reusing
 * the J8Unit test interface {@link SimpleElementVisitor7ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleElementVisitor7ClassTest
implements SimpleElementVisitor7ClassTests<SimpleElementVisitor7> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.SimpleElementVisitor7]

    @Override
    public Class<SimpleElementVisitor7> createNewSUT() {
        return SimpleElementVisitor7.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.SimpleElementVisitor7]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.SimpleElementVisitor7]

}

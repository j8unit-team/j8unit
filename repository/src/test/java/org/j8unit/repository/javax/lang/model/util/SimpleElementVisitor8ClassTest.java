package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.SimpleElementVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link SimpleElementVisitor8} (by simply reusing
 * the J8Unit test interface {@link SimpleElementVisitor8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class SimpleElementVisitor8ClassTest
implements SimpleElementVisitor8ClassTests<SimpleElementVisitor8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.SimpleElementVisitor8]

    @Override
    public Class<SimpleElementVisitor8> createNewSUT() {
        return SimpleElementVisitor8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.SimpleElementVisitor8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.SimpleElementVisitor8]

}

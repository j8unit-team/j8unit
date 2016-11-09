package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractTypeVisitor8;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractTypeVisitor8} (by simply reusing
 * the J8Unit test interface {@link AbstractTypeVisitor8ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractTypeVisitor8ClassTest
implements AbstractTypeVisitor8ClassTests<AbstractTypeVisitor8> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.AbstractTypeVisitor8]

    @Override
    public Class<AbstractTypeVisitor8> createNewSUT() {
        return AbstractTypeVisitor8.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.AbstractTypeVisitor8]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.AbstractTypeVisitor8]

}

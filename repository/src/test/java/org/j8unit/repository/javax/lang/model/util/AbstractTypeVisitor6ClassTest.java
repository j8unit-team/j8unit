package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractTypeVisitor6;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractTypeVisitor6} (by simply reusing
 * the J8Unit test interface {@link AbstractTypeVisitor6ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractTypeVisitor6ClassTest
implements AbstractTypeVisitor6ClassTests<AbstractTypeVisitor6> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.AbstractTypeVisitor6]

    @Override
    public Class<AbstractTypeVisitor6> createNewSUT() {
        return AbstractTypeVisitor6.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.AbstractTypeVisitor6]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.AbstractTypeVisitor6]

}

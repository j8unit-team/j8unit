package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.AbstractElementVisitor6;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link AbstractElementVisitor6} (by simply
 * reusing the J8Unit test interface {@link AbstractElementVisitor6ClassTests}).
 */
@SuppressWarnings("rawtypes")
@RunWith(J8Unit4.class)
public class AbstractElementVisitor6ClassTest
implements AbstractElementVisitor6ClassTests<AbstractElementVisitor6> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.lang.model.util.AbstractElementVisitor6]

    @Override
    public Class<AbstractElementVisitor6> createNewSUT() {
        return AbstractElementVisitor6.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.lang.model.util.AbstractElementVisitor6]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.lang.model.util.AbstractElementVisitor6]

}

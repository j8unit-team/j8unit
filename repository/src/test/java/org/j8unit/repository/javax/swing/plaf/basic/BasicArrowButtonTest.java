package org.j8unit.repository.javax.swing.plaf.basic;

import javax.swing.plaf.basic.BasicArrowButton;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link BasicArrowButton} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.swing.plaf.basic.BasicArrowButtonTests}).
 */
@RunWith(J8Unit4.class)
public class BasicArrowButtonTest
implements BasicArrowButtonTests<BasicArrowButton> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.basic.BasicArrowButton]

    @Override
    public BasicArrowButton createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.basic.BasicArrowButton], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.basic.BasicArrowButton]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.basic.BasicArrowButton]

}

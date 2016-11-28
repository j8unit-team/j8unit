package org.j8unit.repository.javax.lang.model.util;

import javax.lang.model.util.Elements;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link Elements} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.lang.model.util.ElementsTests}).
 */
@RunWith(J8Unit4.class)
public class ElementsTest
implements ElementsTests<Elements> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.lang.model.util.Elements]

    @Override
    public Elements createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.lang.model.util.Elements], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.lang.model.util.Elements]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.lang.model.util.Elements]

}

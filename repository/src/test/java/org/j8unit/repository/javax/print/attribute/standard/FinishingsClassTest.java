package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Finishings;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Finishings} (by simply reusing the J8Unit
 * test interface {@link FinishingsClassTests}).
 */

@RunWith(J8Unit4.class)
public class FinishingsClassTest
implements FinishingsClassTests<Finishings> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Finishings]

    @Override
    public Class<Finishings> createNewSUT() {
        return Finishings.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Finishings]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Finishings]

}

package org.j8unit.repository.javax.print.attribute.standard;

import javax.print.attribute.standard.Sides;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Sides} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.javax.print.attribute.standard.SidesClassTests}).
 */

@RunWith(J8Unit4.class)
public class SidesClassTest
implements SidesClassTests<Sides> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.print.attribute.standard.Sides]

    @Override
    public Class<Sides> createNewSUT() {
        return Sides.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.print.attribute.standard.Sides]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.print.attribute.standard.Sides]

}

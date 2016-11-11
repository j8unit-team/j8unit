package org.j8unit.repository.java.awt;

import java.awt.Paint;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Paint} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.java.awt.PaintClassTests}).
 */

@RunWith(J8Unit4.class)
public class PaintClassTest
implements PaintClassTests<Paint> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.Paint]

    @Override
    public Class<Paint> createNewSUT() {
        return Paint.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.Paint]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.Paint]

}

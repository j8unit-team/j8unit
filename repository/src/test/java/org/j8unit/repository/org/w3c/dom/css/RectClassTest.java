package org.j8unit.repository.org.w3c.dom.css;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.w3c.dom.css.Rect;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Rect} (by simply reusing the J8Unit test
 * interface {@link org.j8unit.repository.org.w3c.dom.css.RectClassTests}).
 */
@RunWith(J8Unit4.class)
public class RectClassTest
implements RectClassTests<Rect> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.w3c.dom.css.Rect]

    @Override
    public Class<Rect> createNewSUT() {
        return Rect.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[org.w3c.dom.css.Rect]

    // J8UNIT-MARKER-[END]-[CLASS]-[org.w3c.dom.css.Rect]

}

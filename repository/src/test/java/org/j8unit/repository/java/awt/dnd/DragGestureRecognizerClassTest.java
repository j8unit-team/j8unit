package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragGestureRecognizer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link DragGestureRecognizer} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.DragGestureRecognizerClassTests}).
 */
@RunWith(J8Unit4.class)
public class DragGestureRecognizerClassTest
implements DragGestureRecognizerClassTests<DragGestureRecognizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.DragGestureRecognizer]

    @Override
    public Class<DragGestureRecognizer> createNewSUT() {
        return DragGestureRecognizer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.DragGestureRecognizer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.DragGestureRecognizer]

}

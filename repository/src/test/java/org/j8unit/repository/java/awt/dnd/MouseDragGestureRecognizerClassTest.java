package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.MouseDragGestureRecognizer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link MouseDragGestureRecognizer} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.java.awt.dnd.MouseDragGestureRecognizerClassTests}).
 */
@RunWith(J8Unit4.class)
public class MouseDragGestureRecognizerClassTest
implements MouseDragGestureRecognizerClassTests<MouseDragGestureRecognizer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.dnd.MouseDragGestureRecognizer]

    @Override
    public Class<MouseDragGestureRecognizer> createNewSUT() {
        return MouseDragGestureRecognizer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.dnd.MouseDragGestureRecognizer]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.dnd.MouseDragGestureRecognizer]

}

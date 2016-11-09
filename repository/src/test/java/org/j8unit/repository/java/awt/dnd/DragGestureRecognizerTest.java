package org.j8unit.repository.java.awt.dnd;

import java.awt.dnd.DragGestureRecognizer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link DragGestureRecognizer} (by simply
 * reusing the J8Unit test interface {@link DragGestureRecognizerTests}).
 */

@RunWith(J8Unit4.class)
public class DragGestureRecognizerTest
implements DragGestureRecognizerTests<DragGestureRecognizer> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.awt.dnd.DragGestureRecognizer]

    @Override
    public DragGestureRecognizer createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.awt.dnd.DragGestureRecognizer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.awt.dnd.DragGestureRecognizer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.awt.dnd.DragGestureRecognizer]

}

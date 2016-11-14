package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.RecursiveAction;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link RecursiveAction} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.java.util.concurrent.RecursiveActionTests}).
 */

@RunWith(J8Unit4.class)
public class RecursiveActionTest
implements RecursiveActionTests<RecursiveAction> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.util.concurrent.RecursiveAction]

    @Override
    public RecursiveAction createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [java.util.concurrent.RecursiveAction], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.util.concurrent.RecursiveAction]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.util.concurrent.RecursiveAction]

}

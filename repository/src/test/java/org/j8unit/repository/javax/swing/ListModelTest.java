package org.j8unit.repository.javax.swing;

import javax.swing.ListModel;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ListModel} (by simply reusing the
 * J8Unit test interface {@link ListModelTests}).
 */

@RunWith(J8Unit4.class)
public class ListModelTest<E>
implements ListModelTests<ListModel<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ListModel]

    @Override
    public ListModel<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ListModel], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ListModel]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ListModel]

}

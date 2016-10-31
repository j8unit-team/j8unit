package org.j8unit.repository.javax.swing;

import javax.swing.ListCellRenderer;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ListCellRendererTest<E>
implements org.j8unit.repository.javax.swing.ListCellRendererTests<ListCellRenderer<E>, E> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.ListCellRenderer]

    @Override
    public ListCellRenderer<E> createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.swing.ListCellRenderer], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.ListCellRenderer]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.ListCellRenderer]

}

package org.j8unit.repository.javax.swing.event;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RowSorterEventClassTest
implements org.j8unit.repository.javax.swing.event.RowSorterEventClassTests<javax.swing.event.RowSorterEvent> {

    @RunWith(J8Unit4.class)
    public static class TypeClassTest
    implements org.j8unit.repository.javax.swing.event.RowSorterEventClassTests.TypeClassTests<javax.swing.event.RowSorterEvent.Type> {

        @Override
        public Class<javax.swing.event.RowSorterEvent.Type> createNewSUT() {
            return javax.swing.event.RowSorterEvent.Type.class;
        }

    }

    @Override
    public Class<javax.swing.event.RowSorterEvent> createNewSUT() {
        return javax.swing.event.RowSorterEvent.class;
    }

}

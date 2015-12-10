package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class RowSorterClassTest
implements org.j8unit.repository.javax.swing.RowSorterClassTests<javax.swing.RowSorter> {

    @RunWith(J8Unit4.class)
    public static class SortKeyClassTest
    implements org.j8unit.repository.javax.swing.RowSorterClassTests.SortKeyClassTests<javax.swing.RowSorter.SortKey> {

        @Override
        public Class<javax.swing.RowSorter.SortKey> createNewSUT() {
            return javax.swing.RowSorter.SortKey.class;
        }

    }

    @Override
    public Class<javax.swing.RowSorter> createNewSUT() {
        return javax.swing.RowSorter.class;
    }

}

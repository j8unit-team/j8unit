package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class RowFilterClassTest
implements org.j8unit.repository.javax.swing.RowFilterClassTests<javax.swing.RowFilter> {

    @RunWith(J8Unit4.class)
    public static class ComparisonTypeClassTest
    implements org.j8unit.repository.javax.swing.RowFilterClassTests.ComparisonTypeClassTests<javax.swing.RowFilter.ComparisonType> {

        @Override
        public Class<javax.swing.RowFilter.ComparisonType> createNewSUT() {
            return javax.swing.RowFilter.ComparisonType.class;
        }

    }

    @RunWith(J8Unit4.class)
    @SuppressWarnings("rawtypes")
    public static class EntryClassTest
    implements org.j8unit.repository.javax.swing.RowFilterClassTests.EntryClassTests<javax.swing.RowFilter.Entry> {

        @Override
        public Class<javax.swing.RowFilter.Entry> createNewSUT() {
            return javax.swing.RowFilter.Entry.class;
        }

    }

    @Override
    public Class<javax.swing.RowFilter> createNewSUT() {
        return javax.swing.RowFilter.class;
    }

}

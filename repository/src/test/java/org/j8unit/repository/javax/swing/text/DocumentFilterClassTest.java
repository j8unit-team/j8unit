package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DocumentFilterClassTest
implements org.j8unit.repository.javax.swing.text.DocumentFilterClassTests<javax.swing.text.DocumentFilter> {

    @RunWith(J8Unit4.class)
    public static class FilterBypassClassTest
    implements org.j8unit.repository.javax.swing.text.DocumentFilterClassTests.FilterBypassClassTests<javax.swing.text.DocumentFilter.FilterBypass> {

        @Override
        public Class<javax.swing.text.DocumentFilter.FilterBypass> createNewSUT() {
            return javax.swing.text.DocumentFilter.FilterBypass.class;
        }

    }

    @Override
    public Class<javax.swing.text.DocumentFilter> createNewSUT() {
        return javax.swing.text.DocumentFilter.class;
    }

}

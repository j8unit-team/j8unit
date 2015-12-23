package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class NavigationFilterClassTest
implements org.j8unit.repository.javax.swing.text.NavigationFilterClassTests<javax.swing.text.NavigationFilter> {

    @Override
    public Class<javax.swing.text.NavigationFilter> createNewSUT() {
        return javax.swing.text.NavigationFilter.class;
    }

    @RunWith(J8Unit4.class)
    public static class FilterBypassClassTest
    implements org.j8unit.repository.javax.swing.text.NavigationFilterClassTests.FilterBypassClassTests<javax.swing.text.NavigationFilter.FilterBypass> {

        @Override
        public Class<javax.swing.text.NavigationFilter.FilterBypass> createNewSUT() {
            return javax.swing.text.NavigationFilter.FilterBypass.class;
        }

    }

}

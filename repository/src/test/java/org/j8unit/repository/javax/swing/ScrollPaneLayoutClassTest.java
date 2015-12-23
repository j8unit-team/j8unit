package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollPaneLayoutClassTest
implements org.j8unit.repository.javax.swing.ScrollPaneLayoutClassTests<javax.swing.ScrollPaneLayout> {

    @Override
    public Class<javax.swing.ScrollPaneLayout> createNewSUT() {
        return javax.swing.ScrollPaneLayout.class;
    }

    @RunWith(J8Unit4.class)
    public static class UIResourceClassTest
    implements org.j8unit.repository.javax.swing.ScrollPaneLayoutClassTests.UIResourceClassTests<javax.swing.ScrollPaneLayout.UIResource> {

        @Override
        public Class<javax.swing.ScrollPaneLayout.UIResource> createNewSUT() {
            return javax.swing.ScrollPaneLayout.UIResource.class;
        }

    }

}

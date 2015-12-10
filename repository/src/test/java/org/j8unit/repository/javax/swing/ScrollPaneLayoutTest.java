package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ScrollPaneLayoutTest
implements org.j8unit.repository.javax.swing.ScrollPaneLayoutTests<javax.swing.ScrollPaneLayout> {

    @RunWith(J8Unit4.class)
    public static class UIResourceTest
    implements org.j8unit.repository.javax.swing.ScrollPaneLayoutTests.UIResourceTests<javax.swing.ScrollPaneLayout.UIResource> {

        @Override
        public javax.swing.ScrollPaneLayout.UIResource createNewSUT() {
            return new javax.swing.ScrollPaneLayout.UIResource();
        }

    }

    @Override
    public javax.swing.ScrollPaneLayout createNewSUT() {
        return new javax.swing.ScrollPaneLayout();
    }

}

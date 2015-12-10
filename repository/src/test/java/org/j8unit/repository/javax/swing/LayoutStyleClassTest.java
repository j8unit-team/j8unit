package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class LayoutStyleClassTest
implements org.j8unit.repository.javax.swing.LayoutStyleClassTests<javax.swing.LayoutStyle> {

    @RunWith(J8Unit4.class)
    public static class ComponentPlacementClassTest
    implements org.j8unit.repository.javax.swing.LayoutStyleClassTests.ComponentPlacementClassTests<javax.swing.LayoutStyle.ComponentPlacement> {

        @Override
        public Class<javax.swing.LayoutStyle.ComponentPlacement> createNewSUT() {
            return javax.swing.LayoutStyle.ComponentPlacement.class;
        }

    }

    @Override
    public Class<javax.swing.LayoutStyle> createNewSUT() {
        return javax.swing.LayoutStyle.class;
    }

}

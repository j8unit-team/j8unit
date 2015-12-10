package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JComponentClassTest
implements org.j8unit.repository.javax.swing.JComponentClassTests<javax.swing.JComponent> {

    @RunWith(J8Unit4.class)
    public static class AccessibleJComponentClassTest
    implements org.j8unit.repository.javax.swing.JComponentClassTests.AccessibleJComponentClassTests<javax.swing.JComponent.AccessibleJComponent> {

        @Override
        public Class<javax.swing.JComponent.AccessibleJComponent> createNewSUT() {
            return javax.swing.JComponent.AccessibleJComponent.class;
        }

    }

    @Override
    public Class<javax.swing.JComponent> createNewSUT() {
        return javax.swing.JComponent.class;
    }

}

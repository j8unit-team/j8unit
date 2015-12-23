package org.j8unit.repository.javax.swing.text;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JTextComponentClassTest
implements org.j8unit.repository.javax.swing.text.JTextComponentClassTests<javax.swing.text.JTextComponent> {

    @Override
    public Class<javax.swing.text.JTextComponent> createNewSUT() {
        return javax.swing.text.JTextComponent.class;
    }

    @RunWith(J8Unit4.class)
    public static class DropLocationClassTest
    implements org.j8unit.repository.javax.swing.text.JTextComponentClassTests.DropLocationClassTests<javax.swing.text.JTextComponent.DropLocation> {

        @Override
        public Class<javax.swing.text.JTextComponent.DropLocation> createNewSUT() {
            return javax.swing.text.JTextComponent.DropLocation.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class KeyBindingClassTest
    implements org.j8unit.repository.javax.swing.text.JTextComponentClassTests.KeyBindingClassTests<javax.swing.text.JTextComponent.KeyBinding> {

        @Override
        public Class<javax.swing.text.JTextComponent.KeyBinding> createNewSUT() {
            return javax.swing.text.JTextComponent.KeyBinding.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class AccessibleJTextComponentClassTest
    implements
    org.j8unit.repository.javax.swing.text.JTextComponentClassTests.AccessibleJTextComponentClassTests<javax.swing.text.JTextComponent.AccessibleJTextComponent> {

        @Override
        public Class<javax.swing.text.JTextComponent.AccessibleJTextComponent> createNewSUT() {
            return javax.swing.text.JTextComponent.AccessibleJTextComponent.class;
        }

    }

}

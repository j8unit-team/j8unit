package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JFormattedTextFieldClassTest
implements org.j8unit.repository.javax.swing.JFormattedTextFieldClassTests<javax.swing.JFormattedTextField> {

    @RunWith(J8Unit4.class)
    public static class AbstractFormatterClassTest
    implements org.j8unit.repository.javax.swing.JFormattedTextFieldClassTests.AbstractFormatterClassTests<javax.swing.JFormattedTextField.AbstractFormatter> {

        @Override
        public Class<javax.swing.JFormattedTextField.AbstractFormatter> createNewSUT() {
            return javax.swing.JFormattedTextField.AbstractFormatter.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class AbstractFormatterFactoryClassTest
    implements
    org.j8unit.repository.javax.swing.JFormattedTextFieldClassTests.AbstractFormatterFactoryClassTests<javax.swing.JFormattedTextField.AbstractFormatterFactory> {

        @Override
        public Class<javax.swing.JFormattedTextField.AbstractFormatterFactory> createNewSUT() {
            return javax.swing.JFormattedTextField.AbstractFormatterFactory.class;
        }

    }

    @Override
    public Class<javax.swing.JFormattedTextField> createNewSUT() {
        return javax.swing.JFormattedTextField.class;
    }

}

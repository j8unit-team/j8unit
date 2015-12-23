package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JSpinnerClassTest
implements org.j8unit.repository.javax.swing.JSpinnerClassTests<javax.swing.JSpinner> {

    @Override
    public Class<javax.swing.JSpinner> createNewSUT() {
        return javax.swing.JSpinner.class;
    }

    @RunWith(J8Unit4.class)
    public static class ListEditorClassTest
    implements org.j8unit.repository.javax.swing.JSpinnerClassTests.ListEditorClassTests<javax.swing.JSpinner.ListEditor> {

        @Override
        public Class<javax.swing.JSpinner.ListEditor> createNewSUT() {
            return javax.swing.JSpinner.ListEditor.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class NumberEditorClassTest
    implements org.j8unit.repository.javax.swing.JSpinnerClassTests.NumberEditorClassTests<javax.swing.JSpinner.NumberEditor> {

        @Override
        public Class<javax.swing.JSpinner.NumberEditor> createNewSUT() {
            return javax.swing.JSpinner.NumberEditor.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class DateEditorClassTest
    implements org.j8unit.repository.javax.swing.JSpinnerClassTests.DateEditorClassTests<javax.swing.JSpinner.DateEditor> {

        @Override
        public Class<javax.swing.JSpinner.DateEditor> createNewSUT() {
            return javax.swing.JSpinner.DateEditor.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class DefaultEditorClassTest
    implements org.j8unit.repository.javax.swing.JSpinnerClassTests.DefaultEditorClassTests<javax.swing.JSpinner.DefaultEditor> {

        @Override
        public Class<javax.swing.JSpinner.DefaultEditor> createNewSUT() {
            return javax.swing.JSpinner.DefaultEditor.class;
        }

    }

}

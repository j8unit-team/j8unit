package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JSpinnerTest
implements org.j8unit.repository.javax.swing.JSpinnerTests<javax.swing.JSpinner> {

    @RunWith(J8Unit4.class)
    public static class DateEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.DateEditorTests<javax.swing.JSpinner.DateEditor> {

        @Override
        public javax.swing.JSpinner.DateEditor createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.JSpinner.DateEditor] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class DefaultEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.DefaultEditorTests<javax.swing.JSpinner.DefaultEditor> {

        @Override
        public javax.swing.JSpinner.DefaultEditor createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.JSpinner.DefaultEditor] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class ListEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.ListEditorTests<javax.swing.JSpinner.ListEditor> {

        @Override
        public javax.swing.JSpinner.ListEditor createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.JSpinner.ListEditor] available.");
        }

    }

    @RunWith(J8Unit4.class)
    public static class NumberEditorTest
    implements org.j8unit.repository.javax.swing.JSpinnerTests.NumberEditorTests<javax.swing.JSpinner.NumberEditor> {

        @Override
        public javax.swing.JSpinner.NumberEditor createNewSUT() {
            throw new AssertionError("There is no default constructor for [javax.swing.JSpinner.NumberEditor] available.");
        }

    }

    @Override
    public javax.swing.JSpinner createNewSUT() {
        return new javax.swing.JSpinner();
    }

}

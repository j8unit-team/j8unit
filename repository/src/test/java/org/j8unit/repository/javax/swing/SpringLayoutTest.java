package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SpringLayoutTest
implements org.j8unit.repository.javax.swing.SpringLayoutTests<javax.swing.SpringLayout> {

    @Override
    public javax.swing.SpringLayout createNewSUT() {
        return new javax.swing.SpringLayout();
    }

    @RunWith(J8Unit4.class)
    public static class ConstraintsTest
    implements org.j8unit.repository.javax.swing.SpringLayoutTests.ConstraintsTests<javax.swing.SpringLayout.Constraints> {

        @Override
        public javax.swing.SpringLayout.Constraints createNewSUT() {
            return new javax.swing.SpringLayout.Constraints();
        }

    }

}

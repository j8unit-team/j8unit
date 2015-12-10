package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SpringLayoutClassTest
implements org.j8unit.repository.javax.swing.SpringLayoutClassTests<javax.swing.SpringLayout> {

    @RunWith(J8Unit4.class)
    public static class ConstraintsClassTest
    implements org.j8unit.repository.javax.swing.SpringLayoutClassTests.ConstraintsClassTests<javax.swing.SpringLayout.Constraints> {

        @Override
        public Class<javax.swing.SpringLayout.Constraints> createNewSUT() {
            return javax.swing.SpringLayout.Constraints.class;
        }

    }

    @Override
    public Class<javax.swing.SpringLayout> createNewSUT() {
        return javax.swing.SpringLayout.class;
    }

}

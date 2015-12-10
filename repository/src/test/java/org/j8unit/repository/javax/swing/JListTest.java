package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class JListTest<E>
implements org.j8unit.repository.javax.swing.JListTests<javax.swing.JList<E>, E> {

    @RunWith(J8Unit4.class)
    public static class DropLocationTest
    implements org.j8unit.repository.javax.swing.JListTests.DropLocationTests<javax.swing.JList.DropLocation> {

        @Override
        public javax.swing.JList.DropLocation createNewSUT() {
            throw new AssumptionViolatedException("There is no default constructor for [javax.swing.JList.DropLocation] available.");
        }

    }

    @Override
    public javax.swing.JList<E> createNewSUT() {
        return new javax.swing.JList();
    }

}

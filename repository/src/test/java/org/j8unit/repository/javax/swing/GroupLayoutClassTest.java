package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GroupLayoutClassTest
implements org.j8unit.repository.javax.swing.GroupLayoutClassTests<javax.swing.GroupLayout> {

    @RunWith(J8Unit4.class)
    public static class AlignmentClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.AlignmentClassTests<javax.swing.GroupLayout.Alignment> {

        @Override
        public Class<javax.swing.GroupLayout.Alignment> createNewSUT() {
            return javax.swing.GroupLayout.Alignment.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class GroupClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.GroupClassTests<javax.swing.GroupLayout.Group> {

        @Override
        public Class<javax.swing.GroupLayout.Group> createNewSUT() {
            return javax.swing.GroupLayout.Group.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class ParallelGroupClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.ParallelGroupClassTests<javax.swing.GroupLayout.ParallelGroup> {

        @Override
        public Class<javax.swing.GroupLayout.ParallelGroup> createNewSUT() {
            return javax.swing.GroupLayout.ParallelGroup.class;
        }

    }

    @RunWith(J8Unit4.class)
    public static class SequentialGroupClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.SequentialGroupClassTests<javax.swing.GroupLayout.SequentialGroup> {

        @Override
        public Class<javax.swing.GroupLayout.SequentialGroup> createNewSUT() {
            return javax.swing.GroupLayout.SequentialGroup.class;
        }

    }

    @Override
    public Class<javax.swing.GroupLayout> createNewSUT() {
        return javax.swing.GroupLayout.class;
    }

}

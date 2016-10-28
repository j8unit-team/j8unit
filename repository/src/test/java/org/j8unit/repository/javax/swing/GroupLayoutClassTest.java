package org.j8unit.repository.javax.swing;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.Group;
import javax.swing.GroupLayout.ParallelGroup;
import javax.swing.GroupLayout.SequentialGroup;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class GroupLayoutClassTest
implements org.j8unit.repository.javax.swing.GroupLayoutClassTests<GroupLayout> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.GroupLayout]

    @Override
    public Class<GroupLayout> createNewSUT() {
        return GroupLayout.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link GroupLayout#GroupLayout(Container) public
     * javax.swing.GroupLayout(java.awt.Container)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_GroupLayout_Container()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final GroupLayout sut = null; // = new GroupLayout(Container);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.GroupLayout]

    @RunWith(J8Unit4.class)
    public static class SequentialGroupClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.SequentialGroupClassTests<SequentialGroup> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.GroupLayout$SequentialGroup]

        @Override
        public Class<SequentialGroup> createNewSUT() {
            return SequentialGroup.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.GroupLayout$SequentialGroup]

    }

    @RunWith(J8Unit4.class)
    public static class AlignmentClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.AlignmentClassTests<Alignment> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.GroupLayout$Alignment]

        @Override
        public Class<Alignment> createNewSUT() {
            return Alignment.class;
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link Alignment#values() public static
         * javax.swing.GroupLayout$Alignment[] javax.swing.GroupLayout$Alignment.values()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_values()
        throws Exception {
            // write some test for {@link Alignment#values()}
        }

        /**
         * <p>
         * Test method for the hereby targeted method-under-test {@link Alignment#valueOf(String) public static
         * javax.swing.GroupLayout$Alignment javax.swing.GroupLayout$Alignment.valueOf(java.lang.String)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @since 0.9.0
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Test
        @Category(Draft.class)
        public void test_valueOf_String()
        throws Exception {
            // write some test for {@link Alignment#valueOf(String)}
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.GroupLayout$Alignment]

    }

    @RunWith(J8Unit4.class)
    public static class ParallelGroupClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.ParallelGroupClassTests<ParallelGroup> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.GroupLayout$ParallelGroup]

        @Override
        public Class<ParallelGroup> createNewSUT() {
            return ParallelGroup.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.GroupLayout$ParallelGroup]

    }

    @RunWith(J8Unit4.class)
    public static class GroupClassTest
    implements org.j8unit.repository.javax.swing.GroupLayoutClassTests.GroupClassTests<Group> {

        // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.GroupLayout$Group]

        @Override
        public Class<Group> createNewSUT() {
            return Group.class;
        }

        // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.GroupLayout$Group]

    }

}

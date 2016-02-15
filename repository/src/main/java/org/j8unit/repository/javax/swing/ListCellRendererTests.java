package org.j8unit.repository.javax.swing;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.swing.ListCellRenderer interface javax.swing.ListCellRenderer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link ListCellRendererClassTests}.
 * </p>
 *
 * @see javax.swing.ListCellRenderer interface javax.swing.ListCellRenderer (the hereby targeted class-under-test class)
 * @see ListCellRendererClassTests ListCellRendererClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ListCellRendererTests<SUT extends javax.swing.ListCellRenderer<E>, E>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for
     * {@link javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList, Object, int, boolean, boolean)
     * public abstract java.awt.Component javax.swing.ListCellRenderer.getListCellRendererComponent(javax.swing.JList<?
     * extends E>,E,int,boolean,boolean)}.
     *
     * <p>
     * Test method for
     * {@link javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList, Object, int, boolean, boolean)
     * public abstract java.awt.Component
     * javax.swing.ListCellRenderer.getListCellRendererComponent(javax.swing.JList,java.lang.Object,int,boolean,boolean)}
     * .
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.swing.ListCellRenderer#getListCellRendererComponent(javax.swing.JList, Object, int, boolean, boolean)
     *      public abstract java.awt.Component
     *      javax.swing.ListCellRenderer.getListCellRendererComponent(javax.swing.JList,java.lang.Object,int,boolean,
     *      boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getListCellRendererComponent_JList_Object_int_boolean_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

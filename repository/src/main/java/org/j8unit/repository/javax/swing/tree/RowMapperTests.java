package org.j8unit.repository.javax.swing.tree;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.tree.RowMapper interface javax.swing.tree.RowMapper}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.tree.RowMapperClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface RowMapperTests<SUT extends javax.swing.tree.RowMapper>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.tree.RowMapper#getRowsForPaths(javax.swing.tree.TreePath[]) public abstract
     * int[] javax.swing.tree.RowMapper.getRowsForPaths(javax.swing.tree.TreePath[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getRowsForPaths_TreePathArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

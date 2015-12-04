package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.DefaultMenuLayout class javax.swing.plaf.basic.DefaultMenuLayout},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.DefaultMenuLayoutClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DefaultMenuLayoutTests<SUT extends javax.swing.plaf.basic.DefaultMenuLayout>
extends org.j8unit.repository.javax.swing.plaf.UIResourceTests<SUT>, org.j8unit.repository.javax.swing.BoxLayoutTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.DefaultMenuLayout#preferredLayoutSize(java.awt.Container) public
     * java.awt.Dimension javax.swing.plaf.basic.DefaultMenuLayout.preferredLayoutSize(java.awt.Container)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_preferredLayoutSize_Container()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

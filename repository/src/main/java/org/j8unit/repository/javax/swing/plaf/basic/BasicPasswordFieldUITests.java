package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicPasswordFieldUI class javax.swing.plaf.basic.BasicPasswordFieldUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicPasswordFieldUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicPasswordFieldUITests<SUT extends javax.swing.plaf.basic.BasicPasswordFieldUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicTextFieldUITests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicPasswordFieldUI#create(javax.swing.text.Element) public
     * javax.swing.text.View javax.swing.plaf.basic.BasicPasswordFieldUI.create(javax.swing.text.Element)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_create_Element()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.javax.swing.plaf.basic;

import org.j8unit.*;
import org.j8unit.repository.categories.*;
import org.junit.*;
import org.junit.experimental.categories.Category;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import static org.junit.Assert.*;

/**
 * <p>
 * Test class for {@link javax.swing.plaf.basic.BasicCheckBoxUI class javax.swing.plaf.basic.BasicCheckBoxUI},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicCheckBoxUIClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicCheckBoxUITests<SUT extends javax.swing.plaf.basic.BasicCheckBoxUI>
extends org.j8unit.repository.javax.swing.plaf.basic.BasicRadioButtonUITests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicCheckBoxUI#getPropertyPrefix() public java.lang.String javax.swing.plaf.basic.BasicCheckBoxUI.getPropertyPrefix()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPropertyPrefix() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

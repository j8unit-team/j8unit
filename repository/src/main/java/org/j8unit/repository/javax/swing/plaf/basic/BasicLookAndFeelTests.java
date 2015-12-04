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
 * Test class for {@link javax.swing.plaf.basic.BasicLookAndFeel class javax.swing.plaf.basic.BasicLookAndFeel},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.swing.plaf.basic.BasicLookAndFeelClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BasicLookAndFeelTests<SUT extends javax.swing.plaf.basic.BasicLookAndFeel>
extends org.j8unit.repository.java.io.SerializableTests<SUT>,
        org.j8unit.repository.javax.swing.LookAndFeelTests<SUT>
{

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicLookAndFeel#initialize() public void javax.swing.plaf.basic.BasicLookAndFeel.initialize()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_initialize() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicLookAndFeel#getDefaults() public javax.swing.UIDefaults javax.swing.plaf.basic.BasicLookAndFeel.getDefaults()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_getDefaults() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.swing.plaf.basic.BasicLookAndFeel#uninitialize() public void javax.swing.plaf.basic.BasicLookAndFeel.uninitialize()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    @Override
    public default void test_uninitialize() throws Exception {
        // query fresh subject-under-test
        SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

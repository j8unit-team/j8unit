package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.awt.GraphicsConfigTemplate class java.awt.GraphicsConfigTemplate}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.awt.GraphicsConfigTemplateClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface GraphicsConfigTemplateTests<SUT extends java.awt.GraphicsConfigTemplate>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.GraphicsConfigTemplate#isGraphicsConfigSupported(java.awt.GraphicsConfiguration)
     * public abstract boolean
     * java.awt.GraphicsConfigTemplate.isGraphicsConfigSupported(java.awt.GraphicsConfiguration)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isGraphicsConfigSupported_GraphicsConfiguration()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.awt.GraphicsConfigTemplate#getBestConfiguration(java.awt.GraphicsConfiguration[])
     * public abstract java.awt.GraphicsConfiguration
     * java.awt.GraphicsConfigTemplate.getBestConfiguration(java.awt.GraphicsConfiguration[])}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getBestConfiguration_GraphicsConfigurationArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

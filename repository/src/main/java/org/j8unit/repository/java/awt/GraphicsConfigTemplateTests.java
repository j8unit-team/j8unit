package org.j8unit.repository.java.awt;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.awt.GraphicsConfigTemplate class java.awt.GraphicsConfigTemplate}.
 * The complementary j8unit test interface containing the class relevant aspects is
 * {@link GraphicsConfigTemplateClassTests}.
 * </p>
 *
 * @see java.awt.GraphicsConfigTemplate class java.awt.GraphicsConfigTemplate (the hereby targeted class-under-test
 *      class)
 * @see GraphicsConfigTemplateClassTests GraphicsConfigTemplateClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface GraphicsConfigTemplateTests<SUT extends java.awt.GraphicsConfigTemplate>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.awt.GraphicsConfigTemplate#isGraphicsConfigSupported(java.awt.GraphicsConfiguration)
     * public abstract boolean
     * java.awt.GraphicsConfigTemplate.isGraphicsConfigSupported(java.awt.GraphicsConfiguration)}.
     *
     * <p>
     * Test method for {@link java.awt.GraphicsConfigTemplate#isGraphicsConfigSupported(java.awt.GraphicsConfiguration)
     * public abstract boolean
     * java.awt.GraphicsConfigTemplate.isGraphicsConfigSupported(java.awt.GraphicsConfiguration)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.GraphicsConfigTemplate#isGraphicsConfigSupported(java.awt.GraphicsConfiguration) public abstract
     *      boolean java.awt.GraphicsConfigTemplate.isGraphicsConfigSupported(java.awt.GraphicsConfiguration) (the
     *      hereby targeted method-under-test)
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
     *
     * <p>
     * Test method for {@link java.awt.GraphicsConfigTemplate#getBestConfiguration(java.awt.GraphicsConfiguration[])
     * public abstract java.awt.GraphicsConfiguration
     * java.awt.GraphicsConfigTemplate.getBestConfiguration(java.awt.GraphicsConfiguration[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.awt.GraphicsConfigTemplate#getBestConfiguration(java.awt.GraphicsConfiguration[]) public abstract
     *      java.awt.GraphicsConfiguration
     *      java.awt.GraphicsConfigTemplate.getBestConfiguration(java.awt.GraphicsConfiguration[]) (the hereby targeted
     *      method-under-test)
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

package org.j8unit.repository.javax.xml.transform;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.transform.Templates interface javax.xml.transform.Templates}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link TemplatesClassTests}.
 * </p>
 *
 * @see javax.xml.transform.Templates interface javax.xml.transform.Templates (the hereby targeted class-under-test
 *      class)
 * @see TemplatesClassTests TemplatesClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemplatesTests<SUT extends javax.xml.transform.Templates>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Templates#newTransformer() public abstract
     * javax.xml.transform.Transformer javax.xml.transform.Templates.newTransformer() throws
     * javax.xml.transform.TransformerConfigurationException}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Templates#newTransformer() public abstract
     * javax.xml.transform.Transformer javax.xml.transform.Templates.newTransformer() throws
     * javax.xml.transform.TransformerConfigurationException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Templates#newTransformer() public abstract javax.xml.transform.Transformer
     *      javax.xml.transform.Templates.newTransformer() throws javax.xml.transform.TransformerConfigurationException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_newTransformer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Templates#getOutputProperties() public abstract java.util.Properties
     * javax.xml.transform.Templates.getOutputProperties()}.
     *
     * <p>
     * Test method for {@link javax.xml.transform.Templates#getOutputProperties() public abstract java.util.Properties
     * javax.xml.transform.Templates.getOutputProperties()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.transform.Templates#getOutputProperties() public abstract java.util.Properties
     *      javax.xml.transform.Templates.getOutputProperties() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getOutputProperties()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

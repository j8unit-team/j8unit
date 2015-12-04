package org.j8unit.repository.javax.xml.transform;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link javax.xml.transform.Templates interface javax.xml.transform.Templates}, containing all instance
 * relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.javax.xml.transform.TemplatesClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface TemplatesTests<SUT extends javax.xml.transform.Templates>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Templates#getOutputProperties() public abstract java.util.Properties
     * javax.xml.transform.Templates.getOutputProperties()}.
     * </p>
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

    /**
     * <p>
     * Test method for {@link javax.xml.transform.Templates#newTransformer() public abstract
     * javax.xml.transform.Transformer javax.xml.transform.Templates.newTransformer() throws
     * javax.xml.transform.TransformerConfigurationException}.
     * </p>
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

}

package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.spec.ExcC14NParameterSpec class
 * javax.xml.crypto.dsig.spec.ExcC14NParameterSpec}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link ExcC14NParameterSpecClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.spec.ExcC14NParameterSpec class javax.xml.crypto.dsig.spec.ExcC14NParameterSpec (the
 *      hereby targeted class-under-test class)
 * @see ExcC14NParameterSpecClassTests ExcC14NParameterSpecClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ExcC14NParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.ExcC14NParameterSpec>
extends C14NMethodParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.ExcC14NParameterSpec#getPrefixList() public java.util.List
     * javax.xml.crypto.dsig.spec.ExcC14NParameterSpec.getPrefixList()}.
     *
     * <p>
     * Test method for {@link javax.xml.crypto.dsig.spec.ExcC14NParameterSpec#getPrefixList() public java.util.List
     * javax.xml.crypto.dsig.spec.ExcC14NParameterSpec.getPrefixList()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.xml.crypto.dsig.spec.ExcC14NParameterSpec#getPrefixList() public java.util.List
     *      javax.xml.crypto.dsig.spec.ExcC14NParameterSpec.getPrefixList() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrefixList()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

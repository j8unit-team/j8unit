package org.j8unit.repository.java.security.spec;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.security.spec.DSAGenParameterSpec class
 * java.security.spec.DSAGenParameterSpec}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DSAGenParameterSpecClassTests}.
 * </p>
 *
 * @see java.security.spec.DSAGenParameterSpec class java.security.spec.DSAGenParameterSpec (the hereby targeted
 *      class-under-test class)
 * @see DSAGenParameterSpecClassTests DSAGenParameterSpecClassTests (the complementary j8unit test interface containing
 *      the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DSAGenParameterSpecTests<SUT extends java.security.spec.DSAGenParameterSpec>
extends AlgorithmParameterSpecTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.security.spec.DSAGenParameterSpec#getPrimePLength() public int
     * java.security.spec.DSAGenParameterSpec.getPrimePLength()}.
     *
     * <p>
     * Test method for {@link java.security.spec.DSAGenParameterSpec#getPrimePLength() public int
     * java.security.spec.DSAGenParameterSpec.getPrimePLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.DSAGenParameterSpec#getPrimePLength() public int
     *      java.security.spec.DSAGenParameterSpec.getPrimePLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getPrimePLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.DSAGenParameterSpec#getSubprimeQLength() public int
     * java.security.spec.DSAGenParameterSpec.getSubprimeQLength()}.
     *
     * <p>
     * Test method for {@link java.security.spec.DSAGenParameterSpec#getSubprimeQLength() public int
     * java.security.spec.DSAGenParameterSpec.getSubprimeQLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.DSAGenParameterSpec#getSubprimeQLength() public int
     *      java.security.spec.DSAGenParameterSpec.getSubprimeQLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSubprimeQLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.security.spec.DSAGenParameterSpec#getSeedLength() public int
     * java.security.spec.DSAGenParameterSpec.getSeedLength()}.
     *
     * <p>
     * Test method for {@link java.security.spec.DSAGenParameterSpec#getSeedLength() public int
     * java.security.spec.DSAGenParameterSpec.getSeedLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.security.spec.DSAGenParameterSpec#getSeedLength() public int
     *      java.security.spec.DSAGenParameterSpec.getSeedLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSeedLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

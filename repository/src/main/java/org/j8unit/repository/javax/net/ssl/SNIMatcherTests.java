package org.j8unit.repository.javax.net.ssl;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.net.ssl.SNIMatcher class javax.net.ssl.SNIMatcher}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SNIMatcherClassTests}.
 * </p>
 *
 * @see javax.net.ssl.SNIMatcher class javax.net.ssl.SNIMatcher (the hereby targeted class-under-test class)
 * @see SNIMatcherClassTests SNIMatcherClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SNIMatcherTests<SUT extends javax.net.ssl.SNIMatcher>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SNIMatcher#getType() public final int javax.net.ssl.SNIMatcher.getType()}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SNIMatcher#getType() public final int javax.net.ssl.SNIMatcher.getType()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SNIMatcher#getType() public final int javax.net.ssl.SNIMatcher.getType() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getType()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.net.ssl.SNIMatcher#matches(javax.net.ssl.SNIServerName) public abstract boolean
     * javax.net.ssl.SNIMatcher.matches(javax.net.ssl.SNIServerName)}.
     *
     * <p>
     * Test method for {@link javax.net.ssl.SNIMatcher#matches(javax.net.ssl.SNIServerName) public abstract boolean
     * javax.net.ssl.SNIMatcher.matches(javax.net.ssl.SNIServerName)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.net.ssl.SNIMatcher#matches(javax.net.ssl.SNIServerName) public abstract boolean
     *      javax.net.ssl.SNIMatcher.matches(javax.net.ssl.SNIServerName) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_matches_SNIServerName()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

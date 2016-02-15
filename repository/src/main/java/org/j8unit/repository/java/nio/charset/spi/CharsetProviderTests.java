package org.j8unit.repository.java.nio.charset.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.charset.spi.CharsetProvider class
 * java.nio.charset.spi.CharsetProvider}. The complementary j8unit test interface containing the class relevant aspects
 * is {@link CharsetProviderClassTests}.
 * </p>
 *
 * @see java.nio.charset.spi.CharsetProvider class java.nio.charset.spi.CharsetProvider (the hereby targeted
 *      class-under-test class)
 * @see CharsetProviderClassTests CharsetProviderClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CharsetProviderTests<SUT extends java.nio.charset.spi.CharsetProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.charset.spi.CharsetProvider#charsetForName(String) public abstract
     * java.nio.charset.Charset java.nio.charset.spi.CharsetProvider.charsetForName(java.lang.String)}.
     *
     * <p>
     * Test method for {@link java.nio.charset.spi.CharsetProvider#charsetForName(String) public abstract
     * java.nio.charset.Charset java.nio.charset.spi.CharsetProvider.charsetForName(java.lang.String)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.charset.spi.CharsetProvider#charsetForName(String) public abstract java.nio.charset.Charset
     *      java.nio.charset.spi.CharsetProvider.charsetForName(java.lang.String) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_charsetForName_String()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.charset.spi.CharsetProvider#charsets() public abstract java.util.Iterator
     * <java.nio.charset.Charset> java.nio.charset.spi.CharsetProvider.charsets()}.
     *
     * <p>
     * Test method for {@link java.nio.charset.spi.CharsetProvider#charsets() public abstract java.util.Iterator
     * java.nio.charset.spi.CharsetProvider.charsets()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.charset.spi.CharsetProvider#charsets() public abstract java.util.Iterator
     *      java.nio.charset.spi.CharsetProvider.charsets() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_charsets()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.java.nio.charset.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.charset.spi.CharsetProvider class java.nio.charset.spi.CharsetProvider}, containing
 * all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.charset.spi.CharsetProviderClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CharsetProviderTests<SUT extends java.nio.charset.spi.CharsetProvider>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.charset.spi.CharsetProvider#charsetForName(java.lang.String) public abstract
     * java.nio.charset.Charset java.nio.charset.spi.CharsetProvider.charsetForName(java.lang.String)}.
     * </p>
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
     * java.nio.charset.spi.CharsetProvider.charsets()}.
     * </p>
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

package org.j8unit.repository.java.text.spi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.text.spi.BreakIteratorProvider class java.text.spi.BreakIteratorProvider}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.text.spi.BreakIteratorProviderClassTests
 */
@Category(J8UnitRepository.class)
public abstract interface BreakIteratorProviderTests<SUT extends java.text.spi.BreakIteratorProvider>
extends org.j8unit.repository.java.util.spi.LocaleServiceProviderTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.text.spi.BreakIteratorProvider#getLineInstance(java.util.Locale) public abstract
     * java.text.BreakIterator java.text.spi.BreakIteratorProvider.getLineInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLineInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.BreakIteratorProvider#getCharacterInstance(java.util.Locale) public abstract
     * java.text.BreakIterator java.text.spi.BreakIteratorProvider.getCharacterInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getCharacterInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.BreakIteratorProvider#getWordInstance(java.util.Locale) public abstract
     * java.text.BreakIterator java.text.spi.BreakIteratorProvider.getWordInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getWordInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.text.spi.BreakIteratorProvider#getSentenceInstance(java.util.Locale) public abstract
     * java.text.BreakIterator java.text.spi.BreakIteratorProvider.getSentenceInstance(java.util.Locale)}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSentenceInstance_Locale()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

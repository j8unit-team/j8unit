package org.j8unit.repository.java.lang;

import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Readable interface java.lang.Readable}. The complementary j8unit test
 * interface containing the class relevant aspects is {@link ReadableClassTests}.
 * </p>
 *
 * @see Readable interface java.lang.Readable (the hereby targeted class-under-test class)
 * @see ReadableClassTests ReadableClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ReadableTests<SUT extends Readable>
extends RepositoryTests<SUT> {

    /**
     * <p>
     * Test method for {@link Readable#read(java.nio.CharBuffer) public abstract int
     * java.lang.Readable.read(java.nio.CharBuffer) throws java.io.IOException}.
     *
     * <p>
     * Test method for {@link Readable#read(java.nio.CharBuffer) public abstract int
     * java.lang.Readable.read(java.nio.CharBuffer) throws java.io.IOException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Readable#read(java.nio.CharBuffer) public abstract int java.lang.Readable.read(java.nio.CharBuffer) throws
     *      java.io.IOException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_read_CharBuffer()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.J8UnitTest;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.attribute.FileAttribute interface java.nio.file.attribute.FileAttribute},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.attribute.FileAttributeClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface FileAttributeTests<SUT extends java.nio.file.attribute.FileAttribute<T>, T>
extends J8UnitTest<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.FileAttribute#name() public abstract java.lang.String
     * java.nio.file.attribute.FileAttribute.name()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_name()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.FileAttribute#value() public abstract java.lang.Object
     * java.nio.file.attribute.FileAttribute.value()}.
     * </p>
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_value()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

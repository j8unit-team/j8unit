package org.j8unit.repository.java.nio.file.attribute;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.nio.file.attribute.DosFileAttributes interface
 * java.nio.file.attribute.DosFileAttributes}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link DosFileAttributesClassTests}.
 * </p>
 *
 * @see java.nio.file.attribute.DosFileAttributes interface java.nio.file.attribute.DosFileAttributes (the hereby
 *      targeted class-under-test class)
 * @see DosFileAttributesClassTests DosFileAttributesClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DosFileAttributesTests<SUT extends java.nio.file.attribute.DosFileAttributes>
extends BasicFileAttributesTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isHidden() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isHidden()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isHidden() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isHidden()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.DosFileAttributes#isHidden() public abstract boolean
     *      java.nio.file.attribute.DosFileAttributes.isHidden() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isHidden()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isSystem() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isSystem()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isSystem() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isSystem()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.DosFileAttributes#isSystem() public abstract boolean
     *      java.nio.file.attribute.DosFileAttributes.isSystem() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isSystem()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isArchive() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isArchive()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isArchive() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isArchive()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.DosFileAttributes#isArchive() public abstract boolean
     *      java.nio.file.attribute.DosFileAttributes.isArchive() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isArchive()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isReadOnly() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isReadOnly()}.
     *
     * <p>
     * Test method for {@link java.nio.file.attribute.DosFileAttributes#isReadOnly() public abstract boolean
     * java.nio.file.attribute.DosFileAttributes.isReadOnly()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.nio.file.attribute.DosFileAttributes#isReadOnly() public abstract boolean
     *      java.nio.file.attribute.DosFileAttributes.isReadOnly() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isReadOnly()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

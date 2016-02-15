package org.j8unit.repository.java.util.stream;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain java.util.stream.BaseStream interface java.util.stream.BaseStream}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link BaseStreamClassTests}.
 * </p>
 *
 * @see java.util.stream.BaseStream interface java.util.stream.BaseStream (the hereby targeted class-under-test class)
 * @see BaseStreamClassTests BaseStreamClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface BaseStreamTests<SUT extends java.util.stream.BaseStream<T, S>, T, S extends java.util.stream.BaseStream<T, S>>
extends org.j8unit.repository.java.lang.AutoCloseableTests<SUT> {

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#isParallel() public abstract boolean
     * java.util.stream.BaseStream.isParallel()}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#isParallel() public abstract boolean
     * java.util.stream.BaseStream.isParallel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#isParallel() public abstract boolean java.util.stream.BaseStream.isParallel()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isParallel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#close() public abstract void
     * java.util.stream.BaseStream.close()}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#close() public abstract void
     * java.util.stream.BaseStream.close()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#close() public abstract void java.util.stream.BaseStream.close() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_close()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#unordered() public abstract S
     * java.util.stream.BaseStream.unordered()}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#unordered() public abstract java.util.stream.BaseStream
     * java.util.stream.BaseStream.unordered()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#unordered() public abstract java.util.stream.BaseStream
     *      java.util.stream.BaseStream.unordered() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_unordered()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#iterator() public abstract java.util.Iterator
     * <T> java.util.stream.BaseStream.iterator()}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#iterator() public abstract java.util.Iterator
     * java.util.stream.BaseStream.iterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#iterator() public abstract java.util.Iterator
     *      java.util.stream.BaseStream.iterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_iterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#onClose(Runnable) public abstract S
     * java.util.stream.BaseStream.onClose(java.lang.Runnable)}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#onClose(Runnable) public abstract java.util.stream.BaseStream
     * java.util.stream.BaseStream.onClose(java.lang.Runnable)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#onClose(Runnable) public abstract java.util.stream.BaseStream
     *      java.util.stream.BaseStream.onClose(java.lang.Runnable) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_onClose_Runnable()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#spliterator() public abstract java.util.Spliterator
     * <T> java.util.stream.BaseStream.spliterator()}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#spliterator() public abstract java.util.Spliterator
     * java.util.stream.BaseStream.spliterator()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#spliterator() public abstract java.util.Spliterator
     *      java.util.stream.BaseStream.spliterator() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_spliterator()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#parallel() public abstract S
     * java.util.stream.BaseStream.parallel()}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#parallel() public abstract java.util.stream.BaseStream
     * java.util.stream.BaseStream.parallel()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#parallel() public abstract java.util.stream.BaseStream
     *      java.util.stream.BaseStream.parallel() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_parallel()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link java.util.stream.BaseStream#sequential() public abstract S
     * java.util.stream.BaseStream.sequential()}.
     *
     * <p>
     * Test method for {@link java.util.stream.BaseStream#sequential() public abstract java.util.stream.BaseStream
     * java.util.stream.BaseStream.sequential()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see java.util.stream.BaseStream#sequential() public abstract java.util.stream.BaseStream
     *      java.util.stream.BaseStream.sequential() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_sequential()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

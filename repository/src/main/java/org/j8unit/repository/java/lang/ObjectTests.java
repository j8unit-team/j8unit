package org.j8unit.repository.java.lang;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.categories.Should;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain Object class java.lang.Object}. The complementary j8unit test interface
 * containing the class relevant aspects is {@link ObjectClassTests}.
 * </p>
 *
 * @see Object class java.lang.Object (the hereby targeted class-under-test class)
 * @see ObjectClassTests ObjectClassTests (the complementary j8unit test interface containing the class relevant test
 *      methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectTests<SUT extends Object>
extends RepositoryTests<SUT> {

    /**
     * @see Object#equals(Object) public boolean java.lang.Object.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    @Category(Should.class)
    public default void equalsShouldBeReflexive() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertTrue(sut.equals(sut));
    }

    /**
     * @see Object#equals(Object) public boolean java.lang.Object.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    @Category(Should.class)
    public default void equalsShouldRefuseNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertFalse(sut.equals(null));
    }

    /**
     * @see Object#getClass() public final native java.lang.Class java.lang.Object.getClass() (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void getClassMustMatchIsInstance() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<? extends Object> clazz = sut.getClass();
        assert clazz != null;
        assertTrue(clazz.isInstance(sut));
    }

    /**
     * @see Object#getClass() public final native java.lang.Class java.lang.Object.getClass() (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void getClassMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.getClass());
    }

    /**
     * <p>
     * According to the general contract of {@link Object#toString()}, it
     * <q>returns a string that "textually represents"</q> the object.
     *
     * Thus, there is absolutely no reason why {@code null} could be returned. Especially because even a {@code null}
     * can be easily represented textually by {@link java.util.Objects#toString(Object)}.
     * </p>
     *
     * <p>
     * And obviously, no however reached (problematic) inner state of an object is allowed to cause an exception while
     * computing the textual representation. It instead should be represented accordingly.
     * </p>
     *
     * @see Object#toString() public java.lang.String java.lang.Object.toString() (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.2
     */
    @Test
    public default void toStringMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.toString());
    }

    /**
     * <p>
     * Test method for {@link Object#toString() public java.lang.String java.lang.Object.toString()}.
     *
     * <p>
     * Test method for {@link Object#toString() public java.lang.String java.lang.Object.toString()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#toString() public java.lang.String java.lang.Object.toString() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_toString()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#notify() public final native void java.lang.Object.notify()}.
     *
     * <p>
     * Test method for {@link Object#notify() public final native void java.lang.Object.notify()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#notify() public final native void java.lang.Object.notify() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_notify()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#wait() public final void java.lang.Object.wait() throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link Object#wait() public final void java.lang.Object.wait() throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#wait() public final void java.lang.Object.wait() throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wait()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#wait(long, int) public final void java.lang.Object.wait(long,int) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link Object#wait(long, int) public final void java.lang.Object.wait(long,int) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#wait(long, int) public final void java.lang.Object.wait(long,int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wait_long_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#wait(long) public final native void java.lang.Object.wait(long) throws
     * java.lang.InterruptedException}.
     *
     * <p>
     * Test method for {@link Object#wait(long) public final native void java.lang.Object.wait(long) throws
     * java.lang.InterruptedException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#wait(long) public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_wait_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#getClass() public final native java.lang.Class<?> java.lang.Object.getClass()}.
     *
     * <p>
     * Test method for {@link Object#getClass() public final native java.lang.Class java.lang.Object.getClass()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#getClass() public final native java.lang.Class java.lang.Object.getClass() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getClass()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#hashCode() public native int java.lang.Object.hashCode()}.
     *
     * <p>
     * Test method for {@link Object#hashCode() public native int java.lang.Object.hashCode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#hashCode() public native int java.lang.Object.hashCode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_hashCode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#equals(Object) public boolean java.lang.Object.equals(java.lang.Object)}.
     *
     * <p>
     * Test method for {@link Object#equals(Object) public boolean java.lang.Object.equals(java.lang.Object)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#equals(Object) public boolean java.lang.Object.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_equals_Object()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link Object#notifyAll() public final native void java.lang.Object.notifyAll()}.
     *
     * <p>
     * Test method for {@link Object#notifyAll() public final native void java.lang.Object.notifyAll()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see Object#notifyAll() public final native void java.lang.Object.notifyAll() (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_notifyAll()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

}

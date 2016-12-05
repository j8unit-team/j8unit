package org.j8unit.repository.java.lang;

import static java.lang.Thread.holdsLock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.categories.Should;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Object public
 * class java.lang.Object}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.lang.ObjectClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ObjectTests<SUT extends Object>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.lang.Object]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.lang.Object]

    /**
     * @see Object#equals(Object) public boolean java.lang.Object.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.3
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
     * @since 0.9.7
     */
    @Test
    @Category(Should.class)
    public default void equalsShouldBeSymmetric() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Object other = new Object();
        assertFalse(other.equals(sut));
        assertFalse(sut.equals(other));
    }

    /**
     * @see Object#equals(Object) public boolean java.lang.Object.equals(java.lang.Object) (the hereby targeted
     *      method-under-test)
     *
     * @since 0.9.3
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
     * @since 0.9.3
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
     * @since 0.9.3
     */
    @Test
    public default void getClassMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.getClass());
    }

    /**
     * @see Object#hashCode() public native int java.lang.Object.hashCode() (the hereby targeted method-under-test)
     *
     * @since 0.9.3
     */
    @Test
    public default void hashCodeMustBeConsistent() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final int hashCode = sut.hashCode();
        final int hashCode2 = sut.hashCode();
        assertEquals(hashCode, hashCode2);
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
     * @since 0.9.3
     */
    @Test
    public default void toStringMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.toString());
    }

    /**
     * @see Object#wait(long, int) public final void java.lang.Object.wait(long, int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test(expected = IllegalMonitorStateException.class)
    public default void waitMillisAndNanosWithoutMonitorMustFail()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assert !holdsLock(sut);
        sut.wait(1, 0);
    }

    /**
     * @see Object#wait(long) public final void java.lang.Object.wait(long) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test(expected = IllegalMonitorStateException.class)
    public default void waitMillisWithoutMonitorMustFail()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assert !holdsLock(sut);
        sut.wait(1);
    }

    /**
     * @see Object#wait(long) public final void java.lang.Object.wait(long) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test
    public default void waitOneMillisecond()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        synchronized (sut) {
            assert holdsLock(sut);
            try {
                sut.wait(1);
            } catch (final InterruptedException interrupted) {
                // most likely, wont happen; just ignore interruption silently
            }
        }
    }

    /**
     * @see Object#wait(long, int) public final void java.lang.Object.wait(long, int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test
    public default void waitOneMillisecondAndOneNanosecond()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        synchronized (sut) {
            assert holdsLock(sut);
            try {
                sut.wait(1, 1);
            } catch (final InterruptedException interrupted) {
                // most likely, wont happen; just ignore interruption silently
            }
        }
    }

    /**
     * @see Object#wait(long, int) public final void java.lang.Object.wait(long, int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test(expected = IllegalArgumentException.class)
    public default void waitWithNegativeMillisAndNanosMustAbort()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        synchronized (sut) {
            assert holdsLock(sut);
            sut.wait(-1, 0);
        }
    }

    /**
     * @see Object#wait(long, int) public final void java.lang.Object.wait(long, int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test(expected = IllegalArgumentException.class)
    public default void waitWithNegativeMillisAndNegativeNanosMustAbort()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        synchronized (sut) {
            assert holdsLock(sut);
            sut.wait(-1, -1);
        }
    }

    /**
     * @see Object#wait(long) public final void java.lang.Object.wait(long) throws java.lang.InterruptedException (the
     *      hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test(expected = IllegalArgumentException.class)
    public default void waitWithNegativeMillisMustAbort()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        synchronized (sut) {
            assert holdsLock(sut);
            sut.wait(-1);
        }
    }

    /**
     * @see Object#wait(long, int) public final void java.lang.Object.wait(long, int) throws
     *      java.lang.InterruptedException (the hereby targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test(expected = IllegalArgumentException.class)
    public default void waitWithNegativeNanosMustAbort()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        synchronized (sut) {
            assert holdsLock(sut);
            sut.wait(1, -1);
        }
    }

    /**
     * @see Object#wait() public final void java.lang.Object.wait() throws java.lang.InterruptedException (the hereby
     *      targeted method-under-test)
     *
     * @since 1.0.1
     */
    @Test(expected = IllegalMonitorStateException.class)
    public default void waitWithoutMonitorMustFail()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assert !holdsLock(sut);
        sut.wait();
    }

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.lang.Object]

}

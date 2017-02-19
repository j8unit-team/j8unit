package some.reusable.j8unit.test.repository.java.lang;

import static java.lang.Thread.holdsLock;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.j8unit.J8UnitTest;
import org.junit.Test;

public abstract interface ObjectTests<SUT extends Object>
extends J8UnitTest<SUT> {

    @Test
    public default void equalsShouldBeReflexive() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertTrue(sut.equals(sut));
    }

    @Test
    public default void equalsShouldBeSymmetric() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Object other = new Object();
        assertFalse(other.equals(sut));
        assertFalse(sut.equals(other));
    }

    @Test
    public default void equalsShouldRefuseNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertFalse(sut.equals(null));
    }

    @Test
    public default void getClassMustMatchIsInstance() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final Class<? extends Object> clazz = sut.getClass();
        assert clazz != null;
        assertTrue(clazz.isInstance(sut));
    }

    @Test
    public default void getClassMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.getClass());
    }

    @Test
    public default void hashCodeMustBeConsistent() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        final int hashCode = sut.hashCode();
        final int hashCode2 = sut.hashCode();
        assertEquals(hashCode, hashCode2);
    }

    @Test
    public default void toStringMustReturnNotNull() {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assertNotNull(sut.toString());
    }

    @Test(expected = IllegalMonitorStateException.class)
    public default void waitMillisAndNanosWithoutMonitorMustFail()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assert !holdsLock(sut);
        sut.wait(1, 0);
    }

    @Test(expected = IllegalMonitorStateException.class)
    public default void waitMillisWithoutMonitorMustFail()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assert !holdsLock(sut);
        sut.wait(1);
    }

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

    @Test(expected = IllegalMonitorStateException.class)
    public default void waitWithoutMonitorMustFail()
    throws Exception {
        final SUT sut = this.createNewSUT();
        assert sut != null;
        assert !holdsLock(sut);
        sut.wait();
    }

}

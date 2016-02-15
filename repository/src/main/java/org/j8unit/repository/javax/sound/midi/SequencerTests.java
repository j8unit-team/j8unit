package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.Draft;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.Sequencer interface javax.sound.midi.Sequencer}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link SequencerClassTests}.
 * </p>
 *
 * @see javax.sound.midi.Sequencer interface javax.sound.midi.Sequencer (the hereby targeted class-under-test class)
 * @see SequencerClassTests SequencerClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SequencerTests<SUT extends javax.sound.midi.Sequencer>
extends MidiDeviceTests<SUT> {

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setLoopEndPoint(long) public abstract void
     * javax.sound.midi.Sequencer.setLoopEndPoint(long)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setLoopEndPoint(long) public abstract void
     * javax.sound.midi.Sequencer.setLoopEndPoint(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setLoopEndPoint(long) public abstract void
     *      javax.sound.midi.Sequencer.setLoopEndPoint(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLoopEndPoint_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#addMetaEventListener(javax.sound.midi.MetaEventListener) public
     * abstract boolean javax.sound.midi.Sequencer.addMetaEventListener(javax.sound.midi.MetaEventListener)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#addMetaEventListener(javax.sound.midi.MetaEventListener) public
     * abstract boolean javax.sound.midi.Sequencer.addMetaEventListener(javax.sound.midi.MetaEventListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#addMetaEventListener(javax.sound.midi.MetaEventListener) public abstract boolean
     *      javax.sound.midi.Sequencer.addMetaEventListener(javax.sound.midi.MetaEventListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addMetaEventListener_MetaEventListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.midi.Sequencer#addControllerEventListener(javax.sound.midi.ControllerEventListener, int[])
     * public abstract int[]
     * javax.sound.midi.Sequencer.addControllerEventListener(javax.sound.midi.ControllerEventListener,int[])}.
     *
     * <p>
     * Test method for
     * {@link javax.sound.midi.Sequencer#addControllerEventListener(javax.sound.midi.ControllerEventListener, int[])
     * public abstract int[]
     * javax.sound.midi.Sequencer.addControllerEventListener(javax.sound.midi.ControllerEventListener,int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#addControllerEventListener(javax.sound.midi.ControllerEventListener, int[])
     *      public abstract int[]
     *      javax.sound.midi.Sequencer.addControllerEventListener(javax.sound.midi.ControllerEventListener,int[]) (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_addControllerEventListener_ControllerEventListener_intArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setMasterSyncMode(javax.sound.midi.Sequencer.SyncMode) public
     * abstract void javax.sound.midi.Sequencer.setMasterSyncMode(javax.sound.midi.Sequencer$SyncMode)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setMasterSyncMode(javax.sound.midi.Sequencer.SyncMode) public
     * abstract void javax.sound.midi.Sequencer.setMasterSyncMode(javax.sound.midi.Sequencer$SyncMode)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setMasterSyncMode(javax.sound.midi.Sequencer.SyncMode) public abstract void
     *      javax.sound.midi.Sequencer.setMasterSyncMode(javax.sound.midi.Sequencer$SyncMode) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMasterSyncMode_SyncMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTempoInBPM(float) public abstract void
     * javax.sound.midi.Sequencer.setTempoInBPM(float)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTempoInBPM(float) public abstract void
     * javax.sound.midi.Sequencer.setTempoInBPM(float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setTempoInBPM(float) public abstract void
     *      javax.sound.midi.Sequencer.setTempoInBPM(float) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTempoInBPM_float()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTempoFactor(float) public abstract void
     * javax.sound.midi.Sequencer.setTempoFactor(float)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTempoFactor(float) public abstract void
     * javax.sound.midi.Sequencer.setTempoFactor(float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setTempoFactor(float) public abstract void
     *      javax.sound.midi.Sequencer.setTempoFactor(float) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTempoFactor_float()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMicrosecondLength() public abstract long
     * javax.sound.midi.Sequencer.getMicrosecondLength()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMicrosecondLength() public abstract long
     * javax.sound.midi.Sequencer.getMicrosecondLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getMicrosecondLength() public abstract long
     *      javax.sound.midi.Sequencer.getMicrosecondLength() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMicrosecondLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setSequence(java.io.InputStream) public abstract void
     * javax.sound.midi.Sequencer.setSequence(java.io.InputStream) throws
     * java.io.IOException,javax.sound.midi.InvalidMidiDataException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setSequence(java.io.InputStream) public abstract void
     * javax.sound.midi.Sequencer.setSequence(java.io.InputStream) throws
     * java.io.IOException,javax.sound.midi.InvalidMidiDataException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setSequence(java.io.InputStream) public abstract void
     *      javax.sound.midi.Sequencer.setSequence(java.io.InputStream) throws
     *      java.io.IOException,javax.sound.midi.InvalidMidiDataException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSequence_InputStream()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setSequence(javax.sound.midi.Sequence) public abstract void
     * javax.sound.midi.Sequencer.setSequence(javax.sound.midi.Sequence) throws
     * javax.sound.midi.InvalidMidiDataException}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setSequence(javax.sound.midi.Sequence) public abstract void
     * javax.sound.midi.Sequencer.setSequence(javax.sound.midi.Sequence) throws
     * javax.sound.midi.InvalidMidiDataException}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setSequence(javax.sound.midi.Sequence) public abstract void
     *      javax.sound.midi.Sequencer.setSequence(javax.sound.midi.Sequence) throws
     *      javax.sound.midi.InvalidMidiDataException (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSequence_Sequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTickLength() public abstract long
     * javax.sound.midi.Sequencer.getTickLength()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTickLength() public abstract long
     * javax.sound.midi.Sequencer.getTickLength()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getTickLength() public abstract long javax.sound.midi.Sequencer.getTickLength()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTickLength()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getLoopStartPoint() public abstract long
     * javax.sound.midi.Sequencer.getLoopStartPoint()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getLoopStartPoint() public abstract long
     * javax.sound.midi.Sequencer.getLoopStartPoint()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getLoopStartPoint() public abstract long
     *      javax.sound.midi.Sequencer.getLoopStartPoint() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoopStartPoint()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTrackSolo(int, boolean) public abstract void
     * javax.sound.midi.Sequencer.setTrackSolo(int,boolean)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTrackSolo(int, boolean) public abstract void
     * javax.sound.midi.Sequencer.setTrackSolo(int,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setTrackSolo(int, boolean) public abstract void
     *      javax.sound.midi.Sequencer.setTrackSolo(int,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTrackSolo_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMicrosecondPosition() public abstract long
     * javax.sound.midi.Sequencer.getMicrosecondPosition()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMicrosecondPosition() public abstract long
     * javax.sound.midi.Sequencer.getMicrosecondPosition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getMicrosecondPosition() public abstract long
     *      javax.sound.midi.Sequencer.getMicrosecondPosition() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Override
    @Test
    @Category(Draft.class)
    public default void test_getMicrosecondPosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#isRunning() public abstract boolean
     * javax.sound.midi.Sequencer.isRunning()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#isRunning() public abstract boolean
     * javax.sound.midi.Sequencer.isRunning()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#isRunning() public abstract boolean javax.sound.midi.Sequencer.isRunning() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRunning()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getSlaveSyncModes() public abstract
     * javax.sound.midi.Sequencer$SyncMode[] javax.sound.midi.Sequencer.getSlaveSyncModes()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getSlaveSyncModes() public abstract
     * javax.sound.midi.Sequencer$SyncMode[] javax.sound.midi.Sequencer.getSlaveSyncModes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getSlaveSyncModes() public abstract javax.sound.midi.Sequencer$SyncMode[]
     *      javax.sound.midi.Sequencer.getSlaveSyncModes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSlaveSyncModes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTempoInMPQ(float) public abstract void
     * javax.sound.midi.Sequencer.setTempoInMPQ(float)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTempoInMPQ(float) public abstract void
     * javax.sound.midi.Sequencer.setTempoInMPQ(float)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setTempoInMPQ(float) public abstract void
     *      javax.sound.midi.Sequencer.setTempoInMPQ(float) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTempoInMPQ_float()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTempoInBPM() public abstract float
     * javax.sound.midi.Sequencer.getTempoInBPM()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTempoInBPM() public abstract float
     * javax.sound.midi.Sequencer.getTempoInBPM()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getTempoInBPM() public abstract float javax.sound.midi.Sequencer.getTempoInBPM()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTempoInBPM()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getLoopCount() public abstract int
     * javax.sound.midi.Sequencer.getLoopCount()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getLoopCount() public abstract int
     * javax.sound.midi.Sequencer.getLoopCount()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getLoopCount() public abstract int javax.sound.midi.Sequencer.getLoopCount() (the
     *      hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoopCount()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMasterSyncModes() public abstract
     * javax.sound.midi.Sequencer$SyncMode[] javax.sound.midi.Sequencer.getMasterSyncModes()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMasterSyncModes() public abstract
     * javax.sound.midi.Sequencer$SyncMode[] javax.sound.midi.Sequencer.getMasterSyncModes()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getMasterSyncModes() public abstract javax.sound.midi.Sequencer$SyncMode[]
     *      javax.sound.midi.Sequencer.getMasterSyncModes() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMasterSyncModes()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getSlaveSyncMode() public abstract
     * javax.sound.midi.Sequencer$SyncMode javax.sound.midi.Sequencer.getSlaveSyncMode()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getSlaveSyncMode() public abstract
     * javax.sound.midi.Sequencer$SyncMode javax.sound.midi.Sequencer.getSlaveSyncMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getSlaveSyncMode() public abstract javax.sound.midi.Sequencer$SyncMode
     *      javax.sound.midi.Sequencer.getSlaveSyncMode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSlaveSyncMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setLoopCount(int) public abstract void
     * javax.sound.midi.Sequencer.setLoopCount(int)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setLoopCount(int) public abstract void
     * javax.sound.midi.Sequencer.setLoopCount(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setLoopCount(int) public abstract void
     *      javax.sound.midi.Sequencer.setLoopCount(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLoopCount_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#isRecording() public abstract boolean
     * javax.sound.midi.Sequencer.isRecording()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#isRecording() public abstract boolean
     * javax.sound.midi.Sequencer.isRecording()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#isRecording() public abstract boolean javax.sound.midi.Sequencer.isRecording()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_isRecording()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTickPosition(long) public abstract void
     * javax.sound.midi.Sequencer.setTickPosition(long)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTickPosition(long) public abstract void
     * javax.sound.midi.Sequencer.setTickPosition(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setTickPosition(long) public abstract void
     *      javax.sound.midi.Sequencer.setTickPosition(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTickPosition_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#stopRecording() public abstract void
     * javax.sound.midi.Sequencer.stopRecording()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#stopRecording() public abstract void
     * javax.sound.midi.Sequencer.stopRecording()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#stopRecording() public abstract void javax.sound.midi.Sequencer.stopRecording()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stopRecording()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getLoopEndPoint() public abstract long
     * javax.sound.midi.Sequencer.getLoopEndPoint()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getLoopEndPoint() public abstract long
     * javax.sound.midi.Sequencer.getLoopEndPoint()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getLoopEndPoint() public abstract long
     *      javax.sound.midi.Sequencer.getLoopEndPoint() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getLoopEndPoint()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTrackMute(int) public abstract boolean
     * javax.sound.midi.Sequencer.getTrackMute(int)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTrackMute(int) public abstract boolean
     * javax.sound.midi.Sequencer.getTrackMute(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getTrackMute(int) public abstract boolean
     *      javax.sound.midi.Sequencer.getTrackMute(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrackMute_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTempoInMPQ() public abstract float
     * javax.sound.midi.Sequencer.getTempoInMPQ()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTempoInMPQ() public abstract float
     * javax.sound.midi.Sequencer.getTempoInMPQ()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getTempoInMPQ() public abstract float javax.sound.midi.Sequencer.getTempoInMPQ()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTempoInMPQ()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for
     * {@link javax.sound.midi.Sequencer#removeControllerEventListener(javax.sound.midi.ControllerEventListener, int[])
     * public abstract int[]
     * javax.sound.midi.Sequencer.removeControllerEventListener(javax.sound.midi.ControllerEventListener,int[])}.
     *
     * <p>
     * Test method for
     * {@link javax.sound.midi.Sequencer#removeControllerEventListener(javax.sound.midi.ControllerEventListener, int[])
     * public abstract int[]
     * javax.sound.midi.Sequencer.removeControllerEventListener(javax.sound.midi.ControllerEventListener,int[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#removeControllerEventListener(javax.sound.midi.ControllerEventListener, int[])
     *      public abstract int[]
     *      javax.sound.midi.Sequencer.removeControllerEventListener(javax.sound.midi.ControllerEventListener,int[])
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeControllerEventListener_ControllerEventListener_intArray()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#recordEnable(javax.sound.midi.Track, int) public abstract void
     * javax.sound.midi.Sequencer.recordEnable(javax.sound.midi.Track,int)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#recordEnable(javax.sound.midi.Track, int) public abstract void
     * javax.sound.midi.Sequencer.recordEnable(javax.sound.midi.Track,int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#recordEnable(javax.sound.midi.Track, int) public abstract void
     *      javax.sound.midi.Sequencer.recordEnable(javax.sound.midi.Track,int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_recordEnable_Track_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setLoopStartPoint(long) public abstract void
     * javax.sound.midi.Sequencer.setLoopStartPoint(long)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setLoopStartPoint(long) public abstract void
     * javax.sound.midi.Sequencer.setLoopStartPoint(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setLoopStartPoint(long) public abstract void
     *      javax.sound.midi.Sequencer.setLoopStartPoint(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setLoopStartPoint_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#recordDisable(javax.sound.midi.Track) public abstract void
     * javax.sound.midi.Sequencer.recordDisable(javax.sound.midi.Track)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#recordDisable(javax.sound.midi.Track) public abstract void
     * javax.sound.midi.Sequencer.recordDisable(javax.sound.midi.Track)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#recordDisable(javax.sound.midi.Track) public abstract void
     *      javax.sound.midi.Sequencer.recordDisable(javax.sound.midi.Track) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_recordDisable_Track()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#removeMetaEventListener(javax.sound.midi.MetaEventListener)
     * public abstract void javax.sound.midi.Sequencer.removeMetaEventListener(javax.sound.midi.MetaEventListener)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#removeMetaEventListener(javax.sound.midi.MetaEventListener)
     * public abstract void javax.sound.midi.Sequencer.removeMetaEventListener(javax.sound.midi.MetaEventListener)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#removeMetaEventListener(javax.sound.midi.MetaEventListener) public abstract void
     *      javax.sound.midi.Sequencer.removeMetaEventListener(javax.sound.midi.MetaEventListener) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_removeMetaEventListener_MetaEventListener()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#start() public abstract void
     * javax.sound.midi.Sequencer.start()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#start() public abstract void
     * javax.sound.midi.Sequencer.start()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#start() public abstract void javax.sound.midi.Sequencer.start() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_start()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#stop() public abstract void javax.sound.midi.Sequencer.stop()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#stop() public abstract void javax.sound.midi.Sequencer.stop()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#stop() public abstract void javax.sound.midi.Sequencer.stop() (the hereby
     *      targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_stop()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setSlaveSyncMode(javax.sound.midi.Sequencer.SyncMode) public
     * abstract void javax.sound.midi.Sequencer.setSlaveSyncMode(javax.sound.midi.Sequencer$SyncMode)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setSlaveSyncMode(javax.sound.midi.Sequencer.SyncMode) public
     * abstract void javax.sound.midi.Sequencer.setSlaveSyncMode(javax.sound.midi.Sequencer$SyncMode)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setSlaveSyncMode(javax.sound.midi.Sequencer.SyncMode) public abstract void
     *      javax.sound.midi.Sequencer.setSlaveSyncMode(javax.sound.midi.Sequencer$SyncMode) (the hereby targeted
     *      method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setSlaveSyncMode_SyncMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#startRecording() public abstract void
     * javax.sound.midi.Sequencer.startRecording()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#startRecording() public abstract void
     * javax.sound.midi.Sequencer.startRecording()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#startRecording() public abstract void javax.sound.midi.Sequencer.startRecording()
     *      (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_startRecording()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTempoFactor() public abstract float
     * javax.sound.midi.Sequencer.getTempoFactor()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTempoFactor() public abstract float
     * javax.sound.midi.Sequencer.getTempoFactor()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getTempoFactor() public abstract float
     *      javax.sound.midi.Sequencer.getTempoFactor() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTempoFactor()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTickPosition() public abstract long
     * javax.sound.midi.Sequencer.getTickPosition()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTickPosition() public abstract long
     * javax.sound.midi.Sequencer.getTickPosition()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getTickPosition() public abstract long
     *      javax.sound.midi.Sequencer.getTickPosition() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTickPosition()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getSequence() public abstract javax.sound.midi.Sequence
     * javax.sound.midi.Sequencer.getSequence()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getSequence() public abstract javax.sound.midi.Sequence
     * javax.sound.midi.Sequencer.getSequence()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getSequence() public abstract javax.sound.midi.Sequence
     *      javax.sound.midi.Sequencer.getSequence() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getSequence()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTrackMute(int, boolean) public abstract void
     * javax.sound.midi.Sequencer.setTrackMute(int,boolean)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setTrackMute(int, boolean) public abstract void
     * javax.sound.midi.Sequencer.setTrackMute(int,boolean)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setTrackMute(int, boolean) public abstract void
     *      javax.sound.midi.Sequencer.setTrackMute(int,boolean) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setTrackMute_int_boolean()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTrackSolo(int) public abstract boolean
     * javax.sound.midi.Sequencer.getTrackSolo(int)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getTrackSolo(int) public abstract boolean
     * javax.sound.midi.Sequencer.getTrackSolo(int)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getTrackSolo(int) public abstract boolean
     *      javax.sound.midi.Sequencer.getTrackSolo(int) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getTrackSolo_int()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMasterSyncMode() public abstract
     * javax.sound.midi.Sequencer$SyncMode javax.sound.midi.Sequencer.getMasterSyncMode()}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#getMasterSyncMode() public abstract
     * javax.sound.midi.Sequencer$SyncMode javax.sound.midi.Sequencer.getMasterSyncMode()}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#getMasterSyncMode() public abstract javax.sound.midi.Sequencer$SyncMode
     *      javax.sound.midi.Sequencer.getMasterSyncMode() (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_getMasterSyncMode()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setMicrosecondPosition(long) public abstract void
     * javax.sound.midi.Sequencer.setMicrosecondPosition(long)}.
     *
     * <p>
     * Test method for {@link javax.sound.midi.Sequencer#setMicrosecondPosition(long) public abstract void
     * javax.sound.midi.Sequencer.setMicrosecondPosition(long)}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @see javax.sound.midi.Sequencer#setMicrosecondPosition(long) public abstract void
     *      javax.sound.midi.Sequencer.setMicrosecondPosition(long) (the hereby targeted method-under-test)
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public default void test_setMicrosecondPosition_long()
    throws Exception {
        // query fresh subject-under-test
        final SUT sut = this.createNewSUT();
        assert sut != null;
    }

    /**
     * <p>
     * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
     * non-{@code static} methods) of {@linkplain javax.sound.midi.Sequencer.SyncMode class
     * javax.sound.midi.Sequencer$SyncMode}. The complementary j8unit test interface containing the class relevant
     * aspects is {@link SequencerClassTests.SyncModeClassTests}.
     * </p>
     *
     * @see javax.sound.midi.Sequencer.SyncMode class javax.sound.midi.Sequencer$SyncMode (the hereby targeted
     *      class-under-test class)
     * @see SequencerClassTests.SyncModeClassTests SequencerClassTests.SyncModeClassTests (the complementary j8unit test
     *      interface containing the class relevant test methods)
     *
     * @param SUT
     *            the type of the subject-under-test
     * @since 0.9.0
     */
    @FunctionalInterface
    @Category(J8UnitRepository.class)
    public static abstract interface SyncModeTests<SUT extends javax.sound.midi.Sequencer.SyncMode>
    extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

        /**
         * <p>
         * Test method for {@link javax.sound.midi.Sequencer.SyncMode#hashCode() public final int
         * javax.sound.midi.Sequencer$SyncMode.hashCode()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.Sequencer.SyncMode#hashCode() public final int
         * javax.sound.midi.Sequencer$SyncMode.hashCode()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.Sequencer.SyncMode#hashCode() public final int
         *      javax.sound.midi.Sequencer$SyncMode.hashCode() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link javax.sound.midi.Sequencer.SyncMode#equals(Object) public final boolean
         * javax.sound.midi.Sequencer$SyncMode.equals(java.lang.Object)}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.Sequencer.SyncMode#equals(Object) public final boolean
         * javax.sound.midi.Sequencer$SyncMode.equals(java.lang.Object)}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.Sequencer.SyncMode#equals(Object) public final boolean
         *      javax.sound.midi.Sequencer$SyncMode.equals(java.lang.Object) (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
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
         * Test method for {@link javax.sound.midi.Sequencer.SyncMode#toString() public final java.lang.String
         * javax.sound.midi.Sequencer$SyncMode.toString()}.
         *
         * <p>
         * Test method for {@link javax.sound.midi.Sequencer.SyncMode#toString() public final java.lang.String
         * javax.sound.midi.Sequencer$SyncMode.toString()}.
         *
         * Up to now, there is no real implementation of this test method. But with your help at
         * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful
         * test methods soon.
         * </p>
         *
         * @see javax.sound.midi.Sequencer.SyncMode#toString() public final java.lang.String
         *      javax.sound.midi.Sequencer$SyncMode.toString() (the hereby targeted method-under-test)
         */
        @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
        @Override
        @Test
        @Category(Draft.class)
        public default void test_toString()
        throws Exception {
            // query fresh subject-under-test
            final SUT sut = this.createNewSUT();
            assert sut != null;
        }

    }

}

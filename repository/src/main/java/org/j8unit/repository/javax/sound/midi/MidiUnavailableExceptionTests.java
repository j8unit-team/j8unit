package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.MidiUnavailableException class
 * javax.sound.midi.MidiUnavailableException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link MidiUnavailableExceptionClassTests}.
 * </p>
 *
 * @see javax.sound.midi.MidiUnavailableException class javax.sound.midi.MidiUnavailableException (the hereby targeted
 *      class-under-test class)
 * @see MidiUnavailableExceptionClassTests MidiUnavailableExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiUnavailableExceptionTests<SUT extends javax.sound.midi.MidiUnavailableException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}

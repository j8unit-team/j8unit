package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.InvalidMidiDataException class
 * javax.sound.midi.InvalidMidiDataException}. The complementary j8unit test interface containing the class relevant
 * aspects is {@link InvalidMidiDataExceptionClassTests}.
 * </p>
 *
 * @see javax.sound.midi.InvalidMidiDataException class javax.sound.midi.InvalidMidiDataException (the hereby targeted
 *      class-under-test class)
 * @see InvalidMidiDataExceptionClassTests InvalidMidiDataExceptionClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidMidiDataExceptionTests<SUT extends javax.sound.midi.InvalidMidiDataException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}

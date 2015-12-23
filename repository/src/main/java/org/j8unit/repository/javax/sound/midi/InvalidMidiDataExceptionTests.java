package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.midi.InvalidMidiDataException class
 * javax.sound.midi.InvalidMidiDataException}, containing all instance relevant test methods (i.&thinsp;e., test methods
 * of non-{@code static} methods). The counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.midi.InvalidMidiDataExceptionTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.midi.InvalidMidiDataExceptionClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.midi.InvalidMidiDataException
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface InvalidMidiDataExceptionTests<SUT extends javax.sound.midi.InvalidMidiDataException>
extends org.j8unit.repository.java.lang.ExceptionTests<SUT> {

}

package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.sound.midi.MidiSystem class javax.sound.midi.MidiSystem},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.sound.midi.MidiSystemTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.sound.midi.MidiSystemClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.sound.midi.MidiSystem
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiSystemTests<SUT extends javax.sound.midi.MidiSystem>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}

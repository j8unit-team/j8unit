package org.j8unit.repository.javax.sound.midi;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.sound.midi.MidiSystem class javax.sound.midi.MidiSystem}. The
 * complementary j8unit test interface containing the class relevant aspects is {@link MidiSystemClassTests}.
 * </p>
 *
 * @see javax.sound.midi.MidiSystem class javax.sound.midi.MidiSystem (the hereby targeted class-under-test class)
 * @see MidiSystemClassTests MidiSystemClassTests (the complementary j8unit test interface containing the class relevant
 *      test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiSystemTests<SUT extends javax.sound.midi.MidiSystem>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}

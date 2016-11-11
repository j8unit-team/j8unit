package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.MidiSystem;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ObjectTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link MidiSystem
 * public class javax.sound.midi.MidiSystem}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.sound.midi.MidiSystemClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface MidiSystemTests<SUT extends MidiSystem>
extends ObjectTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.MidiSystem]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.sound.midi.MidiSystem]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.sound.midi.MidiSystem]

}

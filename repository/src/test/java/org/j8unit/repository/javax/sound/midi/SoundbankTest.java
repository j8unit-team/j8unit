package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.Soundbank;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoundbankTest
implements org.j8unit.repository.javax.sound.midi.SoundbankTests<Soundbank> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Soundbank]

    @Override
    public Soundbank createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.Soundbank], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.Soundbank]

}

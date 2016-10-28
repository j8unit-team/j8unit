package org.j8unit.repository.javax.sound.midi;

import javax.sound.midi.SoundbankResource;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoundbankResourceTest
implements org.j8unit.repository.javax.sound.midi.SoundbankResourceTests<SoundbankResource> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.SoundbankResource]

    @Override
    public SoundbankResource createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.sound.midi.SoundbankResource], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.sound.midi.SoundbankResource]

}

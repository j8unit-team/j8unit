package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PatchClassTest
implements org.j8unit.repository.javax.sound.midi.PatchClassTests<javax.sound.midi.Patch> {

    @Override
    public Class<javax.sound.midi.Patch> createNewSUT() {
        return javax.sound.midi.Patch.class;
    }

}

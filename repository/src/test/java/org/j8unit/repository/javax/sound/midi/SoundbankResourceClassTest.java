package org.j8unit.repository.javax.sound.midi;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class SoundbankResourceClassTest
implements org.j8unit.repository.javax.sound.midi.SoundbankResourceClassTests<javax.sound.midi.SoundbankResource> {

    @Override
    public Class<javax.sound.midi.SoundbankResource> createNewSUT() {
        return javax.sound.midi.SoundbankResource.class;
    }

}

package org.j8unit.repository.javax.sound.sampled;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class AudioPermissionClassTest
implements org.j8unit.repository.javax.sound.sampled.AudioPermissionClassTests<javax.sound.sampled.AudioPermission> {

    @Override
    public Class<javax.sound.sampled.AudioPermission> createNewSUT() {
        return javax.sound.sampled.AudioPermission.class;
    }

}

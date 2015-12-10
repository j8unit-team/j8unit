package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PhaserClassTest
implements org.j8unit.repository.java.util.concurrent.PhaserClassTests<java.util.concurrent.Phaser> {

    @Override
    public Class<java.util.concurrent.Phaser> createNewSUT() {
        return java.util.concurrent.Phaser.class;
    }

}

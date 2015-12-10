package org.j8unit.repository.java.util.concurrent;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PhaserTest
implements org.j8unit.repository.java.util.concurrent.PhaserTests<java.util.concurrent.Phaser> {

    @Override
    public java.util.concurrent.Phaser createNewSUT() {
        return new java.util.concurrent.Phaser();
    }

}

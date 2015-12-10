package org.j8unit.repository.javax.imageio;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ImageIOClassTest
implements org.j8unit.repository.javax.imageio.ImageIOClassTests<javax.imageio.ImageIO> {

    @Override
    public Class<javax.imageio.ImageIO> createNewSUT() {
        return javax.imageio.ImageIO.class;
    }

}

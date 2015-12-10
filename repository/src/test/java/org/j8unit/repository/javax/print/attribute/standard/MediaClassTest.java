package org.j8unit.repository.javax.print.attribute.standard;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MediaClassTest
implements org.j8unit.repository.javax.print.attribute.standard.MediaClassTests<javax.print.attribute.standard.Media> {

    @Override
    public Class<javax.print.attribute.standard.Media> createNewSUT() {
        return javax.print.attribute.standard.Media.class;
    }

}

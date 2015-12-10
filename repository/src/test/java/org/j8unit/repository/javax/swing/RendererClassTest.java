package org.j8unit.repository.javax.swing;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class RendererClassTest
implements org.j8unit.repository.javax.swing.RendererClassTests<javax.swing.Renderer> {

    @Override
    public Class<javax.swing.Renderer> createNewSUT() {
        return javax.swing.Renderer.class;
    }

}

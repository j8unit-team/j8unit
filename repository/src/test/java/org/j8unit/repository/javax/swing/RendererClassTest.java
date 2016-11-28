package org.j8unit.repository.javax.swing;

import javax.swing.Renderer;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Renderer} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.javax.swing.RendererClassTests}).
 */
@RunWith(J8Unit4.class)
public class RendererClassTest
implements RendererClassTests<Renderer> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.swing.Renderer]

    @Override
    public Class<Renderer> createNewSUT() {
        return Renderer.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.swing.Renderer]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.swing.Renderer]

}

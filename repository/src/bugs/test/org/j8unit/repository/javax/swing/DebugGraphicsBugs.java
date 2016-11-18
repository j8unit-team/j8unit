package org.j8unit.repository.javax.swing;

import javax.swing.DebugGraphics;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class DebugGraphicsBugs {

    @Test(expected = NullPointerException.class /* because there is a bug! */)
    public void toStringThrowsAnException() {
        final DebugGraphics instance = new DebugGraphics();
        instance.toString();
    }

    @Test(expected = NullPointerException.class /* because there is a bug! */)
    public void toStringThrowsAnException2() {
        final DebugGraphics instance = new DebugGraphics(null);
        instance.toString();
    }

}

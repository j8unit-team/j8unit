package org.j8unit.repository.javax.swing;

import javax.swing.DebugGraphics;
import org.junit.Test;

/**
 * @since 0.9.4
 */
public class DebugGraphicsBugs {

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException() {
        final DebugGraphicsTests<DebugGraphics> dg = DebugGraphics::new;
        dg.toStringMustReturnNotNull();
    }

    @Test(expected = NullPointerException.class)
    public void toStringThrowsAnException2() {
        final DebugGraphicsTests<DebugGraphics> dg = () -> new DebugGraphics(null);
        dg.toStringMustReturnNotNull();
    }

}

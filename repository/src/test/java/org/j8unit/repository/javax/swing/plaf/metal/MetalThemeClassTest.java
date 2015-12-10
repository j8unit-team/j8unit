package org.j8unit.repository.javax.swing.plaf.metal;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MetalThemeClassTest
implements org.j8unit.repository.javax.swing.plaf.metal.MetalThemeClassTests<javax.swing.plaf.metal.MetalTheme> {

    @Override
    public Class<javax.swing.plaf.metal.MetalTheme> createNewSUT() {
        return javax.swing.plaf.metal.MetalTheme.class;
    }

}

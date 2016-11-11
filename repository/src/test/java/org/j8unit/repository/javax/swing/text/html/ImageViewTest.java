package org.j8unit.repository.javax.swing.text.html;

import javax.swing.text.html.ImageView;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ImageView} (by simply reusing the
 * J8Unit test interface {@link org.j8unit.repository.javax.swing.text.html.ImageViewTests}).
 */

@RunWith(J8Unit4.class)
public class ImageViewTest
implements ImageViewTests<ImageView> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.text.html.ImageView]

    @Override
    public ImageView createNewSUT() {
        throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.text.html.ImageView], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.text.html.ImageView]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.text.html.ImageView]

}

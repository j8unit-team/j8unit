package org.j8unit.repository.java.awt.image;

import java.awt.image.Kernel;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class KernelClassTest
implements org.j8unit.repository.java.awt.image.KernelClassTests<Kernel> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.image.Kernel]

    @Override
    public Class<Kernel> createNewSUT() {
        return Kernel.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.awt.image.Kernel#Kernel(int, int, float[])
     * public java.awt.image.Kernel(int,int,float[])}.
     *
     * Up to now, there is no real implementation of this test method. But with your help at
     * <a href="http://www.j8unit.org">http://www.j8unit.org</a> this marker method will be replaced by meaningful test
     * methods soon.
     * </p>
     *
     * @since 0.9.0
     */
    @Ignore("With your help at http://www.j8unit.org this marker method will be replaced by meaningful test methods soon.")
    @Test
    @Category(Draft.class)
    public void create_Kernel_int_int_floatArray()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Kernel sut = null; // = new Kernel(int, int, float[]);
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.image.Kernel]

}

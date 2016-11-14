package org.j8unit.repository.java.util.concurrent;

import java.util.concurrent.Phaser;
import org.j8unit.repository.categories.Draft;
import org.j8unit.runners.J8Unit4;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link Phaser} (by simply reusing the J8Unit
 * test interface {@link org.j8unit.repository.java.util.concurrent.PhaserClassTests}).
 */

@RunWith(J8Unit4.class)
public class PhaserClassTest
implements PhaserClassTests<Phaser> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.util.concurrent.Phaser]

    @Override
    public Class<Phaser> createNewSUT() {
        return Phaser.class;
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.concurrent.Phaser#Phaser() public
     * java.util.concurrent.Phaser()}.
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
    public void create_Phaser()
    throws Exception {
        // create new instance
        final Phaser sut = new Phaser();
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.Phaser#Phaser(java.util.concurrent.Phaser, int) public
     * java.util.concurrent.Phaser(java.util.concurrent.Phaser,int)}.
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
    public void create_Phaser_Phaser_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Phaser sut = null; // = new Phaser(java.util.concurrent.Phaser, int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test {@link java.util.concurrent.Phaser#Phaser(int) public
     * java.util.concurrent.Phaser(int)}.
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
    public void create_Phaser_int()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Phaser sut = null; // = new Phaser(int);
    }

    /**
     * <p>
     * Test method for the hereby targeted constructor-under-test
     * {@link java.util.concurrent.Phaser#Phaser(java.util.concurrent.Phaser) public
     * java.util.concurrent.Phaser(java.util.concurrent.Phaser)}.
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
    public void create_Phaser_Phaser()
    throws Exception {
        // create new instance
        @SuppressWarnings("unused")
        final Phaser sut = null; // = new Phaser(java.util.concurrent.Phaser);
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.util.concurrent.Phaser]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.util.concurrent.Phaser]

}

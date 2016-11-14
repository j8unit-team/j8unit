package org.j8unit.repository.javax.swing.plaf.metal;

import static org.j8unit.util.TestParametersUtil.testParametersOf;
import java.util.concurrent.Callable;
import javax.swing.plaf.metal.MetalIconFactory;
import javax.swing.plaf.metal.MetalIconFactory.FileIcon16;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import javax.swing.plaf.metal.MetalIconFactory.PaletteCloseIcon;
import javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon;
import javax.swing.plaf.metal.MetalIconFactory.TreeFolderIcon;
import javax.swing.plaf.metal.MetalIconFactory.TreeLeafIcon;
import org.j8unit.FactoryBasedJ8UnitTest;
import org.j8unit.runners.J8Parameterized;
import org.j8unit.runners.J8Unit4;
import org.j8unit.runners.parameterized.J8BlockJUnit4ClassRunnerWithParametersFactory;
import org.j8unit.util.TestParametersUtil;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized.UseParametersRunnerFactory;

@RunWith(J8Parameterized.class)
@UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
public class MetalIconFactoryTest
implements FactoryBasedJ8UnitTest<MetalIconFactory>, MetalIconFactoryTests<MetalIconFactory> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory]

    @Parameters(name = "{index}: {0}")
    public static Iterable<Object[]> sutData() {
        return testParametersOf(MetalIconFactory::new);
    }

    @Parameter(0)
    public Callable<MetalIconFactory> sutFactory;

    @Override
    public Callable<MetalIconFactory> getSUTFactory() {
        return this.sutFactory;
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory]

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FolderIcon16Test
    implements FactoryBasedJ8UnitTest<FolderIcon16>, FolderIcon16Tests<FolderIcon16> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FolderIcon16]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(FolderIcon16::new);
        }

        @Parameter(0)
        public Callable<FolderIcon16> sutFactory;

        @Override
        public Callable<FolderIcon16> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FolderIcon16]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FolderIcon16]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TreeLeafIconTest
    implements FactoryBasedJ8UnitTest<TreeLeafIcon>, TreeLeafIconTests<TreeLeafIcon> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(TreeLeafIcon::new);
        }

        @Parameter(0)
        public Callable<TreeLeafIcon> sutFactory;

        @Override
        public Callable<TreeLeafIcon> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeLeafIcon]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class FileIcon16Test
    implements FactoryBasedJ8UnitTest<FileIcon16>, FileIcon16Tests<FileIcon16> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FileIcon16]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(FileIcon16::new);
        }

        @Parameter(0)
        public Callable<FileIcon16> sutFactory;

        @Override
        public Callable<FileIcon16> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FileIcon16]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$FileIcon16]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class TreeFolderIconTest
    implements FactoryBasedJ8UnitTest<TreeFolderIcon>, TreeFolderIconTests<TreeFolderIcon> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(TreeFolderIcon::new);
        }

        @Parameter(0)
        public Callable<TreeFolderIcon> sutFactory;

        @Override
        public Callable<TreeFolderIcon> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeFolderIcon]

    }

    @RunWith(J8Parameterized.class)
    @UseParametersRunnerFactory(J8BlockJUnit4ClassRunnerWithParametersFactory.class)
    public static class PaletteCloseIconTest
    implements FactoryBasedJ8UnitTest<PaletteCloseIcon>, PaletteCloseIconTests<PaletteCloseIcon> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon]

        @Parameters(name = "{index}: {0}")
        public static Iterable<Object[]> sutData() {
            return TestParametersUtil.testParametersOf(PaletteCloseIcon::new);
        }

        @Parameter(0)
        public Callable<PaletteCloseIcon> sutFactory;

        @Override
        public Callable<PaletteCloseIcon> getSUTFactory() {
            return this.sutFactory;
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$PaletteCloseIcon]

    }

    /**
     * Specific JUnit test class to proof the instance relevant aspects of type {@link TreeControlIcon} (by simply
     * reusing the J8Unit test interface
     * {@link org.j8unit.repository.javax.swing.plaf.metal.MetalIconFactoryTests.TreeControlIconTests}).
     */

    @RunWith(J8Unit4.class)
    public static class TreeControlIconTest
    implements TreeControlIconTests<TreeControlIcon> {

        // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon]

        @Override
        public TreeControlIcon createNewSUT() {
            throw new AssumptionViolatedException("Due to the absence of a default constructor of this non-abstract type-under-test [javax.swing.plaf.metal.MetalIconFactory.TreeControlIcon], j8unit does not support a generic way to provide instances.");
        }

        // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon]

        // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.swing.plaf.metal.MetalIconFactory$TreeControlIcon]

    }

}

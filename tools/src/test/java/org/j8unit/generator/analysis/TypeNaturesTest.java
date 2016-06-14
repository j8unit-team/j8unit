package org.j8unit.generator.analysis;

import static java.util.Arrays.asList;
import static java.util.Collections.singleton;
import static java.util.stream.Collectors.toList;
import static javax.tools.JavaFileObject.Kind.CLASS;
import static javax.tools.StandardLocation.PLATFORM_CLASS_PATH;
import static javax.tools.ToolProvider.getSystemJavaCompiler;
import static org.j8unit.generator.analysis.TypeNatures.GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.NON_GENERIC;
import static org.j8unit.generator.analysis.TypeNatures.RAW;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.tools.JavaFileManager;
import org.j8unit.generator.util.Optionals;
import org.j8unit.generator.util.TypeAnalysis;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TypeNaturesTest {

    private static final JavaFileManager MANAGER = getSystemJavaCompiler().getStandardFileManager(null, null, null);

    private static final List<Class<?>> RAW_GENERICS = asList( // extends Collection<NO-TYPE>
                                                               java.beans.beancontext.BeanContext.class,
                                                               // extends BeanContext
                                                               java.beans.beancontext.BeanContextServices.class,
                                                               // extends BeanContext
                                                               java.beans.beancontext.BeanContextSupport.class,
                                                               // extends BeanContextServices, BeanContextSupport
                                                               java.beans.beancontext.BeanContextServicesSupport.class,
                                                               // extends javax.swing.ListCellRenderer<NO-TYPE>
                                                               javax.swing.plaf.basic.BasicComboBoxRenderer.class,
                                                               // extends BasicComboBoxRenderer
                                                               javax.swing.plaf.basic.BasicComboBoxRenderer.UIResource.class,
                                                               // extends Iterator<NO-TYPE>
                                                               javax.xml.stream.XMLEventReader.class,
                                                               // extends XMLEventReader
                                                               javax.xml.stream.util.EventReaderDelegate.class);

    @BeforeClass
    public static final void checkManager() {
        assertNotNull(MANAGER);
    }

    @Parameters(name = "{0}")
    public static Iterable<Object[]> data()
    throws Exception {
        return Stream.of("java", "javax", "org") //
                     .flatMap(root -> {
                         try {
                             return StreamSupport.stream(MANAGER.list(PLATFORM_CLASS_PATH, root, singleton(CLASS), true).spliterator(), false) //
                                                 .map(file -> MANAGER.inferBinaryName(PLATFORM_CLASS_PATH, file)) //
                                                 .map(TypeAnalysis::tryLoadClass) //
                                                 .flatMap(Optionals::toStream);
                         } catch (final IOException e) {
                             return Stream.empty();
                         }
                     }) //
                     .map(clazz -> new Object[] { clazz }) //
                     .collect(toList());
    }

    @Parameter(0)
    public Class<?> clazz;

    @Test
    public void testAccordingTypeArgumentness()
    throws Exception {
        if (RAW_GENERICS.contains(this.clazz)) {
            assertEquals(RAW, TypeNatures.natureOf(this.clazz));
        } else if (this.clazz.getTypeParameters().length == 0) {
            assertEquals(NON_GENERIC, TypeNatures.natureOf(this.clazz));
        } else {
            assertEquals(GENERIC, TypeNatures.natureOf(this.clazz));
        }
    }

}

package org.j8unit.maven.plugin.api;

import static java.util.Collections.singleton;
import static java.util.Optional.ofNullable;
import static java.util.UUID.randomUUID;
import static java.util.function.UnaryOperator.identity;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static javax.tools.JavaFileObject.Kind.CLASS;
import static javax.tools.StandardLocation.locationFor;
import static javax.tools.ToolProvider.getSystemJavaCompiler;
import static org.j8unit.generator.util.Comparators.PACKAGE_COMPARATOR;
import static org.j8unit.generator.util.Functions.CheckedFunction.doIt;
import static org.j8unit.generator.util.Lists.convert;
import static org.j8unit.generator.util.Maps.entry;
import static org.j8unit.generator.util.Predicates.NOT_PRIVATE;
import static org.j8unit.maven.plugin.Messages.Keys.MISSING_COMPILER;
import static org.j8unit.maven.plugin.api.J8UnitMojoFailureException.onDemandMojoFailure;
import java.io.File;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.StreamSupport;
import javax.tools.JavaCompiler;
import javax.tools.JavaFileManager;
import javax.tools.JavaFileManager.Location;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import org.apache.maven.plugin.Mojo;
import org.apache.maven.plugin.MojoFailureException;
import org.j8unit.generator.util.PreparedJavaFileManager;

/**
 * Extension of the {@link Mojo} interface providing default class-path features.
 */
public abstract interface CompileClasspathMojo
extends Mojo {

    /**
     * Returns a message (pattern) for the given message key.
     *
     * @param key
     *            the message's identifier
     * @return the according message (pattern)
     */
    public abstract String message(final CharSequence key);

    /**
     * Returns the class-path folders containing all compiled source artifacts of the current project.
     *
     * @return the class-path folders containing all compiled source artifacts of the current project
     */
    public abstract List<String> getCompileClasspathElements();

    /**
     * Returns a file manager that is prepares the given {@code location} to map onto the
     * {@linkplain #getCompileClasspathElements() current project's class-path folders} and to map an
     * {@linkplain JavaFileManager#getClassLoader(Location) according class loader}.
     *
     * @param location
     *            the location to use for mapping
     * @return a prepared file manager folders
     * @throws MojoFailureException
     *             if no Java compiler is provided at Mojo runtime
     * @throws IOException
     *             if {@code location} {@linkplain Location#isOutputLocation()is an output location} and
     *             {@linkplain #getCompileClasspathElements() current project's class-path folders} do not represent
     *             existing directories
     */
    public default JavaFileManager getCompileClasspathJavaFileManager(final Location location)
    throws MojoFailureException, IOException {
        final JavaCompiler compiler = ofNullable(getSystemJavaCompiler()).orElseThrow(onDemandMojoFailure(this.message(MISSING_COMPILER)));
        final StandardJavaFileManager manager = compiler.getStandardFileManager(new MojoDiagnosticListener<>(this), null, null);
        final List<File> artifacts = convert(this.getCompileClasspathElements(), File::new);
        return new PreparedJavaFileManager(manager, location, artifacts);
    }

    /**
     * Returns a file manager that is prepares a new, unique {@link Location} to map onto the
     * {@linkplain #getCompileClasspathElements() current project's class-path folders} and to map an
     * {@linkplain JavaFileManager#getClassLoader(Location) according class loader}.
     *
     * @return a new, unique location and the according the prepared file manager
     * @throws MojoFailureException
     *             if no Java compiler is provided at Mojo runtime
     */
    public default Entry<Location, JavaFileManager> getCompileClasspathJavaFileManager()
    throws MojoFailureException {
        final Location location = locationFor(randomUUID().toString());
        try {
            final JavaFileManager manager = this.getCompileClasspathJavaFileManager(location);
            return entry(location, manager);
        } catch (final IOException impossible) {
            assert location.isOutputLocation() == false : "BUG: For an unknown reason, the current location " + location + " is an output location.";
            throw new UncheckedIOException(impossible);
        }
    }

    /**
     * Returns a map containing all compiled Java source artifacts (a.k.a. classes) of the current project. The classes
     * are grouped by its package.
     *
     * @return a map containing all compiled Java source artifacts (a.k.a. classes) of the current project
     * @throws MojoFailureException
     *             if no Java compiler is provided at Mojo runtime
     * @throws IOException
     *             if an I/O error occurs while accessing/loading class-path folders or the class files
     */
    public default Map<Package, List<Class<?>>> getCompileClasspathClasses()
    throws MojoFailureException, IOException {
        final Entry<Location, JavaFileManager> where = getCompileClasspathJavaFileManager();
        final Location location = where.getKey();
        final JavaFileManager manager = where.getValue();
        final Iterable<JavaFileObject> javaFiles = manager.list(location, "", singleton(CLASS), true);
        return StreamSupport.stream(javaFiles.spliterator(), false) //
                            .map(j -> manager.inferBinaryName(location, j)) //
                            .map(doIt(manager.getClassLoader(location)::loadClass)) //
                            .filter(NOT_PRIVATE) //
                            .collect(groupingBy(Class::getPackage, () -> new TreeMap<>(PACKAGE_COMPARATOR), mapping(identity(), toList())));
    }

}

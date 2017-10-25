package org.j8unit.generator.util;

import static java.lang.Thread.currentThread;
import static java.util.Objects.requireNonNull;
import static org.j8unit.generator.util.Functions.CheckedFunction.doIt;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;
import javax.tools.ForwardingJavaFileManager;
import javax.tools.StandardJavaFileManager;

public class PreparedJavaFileManager
extends ForwardingJavaFileManager<StandardJavaFileManager> {

    private final Location artifactsLocation;

    private final ClassLoader artifactsLoader;

    public PreparedJavaFileManager(final StandardJavaFileManager manager, final Location location, final List<? extends File> artifacts)
    throws IOException {
        super(requireNonNull(manager));
        this.artifactsLocation = requireNonNull(location);
        manager.setLocation(location, requireNonNull(artifacts));
        final URL[] urls = artifacts.stream().map(File::toURI).map(doIt(URI::toURL)).toArray(URL[]::new);
        this.artifactsLoader = new URLClassLoader(urls, currentThread().getContextClassLoader());
    }

    @Override
    public ClassLoader getClassLoader(final Location location) {
        return this.artifactsLocation.equals(location) ? this.artifactsLoader : super.getClassLoader(location);
    }

}

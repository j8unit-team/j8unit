@REM http://mojo.codehaus.org/versions-maven-plugin/index.html
@REM http://stackoverflow.com/questions/11320481/bat-script-exits-unexpectedly

CALL mvn versions:display-dependency-updates > check-dependency-updates.log
CALL mvn versions:display-plugin-updates > check-plugin-updates.log
CALL mvn versions:display-property-updates > check-property-updates.log

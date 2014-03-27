# IzPack Illustration

This project could be used as an example to create an [IzPack](http://izpack.org/) installer for your maven module

## Maven modules
The sample project is organised as follows:

    izpack-seed
    +-application
    +-install
    |    \-package
    |    \-panel
    |    \-installer

### Application modules
A dummy application displaying a parameter in a log.

### Install modules
Unlike IzPack [wiki](http://docs.codehaus.org/display/IZPACK/Compiling+Using+Maven), for the sake of code organisation, this sample proposes an approach with 3 modules instead of 2 in IzPack documentation.

* an assembly module called __package__
* an additional __panel__ module
* an __IzPack installer__ module

Once built (mvn clean install), the installer will be generated under install/installer/target/izpack-seed-installer-${project.version}.jar
Execute the jar double cliking on it or executing java - jar izpack-seed-installer-${project.version}.jar
The installer is launched.

Finally to execute the application, go to its installation directory and run
`./run.sh "this is the text which will be logged"`
(run.sh should be executable)

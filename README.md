# IzPack Illustration

This project could be used as an example to create an [IzPack](http://izpack.org/) installer for your maven module

## Maven modules
The sample project is organised as follows:

    izpack-sample
    +-application
    +-install
    |    \-package
    |    \-panel
    |    \-installer

### Application modules
A dummy application displaying a parameter in a log.
Application will be run once installed as follows:

`./run.sh nameToBeLogged`

### Install modules
Unlike IzPack [wiki](http://docs.codehaus.org/display/IZPACK/Compiling+Using+Maven), for the sake of code organisation, this sample proposes an approach with 3 modules instead of 2 in IzPack documentation.

* an assembly module called __package__
* an additional __panel__ module
* an __IzPack installer__ module
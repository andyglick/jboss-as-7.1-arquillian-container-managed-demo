[![Build Status](https://travis-ci.org/andyglick/jboss-as-7.1-arquillian-container-managed-demo.svg?branch=master)](https://travis-ci.org/andyglick/jboss-as-7.1-arquillian-container-managed-demo)[![Dependency Status](https://www.versioneye.com/user/projects/57a62edd0f6400002c8da2cd/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/57a62edd0f6400002c8da2cd)
# Arquillian tests for JBoss AS 7.1 for EAP 6.4

started with an old copy of the Arquillian tutorial, which was working
fine executing and starting the Weld and Glassfish containers but which
wasn't even able to start JBoss AS in managed mode, let alone execute
injeted tests. After many hours of fussing with jars have been able to
startJBoss and execute a test in the container context.

Additionally have hooked Jacoco up to produce coverage reports.
Achieving slow but steady progress. Expect to investigate the
arquillian-showcase and look for potential tests to move to this project.

Because the JBoss AS start times are rather long, will probably wrap
tests in 1 or more JUnit test suites.

In the pom file have now created 2 profiles 1 for JBoss AS Managed and
another for JBoss AS Remote - am running the remote container locally,
but it isn't being managed by arquillian, where with the managed
container it is managed by arquillian

there is some cruft with the arquillian.xml file, right now have
configured it so that there is a block of XML for managed and another
block for remote and I turn each on or off depending upon which 1 I wish
to exercise. So you have to use a profile and possibly change the
contents of the arquillian.xml file to run the tests in either mode


had this next bit working for a while, but it stopped woking so I'll have
to take this up again

Additionally have hooked Jacoco up to produce coverage reports.



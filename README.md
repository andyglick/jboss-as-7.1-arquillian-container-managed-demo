[![Build Status](https://travis-ci.org/andyglick/jboss-as-7.1-arquillian-container-managed-demo.svg?branch=master)](https://travis-ci.org/andyglick/jboss-as-7.1-arquillian-container-managed-demo)[![Dependency Status](https://www.versioneye.com/user/projects/57a62edd0f6400002c8da2cd/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/57a62edd0f6400002c8da2cd)
# Arquillian tests for JBoss AS 7.1 for EAP 6.4

started with an old copy of the Arquillian tutorial, which was working
fine executing and starting the Weld and Glassfish containers but which
wasn't even able to start JBoss AS in managed mode, let alone execute
injeted tests. After many hours of fussing with jars have been able to start
JBoss and execute a test in the container context.

Additionally have hooked Jacoco up to produce coverage reports.

Achieving slow but steady progress. Expect to investigate the
arquillian-showcase and look for potential tests to move to this project.

Because the JBoss AS start times are rather long, will probably wrap
tests in 1 or more JUnit test suites.
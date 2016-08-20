#### ChangeLog

2016-08-19 bumped version to 1.0.1 -- created a tag -- the code as is
consistently runs the arquillian test in managed jboss mode 

2016-08-13 bumped more versions of jars
 
2016-08-07 set up the maven-enforcer plugin to enforce dependency
convergence and to enforce the "banned" libraries. Only allowing slf4j
and logback-classic as logging providers

2016-08-06 removed the profiles for weld and glassfish 

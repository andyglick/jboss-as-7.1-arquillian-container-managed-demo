package org.arquillian.example;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;

// @Excluded in pom.xml
@RunWith(Arquillian.class)
public class BasicClientTest {
  @Deployment(testable = false)
  public static WebArchive createDeployment() {
    return ShrinkWrap.create(WebArchive.class)
      .addClasses(MyBean.class)
      .setWebXML("WEB-INF/web.xml");
  }

  // @Test
  @Ignore // @ToDo this fails -- find out why
  public void should_login_successfully() {
  }
}

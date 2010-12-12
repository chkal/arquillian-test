package de.chkal.arquillian.test;

import org.jboss.arquillian.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class TestServletTest
{
   
   @Deployment
   public static WebArchive createTestArchive() {
      return ShrinkWrap.create(WebArchive.class, "app.war")
         .addClasses(TestServlet.class)
         .addWebResource("web.xml");
   }
   
   @Test
   public void testWebApp() {

      System.out.println("test");
      
   }

}

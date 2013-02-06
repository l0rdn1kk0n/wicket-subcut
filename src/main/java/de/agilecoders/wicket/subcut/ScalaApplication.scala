package de.agilecoders.wicket.subcut

import org.apache.wicket.protocol.http.WebApplication

/**
 * scala application object
 *
 * @author miha
 */
object ScalaApplication {

    /**
     * @return current active scala web application instance
     */
    def get = WebApplication.get().asInstanceOf[ScalaApplication]

}

/**
 * The scala web application
 */
class ScalaApplication extends WebApplication {

    /**
     * @return homepage class
     */
    override def getHomePage = classOf[HomePage]
}

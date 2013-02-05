package de.agilecoders.wicket.subcut

import org.apache.wicket.protocol.http.WebApplication

/**
 * TODO: document
 *
 * @author miha
 */
object ScalaApplication extends WebApplication {
    def getHomePage = classOf[HomePage]
}

package de.agilecoders.wicket.subcut

import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.markup.html.basic.Label
import com.escalatesoft.subcut.inject.{Injectable, BindingModule}
import de.agilecoders.wicket.subcut.ScalaApplication._
import org.wicketstuff.scala.ScalaWicket

/**
 * simple wicket page that shows a welcome message
 *
 * @author miha
 */
class HomePage(params: PageParameters)(implicit val bindingModule: BindingModule) extends WebPage(params) with Injectable with ScalaWicket {

    val message = injectOptional[String]('WelcomeMessage) getOrElse("something went wrong")
    add(new Label("message", message));

    /**
      * Construct.
     */
    def this() = this(new PageParameters())

}

package de.agilecoders.wicket.subcut

import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.markup.html.basic.Label

/**
 * simple wicket page that shows a welcome message
 *
 * @author miha
 */
class HomePage(params: PageParameters)
  extends WebPage(params) {

  add(new Label("message", new SubcutModel[String]('WelcomeMessage, "something went wrong")))

  def this() = this(new PageParameters())
}

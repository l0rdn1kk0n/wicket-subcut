package de.agilecoders.wicket.subcut

import org.apache.wicket.markup.html.WebPage
import org.apache.wicket.request.mapper.parameter.PageParameters
import org.apache.wicket.markup.html.basic.Label

/**
 * TODO: document
 *
 * @author miha
 */
class HomePage(params:PageParameters) extends WebPage(params) {
    add(new Label("message", "If you see this message wicket is properly configured and running"));
}

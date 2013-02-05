package de.agilecoders.wicket.subcut

import com.escalatesoft.subcut.inject.NewBindingModule

/**
 * simple binding module example
 *
 * @author miha
 */
object ConfigurationModule extends NewBindingModule( module => {
    import module._

    bind [String] idBy 'WelcomeMessage toSingle "If you see this message wicket and subcut are properly configured and running"
})
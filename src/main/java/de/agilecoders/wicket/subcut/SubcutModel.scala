package de.agilecoders.wicket.subcut

import org.apache.wicket.model.AbstractReadOnlyModel
import com.escalatesoft.subcut.inject.{Injectable, BindingModule}

/**
 *
 */
class SubcutModel[T](name: Symbol, default: T)(implicit val bindingModule: BindingModule, implicit val ev: Manifest[T])
  extends AbstractReadOnlyModel[T]
  with Injectable {

  def getObject = {
    injectOptional[T](name) getOrElse(default)
  }
}

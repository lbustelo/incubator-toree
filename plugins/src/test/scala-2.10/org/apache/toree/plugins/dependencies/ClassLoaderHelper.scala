package org.apache.toree.plugins.dependencies

import java.lang.{ClassLoader => JClassLoader}
import java.net.URL

/**
  * Created by mariu on 2016-07-16.
  */
object ClassLoaderHelper {

  def URLClassLoader(urls: Seq[URL], parent: JClassLoader) = {
    new scala.reflect.internal.util.ScalaClassLoader.URLClassLoader(urls, parent)
  }
}

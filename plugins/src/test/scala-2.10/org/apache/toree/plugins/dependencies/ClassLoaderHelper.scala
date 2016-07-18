package org.apache.toree.plugins.dependencies

import java.lang.{ClassLoader => JClassLoader}
import java.net.URL

import scala.tools.nsc.util.ScalaClassLoader.URLClassLoader

/**
  * Created by mariu on 2016-07-16.
  */
object ClassLoaderHelper {

  def URLClassLoader(urls: Seq[URL], parent: JClassLoader) = {
    new URLClassLoader(urls, parent)
  }
}

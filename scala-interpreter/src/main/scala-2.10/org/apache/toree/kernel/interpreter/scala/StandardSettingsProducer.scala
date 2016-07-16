package org.apache.toree.kernel.interpreter.scala

import org.apache.spark.repl.SparkCommandLine

/**
  * Created by mniekerk on 7/15/16.
  */


trait StandardSettingsProducer extends SettingsProducerLike {
  override def newSettings(args: List[String]): Settings =
    new SparkCommandLine(args).settings
}

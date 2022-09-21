package com.anglypascal.scalite.plugins

import com.anglypascal.scalite.plugins.Plugin
import com.anglypascal.scalite.converters.Converter
import com.anglypascal.scalite.converters.ConverterConstructor
import com.anglypascal.scalite.data.immutable.DObj

class Textile(
    protected val configs: DObj,
    protected val globals: DObj
) extends Converter:

  object Defaults:
    val filetype = "textile"
    val extensions = "textile"
    val outputExt = ".html"

  def fileType: String = configs.getOrElse("fileType")(Defaults.filetype)

  def extensions: String = configs.getOrElse("extensions")(Defaults.extensions)

  def outputExt: String = configs.getOrElse("outputExt")(Defaults.outputExt)

  def convert(str: String, filepath: String): String = str

object Textile extends ConverterConstructor:
  val constructorName: String = "textile"
  def apply(configs: DObj, globals: DObj) =
    new Textile(configs, globals)


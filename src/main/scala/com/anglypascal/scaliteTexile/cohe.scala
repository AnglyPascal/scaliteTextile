package com.anglypascal.scalite.plugins

import com.anglypascal.scalite.collections.PostLike
import com.anglypascal.scalite.trees.TreeStyle
import com.anglypascal.scalite.trees.Tree
import com.anglypascal.scalite.data.immutable.{DObj => IObj}
import com.anglypascal.scalite.data.mutable.DArr
import com.anglypascal.scalite.data.mutable.DStr
import com.anglypascal.scalite.data.mutable.Data
import com.anglypascal.scalite.data.mutable.{DObj => MObj}

// abstract class TreeStyle[A <: Renderable](val styleName: String) extends Plugin:
//   def apply(treeType: String)(configs: MObj, globals: IObj): Tree[A]

object MapStyle extends TreeStyle[PostLike]("map"):
  def apply(treeType: String)(configs: MObj, globals: IObj): Tree[PostLike] = ???


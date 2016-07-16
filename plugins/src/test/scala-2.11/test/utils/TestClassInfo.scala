package test.utils

import org.clapper.classutil._
import java.io.File

import org.clapper.classutil.Modifier.Modifier

case class TestClassInfo(
  superClassName: String = "",
  interfaces: List[String] = Nil,
  location: File = null,
  methods: Set[MethodInfo] = Set(),
  fields: Set[FieldInfo] = Set(),
  signature: String = "",
  annotations: Set[AnnotationInfo] = Set(),
  modifiers: Set[Modifier] = Set(),
  name: String = ""
) extends ClassInfo

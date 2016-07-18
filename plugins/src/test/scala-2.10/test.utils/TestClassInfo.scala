package test.utils

import org.clapper.classutil._
import org.clapper.classutil.Modifier.Modifier
import java.io.File

case class TestClassInfo(
  superClassName: String = "",
  interfaces: List[String] = Nil,
  location: File = null,
  methods: Set[MethodInfo] = Set(),
  fields: Set[FieldInfo] = Set(),
  signature: String = "",
  modifiers: Set[Modifier] = Set(),
  name: String = "",
  annotations: Set[AnnotationInfo] = Set()
) extends ClassInfo
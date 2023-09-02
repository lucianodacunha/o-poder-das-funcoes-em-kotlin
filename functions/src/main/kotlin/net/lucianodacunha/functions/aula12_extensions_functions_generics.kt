package net.lucianodacunha.functions

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1
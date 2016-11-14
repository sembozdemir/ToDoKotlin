package com.sembozdemir.todokotlin.extensions

import android.widget.EditText

fun EditText.asString(): String = this.text.toString()

fun EditText.clear() {
    setText("")
}
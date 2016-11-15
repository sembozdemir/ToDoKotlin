package com.sembozdemir.todokotlin.extensions

import android.support.v7.widget.DividerItemDecoration
import android.widget.EditText
import android.widget.LinearLayout
import org.jetbrains.anko.recyclerview.v7._RecyclerView

fun EditText.asString(): String = this.text.toString()

fun EditText.clear() {
    setText("")
}

fun _RecyclerView.defaultDivider() {
    addItemDecoration(DividerItemDecoration(context, LinearLayout.VERTICAL))
}
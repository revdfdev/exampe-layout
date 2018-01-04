package com.webcubictechnologies.remitnow.ui

import com.webcubictechnologies.remitnow.acitivities.ExampleActivity
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.dip
import org.jetbrains.anko.matchParent


/**
 * Created by webcubictech2 on 4/1/18.
 */
class ExampleLayout: AnkoComponent<ExampleActivity> {


    override fun createView(ui: AnkoContext<ExampleActivity>) = with(ui) {
        coordinatorLayout {
            appBarLayout {

            }

            lparams {
                width = matchParent
                height = matchParent
            }
        }
    }

}
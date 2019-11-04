package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.ui

import android.view.ViewGroup
import android.widget.LinearLayout
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.R
import org.jetbrains.anko.*

class TeamUI : AnkoComponent<ViewGroup>{
    override fun createView(ui: AnkoContext<ViewGroup>) =  with(ui) {
        linearLayout{
            lparams(width= matchParent, height = wrapContent)
            padding = dip(16)
            orientation = LinearLayout.HORIZONTAL

            imageView{
                id = R.id.team_badge
            }.lparams {
                height = dip(50)
                width = dip(50)
            }

            textView{
                id = R.id.team_name
                textSize = 26f
            }.lparams{
                margin = dip(15)
            }
        }
    }

}
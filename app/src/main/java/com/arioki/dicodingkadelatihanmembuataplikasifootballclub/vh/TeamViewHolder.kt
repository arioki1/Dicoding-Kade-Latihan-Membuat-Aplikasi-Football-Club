/*
 * Copyright (c) 2019
 * Created by Yoga Setiawan 11/5/19 7:02 AM
 * github.com/arioki1
 */

package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.vh

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.R
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.model.Team
import com.squareup.picasso.Picasso
import org.jetbrains.anko.find

class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val teamBadge: ImageView = view.find(R.id.team_badge)
    private val teamName: TextView = view.find(R.id.team_name)

    fun bindItem(teams: Team) {
        Picasso.get().load(teams.teamBadge).fit().into(teamBadge)
        teamName.text = teams.teamName
    }
}

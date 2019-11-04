package com.arioki.dicodingkadelatihanmembuataplikasifootballclub

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
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

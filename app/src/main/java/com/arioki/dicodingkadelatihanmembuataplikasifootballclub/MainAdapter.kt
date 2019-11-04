package com.arioki.dicodingkadelatihanmembuataplikasifootballclub

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.AnkoContext

class MainAdapter (private val teams: List<Team>)
    : RecyclerView.Adapter<TeamViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        return TeamViewHolder(TeamUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bindItem(teams[position])
    }

}
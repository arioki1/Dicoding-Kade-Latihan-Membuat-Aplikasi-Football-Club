/*
 * Copyright (c) 2019
 * Created by Yoga Setiawan 11/5/19 7:02 AM
 * github.com/arioki1
 */

package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.main

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.model.Team
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.ui.TeamUI
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.vh.TeamViewHolder
import org.jetbrains.anko.AnkoContext

class MainAdapter (private val teams: List<Team>) : RecyclerView.Adapter<TeamViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        return TeamViewHolder(
            TeamUI().createView(
                AnkoContext.create(parent.context, parent)
            )
        )
    }

    override fun getItemCount(): Int {
        return teams.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bindItem(teams[position])
    }

}
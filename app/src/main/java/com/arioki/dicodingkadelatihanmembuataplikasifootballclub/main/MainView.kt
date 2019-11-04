package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.main

import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.model.Team

interface MainView{
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}

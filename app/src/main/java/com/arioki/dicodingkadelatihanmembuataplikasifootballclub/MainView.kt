package com.arioki.dicodingkadelatihanmembuataplikasifootballclub

interface MainView{
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}

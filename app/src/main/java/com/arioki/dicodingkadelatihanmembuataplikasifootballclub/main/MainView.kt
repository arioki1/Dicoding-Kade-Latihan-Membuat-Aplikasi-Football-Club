/*
 * Copyright (c) 2019
 * Created by Yoga Setiawan 11/5/19 7:02 AM
 * github.com/arioki1
 */

package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.main

import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.model.Team

interface MainView{
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}

/*
 * Copyright (c) 2019
 * Created by Yoga Setiawan 11/5/19 7:02 AM
 * github.com/arioki1
 */

package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.main

import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.api.ApiRepository
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.api.TheSportDBApi
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.model.TeamResponse
import com.google.gson.Gson
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(
    private val view: MainView,
    private val apiRepository: ApiRepository,
    private val gson: Gson
) {
    fun getTeamList(league: String?) {
        view.showLoading()
        doAsync {
            val data = gson.fromJson(
                apiRepository
                    .doRequest(TheSportDBApi.getTeams(league)),
                TeamResponse::class.java
            )
            uiThread{
                view.hideLoading()
                view.showTeamList(data.teams)
            }
        }
    }
}
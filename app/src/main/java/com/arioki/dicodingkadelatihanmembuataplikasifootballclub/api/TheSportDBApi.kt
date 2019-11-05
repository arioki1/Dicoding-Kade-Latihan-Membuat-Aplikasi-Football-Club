/*
 * Copyright (c) 2019
 * Created by Yoga Setiawan 11/5/19 7:02 AM
 * github.com/arioki1
 */

package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.api

import android.net.Uri
import com.arioki.dicodingkadelatihanmembuataplikasifootballclub.BuildConfig

object TheSportDBApi {
    fun getTeams(league:String?):String{
        //return BuildConfig.BASE_URL + "api/v1/json/${BuildConfig.TSDB_API_KEY}" + "/search_all_teams.php?l=" + league
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
            .appendPath("api")
            .appendPath("v1")
            .appendPath("json")
            .appendPath(BuildConfig.TSDB_API_KEY)
            .appendPath("search_all_teams.php")
            .appendQueryParameter("l", league)
            .build()
            .toString()
    }
}
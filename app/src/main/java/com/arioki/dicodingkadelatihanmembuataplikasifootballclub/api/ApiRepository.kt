/*
 * Copyright (c) 2019
 * Created by Yoga Setiawan 11/5/19 7:02 AM
 * github.com/arioki1
 */

package com.arioki.dicodingkadelatihanmembuataplikasifootballclub.api
import java.net.URL

class ApiRepository {
    fun doRequest(url:String): String{
        return URL(url).readText()
    }
}
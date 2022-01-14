package com.mwsp.countrycase.services

import com.mwsp.countrycase.models.MyCountry
import retrofit2.Call
import retrofit2.http.GET

interface CountryService {
    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}
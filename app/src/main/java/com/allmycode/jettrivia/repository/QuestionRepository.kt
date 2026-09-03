package com.allmycode.jettrivia.repository

import android.util.Log
import com.allmycode.jettrivia.data.DataOrException
import com.allmycode.jettrivia.model.QuestionItem
import com.allmycode.jettrivia.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi) {
    private val dataOrException =
        DataOrException<ArrayList<QuestionItem>,
            Boolean,
            Exception>()

    suspend fun getAllQuestions(): DataOrException<ArrayList<QuestionItem>, Boolean, Exception> {
        try {
            dataOrException.loading = true
            dataOrException.dataField = api.getAllQuestions()
            if (dataOrException.dataField.toString().isNotEmpty()) {
                dataOrException.loading = false
            }
        } catch (exception: Exception) {
            dataOrException.e = exception
            Log.d("Exception", "${dataOrException.e!!.localizedMessage}")
        }
        return dataOrException
    }
}
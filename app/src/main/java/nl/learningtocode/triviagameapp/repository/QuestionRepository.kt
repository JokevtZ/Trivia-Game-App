package nl.learningtocode.triviagameapp.repository

import android.util.Log
import nl.learningtocode.triviagameapp.data.DataOrException
import nl.learningtocode.triviagameapp.model.Question
import nl.learningtocode.triviagameapp.network.QuestionApi
import javax.inject.Inject

class QuestionRepository @Inject constructor(private val api: QuestionApi){
    private val dataOrException = DataOrException <Question, Boolean,Exception>()

    suspend fun getAllQuestions() : DataOrException<Question, Boolean, Exception>{
            try{
                dataOrException.loading = true
                dataOrException.data = api.getAllQuestions()

                if (dataOrException.data.toString().isNotEmpty()) dataOrException.loading = false

            }catch (exception: Exception){
                dataOrException.e = exception
                Log.d("Exception", "getAllQuestions: ${dataOrException.e!!.localizedMessage}")
            }
            return dataOrException
        }

}
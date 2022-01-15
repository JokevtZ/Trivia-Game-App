package nl.learningtocode.triviagameapp.network

import com.google.gson.annotations.SerializedName
import nl.learningtocode.triviagameapp.model.Question
import nl.learningtocode.triviagameapp.util.Constants.BASE_URL
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET(BASE_URL)
    suspend fun getAllQuestions(): Question
}
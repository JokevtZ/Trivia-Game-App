package nl.learningtocode.triviagameapp.network

import nl.learningtocode.triviagameapp.model.Question
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("animal.json")
    suspend fun getAllQuestions(): Question
}
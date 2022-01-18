package nl.learningtocode.triviagameapp.network

import nl.learningtocode.triviagameapp.model.Question
import nl.learningtocode.triviagameapp.util.Constants.BASE_URL
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface QuestionApi {
    @GET("Trivia_animal.json")
    suspend fun getAllQuestions(): Question
}
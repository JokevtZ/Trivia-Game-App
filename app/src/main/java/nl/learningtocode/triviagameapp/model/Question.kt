package nl.learningtocode.triviagameapp.model

data class Question(
    val response_code: Int,
    val results: List<Result>
)
package nl.learningtocode.triviagameapp.model

data class QuestionItem(
    val category: String,
    val correct_answer: String,
    val difficulty: String,
    val incorrect_answers: List<String>,
    val question: String,
    val type: String
)
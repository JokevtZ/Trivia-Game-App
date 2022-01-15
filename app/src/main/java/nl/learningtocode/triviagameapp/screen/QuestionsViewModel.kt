package nl.learningtocode.triviagameapp.screen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import dagger.hilt.android.lifecycle.HiltViewModel
import nl.learningtocode.triviagameapp.data.DataOrException
import nl.learningtocode.triviagameapp.model.Question
import nl.learningtocode.triviagameapp.repository.QuestionRepository
import javax.inject.Inject

@HiltViewModel
class QuestionsViewModel  @Inject constructor(private val repository: QuestionRepository){

    val data : MutableState<DataOrException<Question, Boolean, Exception>> = mutableStateOf(
        DataOrException(null, true, Exception(""))
    )
}
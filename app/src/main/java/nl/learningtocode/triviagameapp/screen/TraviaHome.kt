package nl.learningtocode.triviagameapp.screen

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import nl.learningtocode.triviagameapp.component.Questions

@Composable
fun TriviaHome(viewModel: QuestionsViewModel = hiltViewModel()){
    Questions(viewModel)
}

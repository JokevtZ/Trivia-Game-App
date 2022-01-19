package nl.learningtocode.triviagameapp.component

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import nl.learningtocode.triviagameapp.screen.QuestionsViewModel
import nl.learningtocode.triviagameapp.util.AppColors


// Handling all questions from json file from web link
@Composable
fun Questions(viewModel: QuestionsViewModel){
    val question = viewModel.data.value.data?.toMutableList()
    if (viewModel.data.value.loading == true){
        Log.d("Loading", "Questions: Loading...")
    }else {
        Log.d("Loading", "Questions: Loading Stopped!!")
        question?.forEach { questionItem ->
            Log.d("Result", "Questions: ${questionItem.question}")
        }
    }
    Log.d("SIZE", "Question: ${question?.size}")
}

//@Preview
@Composable
fun QuestionDisplay(){
    Surface(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(4.dp),
            color = AppColors.mDarkPurple)
    {
        Column(modifier = Modifier
            .padding(12.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start)
        {

        }
    }
}

@Preview
@Composable
fun QuestionTracker(counter : Int = 0,
                    outOf: Int = 25){
    Text(text = buildAnnotatedString {
        withStyle(style = ParagraphStyle(textIndent = TextIndent.None)) {
            withStyle(
                style = SpanStyle(
                    color = AppColors.mLightGray,
                    fontWeight = FontWeight.Bold,
                    fontSize = 27.sp) )
            {
            append("Question $counter/")

                withStyle(style = SpanStyle(
                    color = AppColors.mLightGray,
                fontWeight = FontWeight.Light,
                fontSize = 14.sp)){
                    append("$outOf")
                }

            }
        }
    })
}

package tech.mobiledeveloper.features.create

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun CreatePostScreen(
    viewModel: CreatePostViewModel = viewModel { CreatePostViewModel() }
) {
    val viewState by viewModel.viewStates().collectAsState()
    val viewAction by viewModel.viewActions().collectAsState(null)
    
    CreatePostView(viewState) {
        
    }
}
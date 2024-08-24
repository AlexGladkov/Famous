package tech.mobiledeveloper

import androidx.compose.ui.test.*
import tech.mobiledeveloper.features.create.CreatePostView
import tech.mobiledeveloper.features.create.models.CreatePostEvent
import tech.mobiledeveloper.features.create.models.CreatePostViewState
import kotlin.test.Test

class CreatePostViewTest {

    class CreatePostViewTest {

        @OptIn(ExperimentalTestApi::class)
        @Test
        fun testCreatePostView() = runComposeUiTest {
            // Given
            val viewState = CreatePostViewState()
            val eventHandler: (CreatePostEvent) -> Unit = {}

            // When
            setContent {
                CreatePostView(viewState, eventHandler)
            }

            onNodeWithTag("TextField").apply {
                performTextInput("Test Text")
            }

            onNodeWithTag("TextField").apply {
                assertTextEquals("Test Text")
            }
        }
    }
}
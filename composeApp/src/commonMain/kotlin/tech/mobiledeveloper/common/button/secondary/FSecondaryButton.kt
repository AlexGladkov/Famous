package tech.mobiledeveloper.common.button.secondary

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import tech.mobiledeveloper.theme.AppTheme
import tech.mobiledeveloper.theme.FamousColors
import tech.mobiledeveloper.theme.FamousTheme

@Composable
fun FSecondaryButton(
    modifier: Modifier = Modifier,
    text: String,
    enabled: Boolean = true,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.height(40.dp),
        onClick = onClick,
        enabled = enabled,
        shape = RoundedCornerShape(12.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = FamousTheme.colors.secondaryBackground,
            disabledBackgroundColor = FamousTheme.colors.secondaryBackground
        )
    ) {
        Text(
            text = text,
            color = if (enabled) FamousTheme.colors.primaryText else FamousTheme.colors.tintColor,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
@Preview
internal fun FSecondaryButton_Preview() {
    AppTheme {
        Column {
            FSecondaryButton(
                modifier = Modifier.padding(16.dp).fillMaxWidth(),
                text = "Subscribe",
                enabled = true
            ) {
    
            }
            
            FSecondaryButton(
                modifier = Modifier.padding(16.dp).fillMaxWidth(),
                text = "Subscribe",
                enabled = false
            ) {
    
            }
        }
    }
}
package tech.mobiledeveloper.features.feed.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import tech.mobiledeveloper.features.feed.views.model.FilterCellModel
import tech.mobiledeveloper.theme.FamousTheme

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun ItemFilterCell(filterCellModel: FilterCellModel, onClick: () -> Unit) {

    Chip(
        modifier = Modifier.padding(horizontal = 6.dp),
        onClick = onClick,
        colors = ChipDefaults.chipColors(
            backgroundColor =
            if (filterCellModel.isSelected)
                FamousTheme.colors.tintColor
            else
                FamousTheme.colors.secondaryBackground
        )
    ) {

        Text(
            text = filterCellModel.text,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            color = FamousTheme.colors.primaryText
        )
    }
}
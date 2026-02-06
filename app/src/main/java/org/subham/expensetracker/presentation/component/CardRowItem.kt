package org.subham.expensetracker.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardRowItem(
    modifier: Modifier = Modifier,
    title: String,
    amount: String,
    image: Int
) {
    Column(
        modifier = modifier
    ){
        Row {
            Image(
                painter = painterResource(id = image),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.size(8.dp))
            Text(
                text = title,
                fontSize = 16.sp,
                color = Color.White
            )
        }
        Text(
            text = amount,
            fontSize = 20.sp,
            color = Color.White
        )
    }
}
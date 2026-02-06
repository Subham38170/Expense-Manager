package org.subham.expensetracker.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.subham.expensetracker.R
import org.subham.expensetracker.ui.theme.Zinc

@Preview(showBackground = true)
@Composable
fun CardItem(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxWidth()
            .height(200.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(Zinc)
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = "Total Balance",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.White
                )
                Text(
                    text = "$ 5000",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
            }
            Image(
                painter = painterResource(id = R.drawable.dots_menu),
                contentDescription = "",
                modifier = Modifier
                    .padding(vertical = 4.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextWithPrefixIcon(
                text = "Income",
                painter = painterResource(id = R.drawable.ic_income)
            )
            TextWithPrefixIcon(
                text = "Expense",
                painter = painterResource(id = R.drawable.ic_expense)
            )

        }
    }
}

@Composable
private fun TextWithPrefixIcon(
    modifier: Modifier = Modifier,
    text: String,
    painter: Painter
) {
    Column(
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painter,
                contentDescription = text
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = text,
                style = MaterialTheme.typography.bodyLarge,
                color = Color.White
            )
        }
        Text(
            text = "$ 5000",
            style = MaterialTheme.typography.titleLarge,
            color = Color.White
        )
    }
}
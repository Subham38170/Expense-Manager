package org.subham.expensetracker.presentation.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import org.subham.expensetracker.R
import org.subham.expensetracker.presentation.component.CardItem

@Composable
fun HomeScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
        ) {
            val (nameRow, list, card, topBar) = createRefs()
            Image(
                painter = painterResource(id = R.drawable.ic_topbar),
                contentDescription = "Top app bar",
                modifier = Modifier
                    .constrainAs(topBar) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 32.dp, start = 16.dp, end = 16.dp)
                    .constrainAs(nameRow) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        text = "Good Afternoon",
                        fontSize = 16.sp,
                        color = Color.White
                    )


                    Text(
                        text = "Subham",
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )

                }
                Image(
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = "Notification Icon"
                )

            }
            CardItem(
                modifier = Modifier
                    .constrainAs(card) {
                        top.linkTo(nameRow.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            )
            TransactionList(
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(list) {
                        top.linkTo(card.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                        height = Dimension.fillToConstraints
                    }
            )


        }


    }

}

@Preview
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}

@Composable
private fun TransactionList(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .padding(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Recent Transactions",
                fontSize = 20.sp
            )
            Text(
                text = "See All",
                fontSize = 16.sp,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
            )
        }
        TransactionItem(
            title = "Netflix",
            amount = "$ 554",
            icon = R.drawable.ic_netflix,
            date = "Today",
            color = Color.Red
        )
        TransactionItem(
            title = "Netflix",
            amount = "$ 554",
            icon = R.drawable.ic_netflix,
            date = "Today",
            color = Color.Red
        )
        TransactionItem(
            title = "Netflix",
            amount = "$ 554",
            icon = R.drawable.ic_netflix,
            date = "Today",
            color = Color.Red
        )
    }
}

@Composable
private fun TransactionItem(
    title: String,
    amount: String,
    icon: Int,
    date: String,
    color: Color
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = icon),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.size(8.dp))
            Column {
                Text(
                    text = title,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = date,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
        Text(
            text = amount,
            fontSize = 16.sp,
            modifier = Modifier
                .align(Alignment.CenterEnd),
            color = color
        )
    }

}
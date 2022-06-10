package com.example.calculatorcomposeapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorcomposeapp.ui.theme.LightGray
import com.example.calculatorcomposeapp.ui.theme.MediumGray
import com.example.calculatorcomposeapp.ui.theme.Orange

@Composable
fun Calculator(
    state: CalculatorState,
    buttonSpacing: Dp = 8.dp,
    modifier: Modifier = Modifier,
    onAction: (CalculatorActions) -> Unit
) {
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {
            Text(
                text = state.number1 + (state.operation?.symbol ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth(),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = { onAction(CalculatorActions.Clear) }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Delete) }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Divide)) }
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "7",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(7)) }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(8)) }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(9)) }
                )
                CalculatorButton(
                    symbol = "x",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Multiply)) }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "4",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(4)) }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(5)) }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(6)) }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Subtract)) }
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "1",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(1)) }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(2)) }

                )
                CalculatorButton(
                    symbol = "3",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Number(3)) }

                )
                CalculatorButton(
                    symbol = "+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Operation(CalculatorOperation.Add)) }

                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ) {
                CalculatorButton(
                    symbol = "0",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = { onAction(CalculatorActions.Number(0)) }

                )
                CalculatorButton(
                    symbol = ".",
                    modifier = Modifier
                        .background(MediumGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Decimal) }

                )
                CalculatorButton(
                    symbol = "=",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = { onAction(CalculatorActions.Calculate) }

                )
            }
        }
    }
}
package com.example.base_kotlin.combustion.ui.list

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.base_kotlin.combustion.design.colors.Colors
import com.example.base_kotlin.combustion.design.spacing.Spacing
import com.example.base_kotlin.combustion.design.typography.Typography


@Composable
fun ListItem(
    title: Unit,
    contentName: String,
    contentDetail: String,
    value:String,
    detailValue: String,
    modifier: Modifier = Modifier) {

//    ConstraintLayout(modifier = modifier.fillMaxWidth()) {
//        val (title,contentName,contentDetail,value,detailValue,layoutContent,layoutValue) = createRefs()
//
//        title
//
//        Row(modifier = Modifier.constrainAs(layoutContent) {
//            top.linkTo(title.bottom, margin = 4.dp)
//            start.linkTo(title.start)
//        }) {
//            Text(text = contentName.toString())
//            Spacing().compact
//            Text(text = contentDetail.toString())
//
//        }
//        Row(modifier = Modifier.constrainAs(layoutValue) {
//            top.linkTo(title.bottom, margin = 4.dp)
//            start.linkTo(title.start)
//        }) {
//            Text(text = value.toString())
//            Spacing().compact
//            Text(text = detailValue.toString())
//        }
//    }

}
package com.example.noteapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.noteapp.ui.theme.NoteAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddNoteScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "New Note") },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White,
                    actionIconContentColor = Color.White
                )
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedTextField(
                    value = TextFieldValue(""),
                    onValueChange = { },
                    label = { Text("Note Title") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp),
                )


                OutlinedTextField(
                    value = TextFieldValue(""),
                    onValueChange = { },
                    label = { Text("Note Content") },
                    modifier = Modifier.fillMaxWidth(),
                    maxLines = 10
                )


                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ) {
                    Text(text = "Save Note")
                }
            }
        }
    )
}

@Preview(showBackground = true, name = "My Preview", showSystemUi = true, device = Devices.PIXEL_4_XL)
@Composable
fun AddNoteScreenPreview() {
    NoteAppTheme {
        AddNoteScreen()
    }
}

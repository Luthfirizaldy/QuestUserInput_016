package com.example.tugaslima

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun MainScreen(
    modifier: Modifier = Modifier
){

    var name by rememberSaveable { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var noHP by remember { mutableStateOf("") }
    var selectedGender by remember { mutableStateOf("") }

    val jenisKelamin = listOf("Laki-Laki","Perempuan")

    var nameUser by rememberSaveable { mutableStateOf("") }
    var emailUser by remember { mutableStateOf("") }
    var alamatUser by remember { mutableStateOf("") }
    var noHPUser by remember { mutableStateOf("") }
    var selectedGenderUser by remember { mutableStateOf("") }

    Column (Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally){
        OutlinedTextField(value = name, onValueChange = {name = it},
            placeholder = { Text("Masukan Nama") },
            label = { Text("Name") },
            modifier = Modifier.fillMaxWidth().padding(5.dp) )

        Row (){
            jenisKelamin.forEach { item ->
                Row(verticalAlignment = Alignment.CenterVertically) { RadioButton(selected = selectedGender == item,
                    onClick = {
                            selectedGender = item
                })
                Text(item)
                }
            }
        }

        OutlinedTextField(value = email, onValueChange = {email = it},
            placeholder = { Text("Masukan Email") },
            label = { Text("email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            modifier = Modifier.fillMaxWidth().padding(5.dp) )

        OutlinedTextField(value = alamat, onValueChange = {alamat = it},
            placeholder = { Text("Masukan Alamat") },
            label = { Text("Alamat") },
            modifier = Modifier.fillMaxWidth().padding(5.dp) )

        OutlinedTextField(value = noHP, onValueChange = {noHP = it},
            placeholder = { Text("Masukan NoHP") },
            label = { Text("NoHP") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth().padding(5.dp) )

        Button(onClick = {

        }){
            Text("Simpan")
        }



    }
}

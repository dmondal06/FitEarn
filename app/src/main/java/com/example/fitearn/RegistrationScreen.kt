//Registration Page
package com.example.fitearn

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fitearn.ui.theme.FitEarnTheme

@Composable
fun RegistrationPage(navController: NavController){

    var firstNameState by remember { mutableStateOf("") }
    var lastNameState by remember {mutableStateOf("")}
    var emailState by remember {mutableStateOf("")}
    var passwordState by remember {mutableStateOf("")}
    var termCondition by remember { mutableStateOf(false) }
    var passwordVisible by remember { mutableStateOf(false)}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(201, 1, 254),
                        Color(0, 76, 249)
                    )
                )
            )
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Spacer(modifier = Modifier.padding(vertical = 100.dp))

        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 40.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ){
            Text(
                text = "Sign up",
                color = Color(255, 152, 0, 255),
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(end = 10.dp)
            )

            Text(
                text = "Sign in",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier.clickable {
                    navController.navigate("login")
                }
            )
        }

        Spacer(modifier = Modifier.padding(vertical = 50.dp))



        TextField(
            value = firstNameState,
            onValueChange = {firstNameState = it},
            textStyle = TextStyle(color = Color.White, fontSize = 20.sp),
            placeholder = {
                Text(
                    text = "First Name",
                    color = Color.White,
                    fontSize = 20.sp
                )},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                errorContainerColor = Color.Transparent,
                focusedIndicatorColor = Color(255, 152, 0, 255),
                unfocusedIndicatorColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),


            )

        Spacer(modifier=Modifier.padding(5.dp))

        TextField(
            value = lastNameState,
            onValueChange = {lastNameState = it},
            textStyle = TextStyle(color = Color.White, fontSize = 20.sp),
            placeholder = {
                Text(
                    text = "Last Name",
                    color = Color.White,
                    fontSize = 20.sp
                )},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                errorContainerColor = Color.Transparent,
                focusedIndicatorColor = Color(255, 152, 0, 255),
                unfocusedIndicatorColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        )

        Spacer(modifier=Modifier.padding(5.dp))

        TextField(
            value = emailState,
            onValueChange = {emailState = it},
            textStyle = TextStyle(color = Color.White, fontSize = 20.sp),
            placeholder = {
                Text(
                    text = "Email",
                    color = Color.White,
                    fontSize = 20.sp
                )},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                errorContainerColor = Color.Transparent,
                focusedIndicatorColor = Color(255, 152, 0, 255),
                unfocusedIndicatorColor = Color.White
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
        )

        Spacer(modifier=Modifier.padding(5.dp))

        TextField(
            value = passwordState,
            onValueChange = {passwordState = it},
            textStyle = TextStyle(color = Color.White, fontSize = 20.sp),
            placeholder = {
                Text(
                    text = "Password",
                    color = Color.White,
                    fontSize = 20.sp
                )},
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                disabledContainerColor = Color.Transparent,
                errorContainerColor = Color.Transparent,
                focusedIndicatorColor = Color(255, 152, 0, 255),
                unfocusedIndicatorColor = Color.White
            ),
            trailingIcon = {
                IconButton(
                    onClick = { passwordVisible = !passwordVisible}
                ) {
                    val iconChange = painterResource(id = if(passwordVisible) R.drawable.baseline_visibility_24 else R.drawable.baseline_visibility_off_24)
                    Icon(
                        painter = iconChange,
                        contentDescription = if (passwordVisible) "Show Password" else "Hide Password",
                        tint = Color.White

                    )
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp),
            visualTransformation =
            if (passwordVisible) VisualTransformation.None
            else PasswordVisualTransformation()
        )

        Spacer(modifier=Modifier.padding(5.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 25.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            Checkbox(
                checked = termCondition,
                onCheckedChange =  {termCondition = it},
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.White,
                    uncheckedColor = Color.White,
                    checkmarkColor = Color.White
                )
            )

            Text(
                text = "Agree with Terms & Conditions",
                color = Color.White,
                fontSize = 17.sp
            )
        }

        Spacer(modifier=Modifier.padding(15.dp))

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.White,
            ),
            modifier = Modifier.size(150.dp, 50.dp)

        ){
            Text(
                text = "Submit",
                color = Color(0, 76, 249),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        }



    }
}


@Preview(showBackground = true)
@Composable
fun PreviewRegistrationPage(){
    FitEarnTheme{
        RegistrationPage(navController = rememberNavController())
    }
}
Java.perform(function () {
    // Reference the target class
    var MainActivity = Java.use("com.example.trainingday4.MainActivity");

    // Reference the required classes for UI interaction
    var EditText = Java.use("android.widget.EditText");
    var Button = Java.use("android.widget.Button");

    // Set up the credentials
    var username = "user1";
    var password = "password1";
    console.log("here")
    // Intercept the login function
    MainActivity.login.implementation = function (view) {
        // Retrieve references to UI elements
        console.log("here1")
        var usernameEditText = EditText.$new(this.findViewById(R.id.usernameEditText));
        var passwordEditText = EditText.$new(this.findViewById(R.id.passwordEditText));
        var resultTextView = EditText.$new(this.findViewById(R.id.resultTextView));
        var loginButton = Button.$new(this.findViewById(R.id.loginButton));

        console.log("here11")
        // Enter the credentials
        usernameEditText.setText(username);
        passwordEditText.setText(password);

        // Perform the login action
        this.login(view);
        console.log("here111")
        // You can also log the result or perform additional actions
        console.log(resultTextView.getText());
        console.log("here1111")
    };
});



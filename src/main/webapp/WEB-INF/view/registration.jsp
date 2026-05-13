<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Registration Page</title>

  <style>
    body {
      font-family: Arial, sans-serif;
      background: #f2f2f2;
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
      margin: 0;
    }

    .register-box {
      background: white;
      padding: 25px;
      width: 320px;
      border-radius: 8px;
      box-shadow: 0 2px 8px rgba(0,0,0,0.1);
    }

    h2 {
      text-align: center;
      margin-bottom: 20px;
    }

    input {
      width: 100%;
      padding: 10px;
      margin: 8px 0;
      border: 1px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
    }

    button {
      width: 100%;
      padding: 10px;
      background: #28a745;
      color: white;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }

    button:hover {
      background: #218838;
    }
  </style>
</head>

<body>

  <div class="register-box">
    <h2>Register</h2>

    <form action = "registrationForm" method = "POST">
      <input type="text" placeholder="Full Name" name="fullName" />
      <input type="email" placeholder="Email" name="email" />
      <input type="number" placeholder="Phone Number" name="phone" />
      <input type="password" placeholder="Password" name="password" />
      <input type="submit" value="Register"/>
    </form>
  </div>

</body>
</html>
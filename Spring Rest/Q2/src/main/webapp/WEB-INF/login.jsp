<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<h2>
    ${message}
</h2>
<form action="submit" method="post">
    <table>
        <tr>
            <td>Username</td>
            <td><label>
                <input type="text" name="username" />
            </label></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><label>
                <input type="password" name="password" required/>
            </label></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Submit" required/></td>
        </tr>
    </table>
</form>
</body>
</html>
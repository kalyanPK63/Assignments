<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
<h2>
    ${message}
</h2>
<form action="/submit" method="post">
    <table>
        <tr>
            <td>ZIPCODE</td>
            <td><label>
                <input type="number" name="Zipcode" />
            </label></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="search" required/></td>
        </tr>
    </table>
</form>
</body>
</html>
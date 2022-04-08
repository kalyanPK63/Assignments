<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SI Calculator</title>
</head>
<body>
<form action="/calculate" method="post">
    <p>
        Principle Amount, P <input type="number" name="p" required/>
    </p>
    <p>
        Time, t <input type="number" name="t" required/>
    </p>
    <p>
        Rate of interest, r <input type="number" name="r" required/>
    </p>
    <p>
        <input type="submit" value="Run"/>
    </p>
</form>
</body>
</html>
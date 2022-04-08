<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>SI Calculator</title>
</head>
<body>
<form action="../calculate" method="get">
    <p>
        Principle Amount, P <label>
        <input type="number" name="p" required/>
    </label>
    </p>
    <p>
        No.of Years, t <label>
        <input type="number" name="t" required/>
    </label>
    </p>
    <p>
        Rate of interest, r <label>
        <input type="number" name="r" required/>
    </label>
    </p>
    <p>
        <input type="submit" value="Run"/>
    </p>
</form>
</body>
</html>
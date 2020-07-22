<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>

<head>
  <title>calculator</title>
  <style type="text/css">
    input, select, button {
      width: 5em;
      height: 3em;
    }
  </style>
</head>

<body>
  <h2>Calculator</h2><br>
  <form method=post action="/lab6/calc">
    <input type=text name=number1>
    <select name=operator>
      <option selected>+</option>
      <option>-</option>
      <option>*</option>
      <option>/</option>
    </select>
    <input type=text name=number2>
    <button type=submit>=</button>
  </form>
</body>

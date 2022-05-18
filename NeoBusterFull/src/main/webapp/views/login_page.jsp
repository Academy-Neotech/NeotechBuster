<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
   <h1>Login</h1>
   <c:if test="${not empty error}">
			<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
			<div class="msg">${msg}</div>
		</c:if>
   <form name='f' action='<c:url value="login"/>' method='POST'>
      <table>
         <tr>
            <td>User:</td>
            <td><input type='text' id="username" name='username' value=''></td>
         </tr>
         <tr>
            <td>Password:</td>
            <td><input type='password' id="password" name='password' /></td>
         </tr>
         <tr>
            <td><input name="submit" type="submit" value="submit" /></td>
         </tr>
      </table>
  </form>
</body>
</html>
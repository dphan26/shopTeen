

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/extras/spring-security">



<body >
		<h1>chao mung dopt login</h1>
   <form method="post" action="/signin">
            <input type="text" name="email" placeholder="Your email" /><br />
            <input type="password" name="password" placeholder="Your password" /><br />
            <button type="submit">Login</button> <br />
        </form>
   

</body>

</html>





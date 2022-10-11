<!DOCTYPE html>
<html>
<body>

<h2>Dear Employee , enter your details</h2> <%--//-заглавный текст--%>
<br>
<br><%--переход на новую строку--%>

<form action="showDetails" method="get">
    <input type="text"<%--//указывает тип введенного значения--%>
           name="employeeName"   <%--//имя, которое хранит введенное значение--%>
           placeholder="Write your name"/>   <%--//текст в поле ввода--%>
    <input type="submit"> <%--// отображение кнопки--%>

</form>

</body>
</html>

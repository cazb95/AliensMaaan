<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
 
 <p> If you are <c:out value="${param.earthAge}"/> years old on Earth, you are <c:out value="${arg0}"/> years old on <c:out value="${param.genre}"/>!</p>
 
 
 
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />
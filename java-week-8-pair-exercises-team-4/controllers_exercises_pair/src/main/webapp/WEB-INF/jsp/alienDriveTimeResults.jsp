<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
 <p>Using a <c:out value="${param.modeSelect}"/>, it would take you <c:out value="${driveTime}"/> years to travel from Earth to <c:out value="${param.planetName}"/>.
 You would be <c:out value="${newAge}"/> years old!</p> 
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />l>
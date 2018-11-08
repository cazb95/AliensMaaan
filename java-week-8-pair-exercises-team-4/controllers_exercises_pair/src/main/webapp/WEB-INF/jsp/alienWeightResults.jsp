<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<section id="main-content">
 <p> If your weight is <c:out value="${param.earthWeight}"/> lbs. on Earth, your weight would be <c:out value="${planetWeight}"/> lbs. on <c:out value="${param.genre}"/>.</p>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />tml>
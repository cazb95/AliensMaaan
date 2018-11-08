<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>


<meta name="viewport" content="width=device-width" />

<c:import url="/WEB-INF/jsp/common/header.jsp" />


<section id="intro-content">
    <h2>Welcome to the Alien Forum</h2>

    </div>
</section>

<section id="main-content">
    <h2 style="text-align:center">Solar System Geek Forum</h2>
		<c:forEach items="${forums}" var="post">
		 <div style="border-style: inset; background-color: #D3D3D3; margin-left:8%; margin-right:8%;">
		
		<div id="reviews" style="margin-left:20px">
		<div>
			<div id="heading" style="float:left; margin-left:3px;"><span><strong>Username: </strong></span>${post.username}</div><br/>
			<div id="heading" style="float:left; margin-left:3px;"><span><strong>Rating: </strong></span>${post.subject} Stars</div>
		</div><br>
		
		<fmt:parseDate value=" ${post.datePosted}" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime" type="both" />
 				<br><c:out value="${post.message}"/>
 				<br><br><div style="text-Align: right; padding-right:1%; font-size:75%;"><b>${parsedDateTime}</b></div>
 		</div>
 		</div>
 		<br><br>
		</c:forEach>
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp">
</c:import>
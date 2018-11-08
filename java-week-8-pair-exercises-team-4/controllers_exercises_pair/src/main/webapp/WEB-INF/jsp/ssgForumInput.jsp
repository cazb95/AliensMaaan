<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<c:import url="/WEB-INF/jsp/common/header.jsp" />
<section id="main-content">
    <h1 style = "color: black; text-align:center;">Solar System Geek Online Forum</h1>    
	<div style="border:solid; background-color: #D3D3D3; margin-right:15%; margin-left:15%; padding-bottom:10%; border-radius: 8%; text-Align: center;">
			<br><form  action="ssgForumInput" method="POST">
				<div class="formGroup">
					<span style="float:left; margin-left: 25%;" for="username" >Username: </span>
					<input style="float:right; margin-right: 30%;" type="text" name="username" id="username" required/>
				</div>
				<br>
				<div class="formGroup">
					<span style="float:left; margin-left: 25%;" for="subject">Subject: </span>
					<input  style="float:right; margin-right: 30%;" type=text name="subject" id="subject" required/>
				</div>	
				<br>
				<div class="formGroup">		
					<span style="float:left; margin-left: 25%;" for="message">Post: </span>
					<input style="float:right; margin-right: 30%;" type="text" name="message" id="message" required/>
				</div>	
				<br>
			<div class="formGroup">
					<input style="float:right; margin-right: 30%;" type="submit" value="Submit!" required/>
				</div>	
			</form>
		</div>
<br>
<br>
    
</section>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />